package com.chixel.chixelapp.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00110\u0010J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00110\u0010J\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00102\u0006\u0010\u0016\u001a\u00020\u0017R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/chixel/chixelapp/database/ImageDataRepository;", "", "imageDataDao", "Lcom/chixel/chixelapp/database/ImageDataDao;", "(Lcom/chixel/chixelapp/database/ImageDataDao;)V", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "addBitmapToDb", "", "canvasBitmapData", "Lcom/chixel/chixelapp/database/CanvasBitmapData;", "addSingleImageData", "imageData", "Lcom/chixel/chixelapp/database/ImageData;", "getAllImages", "Landroidx/lifecycle/LiveData;", "", "getColors", "getSavedBitmapDB", "", "getSingleColor", "id", "Ljava/util/UUID;", "Companion", "chixel_debug"})
public final class ImageDataRepository {
    private final java.util.concurrent.ExecutorService executor = null;
    private final com.chixel.chixelapp.database.ImageDataDao imageDataDao = null;
    private static com.chixel.chixelapp.database.ImageDataRepository instance;
    public static final com.chixel.chixelapp.database.ImageDataRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.chixel.chixelapp.database.ImageData>> getColors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.chixel.chixelapp.database.ImageData>> getAllImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.chixel.chixelapp.database.ImageData> getSingleColor(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSavedBitmapDB() {
        return null;
    }
    
    public final void addSingleImageData(@org.jetbrains.annotations.NotNull()
    com.chixel.chixelapp.database.ImageData imageData) {
    }
    
    public final void addBitmapToDb(@org.jetbrains.annotations.NotNull()
    com.chixel.chixelapp.database.CanvasBitmapData canvasBitmapData) {
    }
    
    public ImageDataRepository(@org.jetbrains.annotations.NotNull()
    com.chixel.chixelapp.database.ImageDataDao imageDataDao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/chixel/chixelapp/database/ImageDataRepository$Companion;", "", "()V", "instance", "Lcom/chixel/chixelapp/database/ImageDataRepository;", "get", "getInstance", "context", "Landroid/content/Context;", "chixel_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.chixel.chixelapp.database.ImageDataRepository getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.chixel.chixelapp.database.ImageDataRepository get() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}