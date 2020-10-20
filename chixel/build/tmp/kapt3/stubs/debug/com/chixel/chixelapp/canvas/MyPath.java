package com.chixel.chixelapp.canvas;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J(\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\nH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/chixel/chixelapp/canvas/MyPath;", "Landroid/graphics/Path;", "Ljava/io/Serializable;", "()V", "actions", "Ljava/util/LinkedList;", "Lcom/chixel/chixelapp/canvas/Action;", "getActions", "()Ljava/util/LinkedList;", "lineTo", "", "x", "", "y", "moveTo", "quadTo", "x1", "y1", "x2", "y2", "readObject", "inputStream", "Ljava/io/ObjectInputStream;", "reset", "chixel_debug"})
public final class MyPath extends android.graphics.Path implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final java.util.LinkedList<com.chixel.chixelapp.canvas.Action> actions = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedList<com.chixel.chixelapp.canvas.Action> getActions() {
        return null;
    }
    
    private final void readObject(java.io.ObjectInputStream inputStream) {
    }
    
    @java.lang.Override()
    public void reset() {
    }
    
    @java.lang.Override()
    public void moveTo(float x, float y) {
    }
    
    @java.lang.Override()
    public void lineTo(float x, float y) {
    }
    
    @java.lang.Override()
    public void quadTo(float x1, float y1, float x2, float y2) {
    }
    
    public MyPath() {
        super();
    }
}