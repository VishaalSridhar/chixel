package com.chixel.chixelapp.canvas;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0002J\u0018\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\u0016\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0015J\u0010\u0010\'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0015H\u0002J\u0006\u0010)\u001a\u00020\u001fJ\u0006\u0010*\u001a\u00020+J\u0010\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020.H\u0014J\u0010\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u000201H\u0016J\u0006\u00102\u001a\u00020\u001fJ\u000e\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u0007J\u000e\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u00020+J\u000e\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\u0007J\u000e\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u000eJ\u0006\u0010;\u001a\u00020\u001fJ\u0006\u0010<\u001a\u00020\u001fR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/chixel/chixelapp/canvas/PixelCanvasView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "", "isEraserOn", "()Z", "mCurX", "", "mCurY", "mIsSaving", "mIsStrokeWidthBarEnabled", "mLastPaths", "Ljava/util/LinkedHashMap;", "Lcom/chixel/chixelapp/canvas/MyPath;", "Lcom/chixel/chixelapp/canvas/PaintOptions;", "mPaint", "Landroid/graphics/Paint;", "mPaintOptions", "mPath", "mPaths", "mStartX", "mStartY", "mUndonePaths", "actionDown", "", "x", "y", "actionMove", "actionUp", "addPath", "path", "options", "changePaint", "paintOptions", "clearCanvas", "getBitmap", "Landroid/graphics/Bitmap;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "redo", "setAlpha", "newAlpha", "setBitmap", "bitmap", "setColor", "newColor", "setStrokeWidth", "newStrokeWidth", "toggleEraser", "undo", "chixel_debug"})
public final class PixelCanvasView extends android.view.View {
    private java.util.LinkedHashMap<com.chixel.chixelapp.canvas.MyPath, com.chixel.chixelapp.canvas.PaintOptions> mPaths;
    private java.util.LinkedHashMap<com.chixel.chixelapp.canvas.MyPath, com.chixel.chixelapp.canvas.PaintOptions> mLastPaths;
    private java.util.LinkedHashMap<com.chixel.chixelapp.canvas.MyPath, com.chixel.chixelapp.canvas.PaintOptions> mUndonePaths;
    private android.graphics.Paint mPaint;
    private com.chixel.chixelapp.canvas.MyPath mPath;
    private com.chixel.chixelapp.canvas.PaintOptions mPaintOptions;
    private float mCurX;
    private float mCurY;
    private float mStartX;
    private float mStartY;
    private boolean mIsSaving;
    private boolean mIsStrokeWidthBarEnabled;
    private boolean isEraserOn;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean isEraserOn() {
        return false;
    }
    
    public final void undo() {
    }
    
    public final void redo() {
    }
    
    public final void setColor(int newColor) {
    }
    
    public final void setAlpha(int newAlpha) {
    }
    
    public final void setStrokeWidth(float newStrokeWidth) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap getBitmap() {
        return null;
    }
    
    public final void setBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap) {
    }
    
    public final void addPath(@org.jetbrains.annotations.NotNull()
    com.chixel.chixelapp.canvas.MyPath path, @org.jetbrains.annotations.NotNull()
    com.chixel.chixelapp.canvas.PaintOptions options) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final void changePaint(com.chixel.chixelapp.canvas.PaintOptions paintOptions) {
    }
    
    public final void clearCanvas() {
    }
    
    private final void actionDown(float x, float y) {
    }
    
    private final void actionMove(float x, float y) {
    }
    
    private final void actionUp() {
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    public final void toggleEraser() {
    }
    
    public PixelCanvasView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public PixelCanvasView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public PixelCanvasView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}