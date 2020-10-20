package com.chixel.chixelapp.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\u0003H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bH\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bH\'J\b\u0010\u000e\u001a\u00020\u000fH\'J\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\u0014"}, d2 = {"Lcom/chixel/chixelapp/database/ImageDataDao;", "", "addBitmapToDB", "", "canvasBitmapData", "Lcom/chixel/chixelapp/database/CanvasBitmapData;", "addSingleImageData", "imageData", "Lcom/chixel/chixelapp/database/ImageData;", "deleteImageData", "getAllImages", "Landroidx/lifecycle/LiveData;", "", "getColors", "getSavedBitmapDB", "", "getSingleImageData", "id", "Ljava/util/UUID;", "updateSingleImageData", "chixel_debug"})
public abstract interface ImageDataDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ImageData")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.chixel.chixelapp.database.ImageData>> getAllImages();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ImageData where id=(:id)")
    public abstract androidx.lifecycle.LiveData<com.chixel.chixelapp.database.ImageData> getSingleImageData(@org.jetbrains.annotations.NotNull()
    java.util.UUID id);
    
    @androidx.room.Update()
    public abstract void updateSingleImageData(@org.jetbrains.annotations.NotNull()
    com.chixel.chixelapp.database.ImageData imageData);
    
    @androidx.room.Insert()
    public abstract void addSingleImageData(@org.jetbrains.annotations.NotNull()
    com.chixel.chixelapp.database.ImageData imageData);
    
    @androidx.room.Query(value = "DELETE FROM ImageData")
    public abstract void deleteImageData();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ImageData")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.chixel.chixelapp.database.ImageData>> getColors();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT bitmapData FROM CanvasBitmapData")
    public abstract java.lang.String getSavedBitmapDB();
    
    @androidx.room.Insert()
    public abstract void addBitmapToDB(@org.jetbrains.annotations.NotNull()
    com.chixel.chixelapp.database.CanvasBitmapData canvasBitmapData);
}