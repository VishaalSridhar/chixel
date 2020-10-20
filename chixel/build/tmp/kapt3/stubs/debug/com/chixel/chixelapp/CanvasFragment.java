package com.chixel.chixelapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 .2\u00020\u0001:\u0002-.B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010(\u001a\u00020\u001bH\u0016J\u0014\u0010)\u001a\u00020\u001b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/chixel/chixelapp/CanvasFragment;", "Landroidx/fragment/app/Fragment;", "()V", "c1Button", "Landroid/widget/ImageButton;", "c2Button", "callbacks", "Lcom/chixel/chixelapp/CanvasFragment$CanvasCallback;", "currentTool", "Lcom/chixel/chixelapp/canvas/ToolEnum;", "drawView", "Lcom/chixel/chixelapp/canvas/PixelCanvasView;", "imageName", "", "imageViewModel", "Lcom/chixel/chixelapp/ColorPickerPopupViewModel;", "toolBrushBtn", "toolEraseBtn", "toolOptionsBtn", "Landroid/widget/Button;", "toolRedoBtn", "toolSaveBtn", "toolSavedImagesBtn", "toolSelColor", "", "toolUndoBtn", "guiCurrentToolSelected", "", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "updateUI", "images", "", "Lcom/chixel/chixelapp/database/ImageData;", "CanvasCallback", "Companion", "chixel_debug"})
public final class CanvasFragment extends androidx.fragment.app.Fragment {
    private com.chixel.chixelapp.ColorPickerPopupViewModel imageViewModel;
    private java.lang.String imageName;
    private com.chixel.chixelapp.CanvasFragment.CanvasCallback callbacks;
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
    private final int toolSelColor = 0;
    public static final com.chixel.chixelapp.CanvasFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void updateUI(@org.jetbrains.annotations.NotNull()
    java.util.List<com.chixel.chixelapp.database.ImageData> images) {
    }
    
    private final void guiCurrentToolSelected() {
    }
    
    public CanvasFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/chixel/chixelapp/CanvasFragment$CanvasCallback;", "", "toolSavedImagesCallback", "", "chixel_debug"})
    public static abstract interface CanvasCallback {
        
        public abstract void toolSavedImagesCallback();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/chixel/chixelapp/CanvasFragment$Companion;", "", "()V", "newInstance", "Lcom/chixel/chixelapp/CanvasFragment;", "pictureName", "", "chixel_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.chixel.chixelapp.CanvasFragment newInstance(@org.jetbrains.annotations.Nullable()
        java.lang.String pictureName) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}