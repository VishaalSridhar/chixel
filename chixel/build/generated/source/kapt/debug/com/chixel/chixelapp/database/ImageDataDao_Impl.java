package com.chixel.chixelapp.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ImageDataDao_Impl implements ImageDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ImageData> __insertionAdapterOfImageData;

  private final ImageDataConverter __imageDataConverter = new ImageDataConverter();

  private final EntityInsertionAdapter<CanvasBitmapData> __insertionAdapterOfCanvasBitmapData;

  private final EntityDeletionOrUpdateAdapter<ImageData> __updateAdapterOfImageData;

  private final SharedSQLiteStatement __preparedStmtOfDeleteImageData;

  public ImageDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfImageData = new EntityInsertionAdapter<ImageData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `ImageData` (`id`,`pictureName`,`colorOne`,`colorTwo`,`date`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ImageData value) {
        final String _tmp;
        _tmp = __imageDataConverter.fromUUID(value.getId());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getPictureName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPictureName());
        }
        if (value.getColorOne() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getColorOne());
        }
        if (value.getColorTwo() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getColorTwo());
        }
        final Long _tmp_1;
        _tmp_1 = __imageDataConverter.fromDate(value.getDate());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp_1);
        }
      }
    };
    this.__insertionAdapterOfCanvasBitmapData = new EntityInsertionAdapter<CanvasBitmapData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `CanvasBitmapData` (`bitmapData`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CanvasBitmapData value) {
        if (value.getBitmapData() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getBitmapData());
        }
      }
    };
    this.__updateAdapterOfImageData = new EntityDeletionOrUpdateAdapter<ImageData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `ImageData` SET `id` = ?,`pictureName` = ?,`colorOne` = ?,`colorTwo` = ?,`date` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ImageData value) {
        final String _tmp;
        _tmp = __imageDataConverter.fromUUID(value.getId());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getPictureName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPictureName());
        }
        if (value.getColorOne() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getColorOne());
        }
        if (value.getColorTwo() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getColorTwo());
        }
        final Long _tmp_1;
        _tmp_1 = __imageDataConverter.fromDate(value.getDate());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __imageDataConverter.fromUUID(value.getId());
        if (_tmp_2 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_2);
        }
      }
    };
    this.__preparedStmtOfDeleteImageData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ImageData";
        return _query;
      }
    };
  }

  @Override
  public void addSingleImageData(final ImageData imageData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfImageData.insert(imageData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void addBitmapToDB(final CanvasBitmapData canvasBitmapData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCanvasBitmapData.insert(canvasBitmapData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateSingleImageData(final ImageData imageData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfImageData.handle(imageData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteImageData() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteImageData.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteImageData.release(_stmt);
    }
  }

  @Override
  public LiveData<List<ImageData>> getAllImages() {
    final String _sql = "SELECT * FROM ImageData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"ImageData"}, false, new Callable<List<ImageData>>() {
      @Override
      public List<ImageData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPictureName = CursorUtil.getColumnIndexOrThrow(_cursor, "pictureName");
          final int _cursorIndexOfColorOne = CursorUtil.getColumnIndexOrThrow(_cursor, "colorOne");
          final int _cursorIndexOfColorTwo = CursorUtil.getColumnIndexOrThrow(_cursor, "colorTwo");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final List<ImageData> _result = new ArrayList<ImageData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ImageData _item;
            final UUID _tmpId;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfId);
            _tmpId = __imageDataConverter.toUUID(_tmp);
            final String _tmpPictureName;
            _tmpPictureName = _cursor.getString(_cursorIndexOfPictureName);
            final String _tmpColorOne;
            _tmpColorOne = _cursor.getString(_cursorIndexOfColorOne);
            final String _tmpColorTwo;
            _tmpColorTwo = _cursor.getString(_cursorIndexOfColorTwo);
            final Date _tmpDate;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __imageDataConverter.toDate(_tmp_1);
            _item = new ImageData(_tmpId,_tmpPictureName,_tmpColorOne,_tmpColorTwo,_tmpDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<ImageData> getSingleImageData(final UUID id) {
    final String _sql = "SELECT * FROM ImageData where id=(?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp;
    _tmp = __imageDataConverter.fromUUID(id);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"ImageData"}, false, new Callable<ImageData>() {
      @Override
      public ImageData call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPictureName = CursorUtil.getColumnIndexOrThrow(_cursor, "pictureName");
          final int _cursorIndexOfColorOne = CursorUtil.getColumnIndexOrThrow(_cursor, "colorOne");
          final int _cursorIndexOfColorTwo = CursorUtil.getColumnIndexOrThrow(_cursor, "colorTwo");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final ImageData _result;
          if(_cursor.moveToFirst()) {
            final UUID _tmpId;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfId);
            _tmpId = __imageDataConverter.toUUID(_tmp_1);
            final String _tmpPictureName;
            _tmpPictureName = _cursor.getString(_cursorIndexOfPictureName);
            final String _tmpColorOne;
            _tmpColorOne = _cursor.getString(_cursorIndexOfColorOne);
            final String _tmpColorTwo;
            _tmpColorTwo = _cursor.getString(_cursorIndexOfColorTwo);
            final Date _tmpDate;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __imageDataConverter.toDate(_tmp_2);
            _result = new ImageData(_tmpId,_tmpPictureName,_tmpColorOne,_tmpColorTwo,_tmpDate);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<ImageData>> getColors() {
    final String _sql = "SELECT * FROM ImageData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"ImageData"}, false, new Callable<List<ImageData>>() {
      @Override
      public List<ImageData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPictureName = CursorUtil.getColumnIndexOrThrow(_cursor, "pictureName");
          final int _cursorIndexOfColorOne = CursorUtil.getColumnIndexOrThrow(_cursor, "colorOne");
          final int _cursorIndexOfColorTwo = CursorUtil.getColumnIndexOrThrow(_cursor, "colorTwo");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final List<ImageData> _result = new ArrayList<ImageData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ImageData _item;
            final UUID _tmpId;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfId);
            _tmpId = __imageDataConverter.toUUID(_tmp);
            final String _tmpPictureName;
            _tmpPictureName = _cursor.getString(_cursorIndexOfPictureName);
            final String _tmpColorOne;
            _tmpColorOne = _cursor.getString(_cursorIndexOfColorOne);
            final String _tmpColorTwo;
            _tmpColorTwo = _cursor.getString(_cursorIndexOfColorTwo);
            final Date _tmpDate;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __imageDataConverter.toDate(_tmp_1);
            _item = new ImageData(_tmpId,_tmpPictureName,_tmpColorOne,_tmpColorTwo,_tmpDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public String getSavedBitmapDB() {
    final String _sql = "SELECT bitmapData FROM CanvasBitmapData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getString(0);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
