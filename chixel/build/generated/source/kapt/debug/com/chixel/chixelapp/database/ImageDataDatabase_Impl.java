package com.chixel.chixelapp.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ImageDataDatabase_Impl extends ImageDataDatabase {
  private volatile ImageDataDao _imageDataDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ImageData` (`id` TEXT NOT NULL, `pictureName` TEXT, `colorOne` TEXT, `colorTwo` TEXT, `date` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CanvasBitmapData` (`bitmapData` TEXT NOT NULL, PRIMARY KEY(`bitmapData`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bcb5c848200a7e539108b24ca919e87d')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `ImageData`");
        _db.execSQL("DROP TABLE IF EXISTS `CanvasBitmapData`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsImageData = new HashMap<String, TableInfo.Column>(5);
        _columnsImageData.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsImageData.put("pictureName", new TableInfo.Column("pictureName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsImageData.put("colorOne", new TableInfo.Column("colorOne", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsImageData.put("colorTwo", new TableInfo.Column("colorTwo", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsImageData.put("date", new TableInfo.Column("date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysImageData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesImageData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoImageData = new TableInfo("ImageData", _columnsImageData, _foreignKeysImageData, _indicesImageData);
        final TableInfo _existingImageData = TableInfo.read(_db, "ImageData");
        if (! _infoImageData.equals(_existingImageData)) {
          return new RoomOpenHelper.ValidationResult(false, "ImageData(com.chixel.chixelapp.database.ImageData).\n"
                  + " Expected:\n" + _infoImageData + "\n"
                  + " Found:\n" + _existingImageData);
        }
        final HashMap<String, TableInfo.Column> _columnsCanvasBitmapData = new HashMap<String, TableInfo.Column>(1);
        _columnsCanvasBitmapData.put("bitmapData", new TableInfo.Column("bitmapData", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCanvasBitmapData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCanvasBitmapData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCanvasBitmapData = new TableInfo("CanvasBitmapData", _columnsCanvasBitmapData, _foreignKeysCanvasBitmapData, _indicesCanvasBitmapData);
        final TableInfo _existingCanvasBitmapData = TableInfo.read(_db, "CanvasBitmapData");
        if (! _infoCanvasBitmapData.equals(_existingCanvasBitmapData)) {
          return new RoomOpenHelper.ValidationResult(false, "CanvasBitmapData(com.chixel.chixelapp.database.CanvasBitmapData).\n"
                  + " Expected:\n" + _infoCanvasBitmapData + "\n"
                  + " Found:\n" + _existingCanvasBitmapData);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "bcb5c848200a7e539108b24ca919e87d", "6bbeca30ca21171cd899f1b0258c0313");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "ImageData","CanvasBitmapData");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `ImageData`");
      _db.execSQL("DELETE FROM `CanvasBitmapData`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ImageDataDao imageDataDao() {
    if (_imageDataDao != null) {
      return _imageDataDao;
    } else {
      synchronized(this) {
        if(_imageDataDao == null) {
          _imageDataDao = new ImageDataDao_Impl(this);
        }
        return _imageDataDao;
      }
    }
  }
}
