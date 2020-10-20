package com.chixel.chixelapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0012\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u0019H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/chixel/chixelapp/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/chixel/chixelapp/CanvasFragment$CanvasCallback;", "Lcom/chixel/chixelapp/ImageRecyclerView$ImageRecyclerViewCallback;", "()V", "c1Button", "Landroid/widget/ImageButton;", "c2Button", "currentTool", "Lcom/chixel/chixelapp/canvas/ToolEnum;", "drawView", "Lcom/chixel/chixelapp/canvas/PixelCanvasView;", "mainActivityViewModel", "Lcom/chixel/chixelapp/MainActivityViewModel;", "toolBrushBtn", "toolEraseBtn", "toolOptionsBtn", "Landroid/widget/Button;", "toolRedoBtn", "toolSaveBtn", "toolSavedImagesBtn", "toolSelColor", "", "toolUndoBtn", "bindViews", "", "callCanvasFragment", "pictureName", "", "guiCurrentToolSelected", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "toolSavedImagesCallback", "chixel_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.chixel.chixelapp.CanvasFragment.CanvasCallback, com.chixel.chixelapp.ImageRecyclerView.ImageRecyclerViewCallback {
    private android.widget.ImageButton c1Button;
    private android.widget.ImageButton c2Button;
    private android.widget.Button toolOptionsBtn;
    private com.chixel.chixelapp.canvas.PixelCanvasView drawView;
    private android.widget.ImageButton toolBrushBtn;
    private android.widget.ImageButton toolEraseBtn;
    private android.widget.ImageButton toolUndoBtn;
    private android.widget.ImageButton toolRedoBtn;
    private android.widget.ImageButton toolSavedImagesBtn;
    private android.widget.ImageButton toolSaveBtn;
    private com.chixel.chixelapp.canvas.ToolEnum currentTool;
    private com.chixel.chixelapp.MainActivityViewModel mainActivityViewModel;
    private final int toolSelColor = 0;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void guiCurrentToolSelected() {
    }
    
    private final void bindViews() {
    }
    
    @java.lang.Override()
    public void toolSavedImagesCallback() {
    }
    
    @java.lang.Override()
    public void callCanvasFragment(@org.jetbrains.annotations.Nullable()
    java.lang.String pictureName) {
    }
    
    public MainActivity() {
        super();
    }
}