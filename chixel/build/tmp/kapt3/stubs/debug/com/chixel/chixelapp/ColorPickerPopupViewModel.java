package com.chixel.chixelapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\rR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0019"}, d2 = {"Lcom/chixel/chixelapp/ColorPickerPopupViewModel;", "Landroidx/lifecycle/ViewModel;", "imageDataRepository", "Lcom/chixel/chixelapp/database/ImageDataRepository;", "(Lcom/chixel/chixelapp/database/ImageDataRepository;)V", "allColorLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/chixel/chixelapp/database/ImageData;", "getAllColorLiveData", "()Landroidx/lifecycle/LiveData;", "colorIdLiveData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/UUID;", "imageListLiveData", "getImageListLiveData", "singleColorLiveData", "getSingleColorLiveData", "setSingleColorLiveData", "(Landroidx/lifecycle/LiveData;)V", "addSingleImageData", "", "imageData", "loadColor", "id", "chixel_debug"})
public final class ColorPickerPopupViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.chixel.chixelapp.database.ImageData>> allColorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.chixel.chixelapp.database.ImageData>> imageListLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.util.UUID> colorIdLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.chixel.chixelapp.database.ImageData> singleColorLiveData;
    private final com.chixel.chixelapp.database.ImageDataRepository imageDataRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.chixel.chixelapp.database.ImageData>> getAllColorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.chixel.chixelapp.database.ImageData>> getImageListLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.chixel.chixelapp.database.ImageData> getSingleColorLiveData() {
        return null;
    }
    
    public final void setSingleColorLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.chixel.chixelapp.database.ImageData> p0) {
    }
    
    public final void loadColor(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
    }
    
    public final void addSingleImageData(@org.jetbrains.annotations.NotNull()
    com.chixel.chixelapp.database.ImageData imageData) {
    }
    
    public ColorPickerPopupViewModel(@org.jetbrains.annotations.NotNull()
    com.chixel.chixelapp.database.ImageDataRepository imageDataRepository) {
        super();
    }
}