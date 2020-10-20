package com.chixel.chixelapp.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.chixel.chixelapp.database.ImageDataConverter.class})
@androidx.room.Database(entities = {com.chixel.chixelapp.database.ImageData.class, com.chixel.chixelapp.database.CanvasBitmapData.class}, version = 2)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/chixel/chixelapp/database/ImageDataDatabase;", "Landroidx/room/RoomDatabase;", "()V", "imageDataDao", "Lcom/chixel/chixelapp/database/ImageDataDao;", "Companion", "chixel_debug"})
public abstract class ImageDataDatabase extends androidx.room.RoomDatabase {
    private static com.chixel.chixelapp.database.ImageDataDatabase instance;
    public static final com.chixel.chixelapp.database.ImageDataDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.chixel.chixelapp.database.ImageDataDao imageDataDao();
    
    public ImageDataDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/chixel/chixelapp/database/ImageDataDatabase$Companion;", "", "()V", "instance", "Lcom/chixel/chixelapp/database/ImageDataDatabase;", "getInstance", "context", "Landroid/content/Context;", "chixel_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.chixel.chixelapp.database.ImageDataDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}