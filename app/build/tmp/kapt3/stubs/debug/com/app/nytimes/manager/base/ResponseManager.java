package com.app.nytimes.manager.base;

import android.content.SharedPreferences;
import androidx.lifecycle.MutableLiveData;
import com.app.nytimes.manager.connection.Resource;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u00c2\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u00c2\u0003J%\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\bJ\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0006\u0010\u0016\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u001a\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\t\u0010\u001b\u001a\u00020\u0012H\u00d6\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/app/nytimes/manager/base/ResponseManager;", "", "resource", "Lcom/app/nytimes/manager/connection/Resource;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lcom/app/nytimes/manager/connection/Resource;Landroid/content/SharedPreferences;)V", "responseManager", "Landroidx/lifecycle/MutableLiveData;", "component1", "component2", "copy", "equals", "", "other", "failed", "", "message", "", "getResponseManager", "hashCode", "", "hideLoading", "loading", "setResponseObject", "status", "Lcom/app/nytimes/manager/connection/Resource$ResourceStatus;", "toString", "app_debug"})
public final class ResponseManager {
    private final androidx.lifecycle.MutableLiveData<com.app.nytimes.manager.connection.Resource<java.lang.Object>> responseManager = null;
    private final com.app.nytimes.manager.connection.Resource<java.lang.Object> resource = null;
    private final android.content.SharedPreferences sharedPreferences = null;
    
    public final void loading() {
    }
    
    public final void hideLoading() {
    }
    
    public final void failed(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    private final void setResponseObject(com.app.nytimes.manager.connection.Resource.ResourceStatus status, java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.app.nytimes.manager.connection.Resource<java.lang.Object>> getResponseManager() {
        return null;
    }
    
    public ResponseManager(@org.jetbrains.annotations.NotNull()
    com.app.nytimes.manager.connection.Resource<java.lang.Object> resource, @org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    private final com.app.nytimes.manager.connection.Resource<java.lang.Object> component1() {
        return null;
    }
    
    private final android.content.SharedPreferences component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.nytimes.manager.base.ResponseManager copy(@org.jetbrains.annotations.NotNull()
    com.app.nytimes.manager.connection.Resource<java.lang.Object> resource, @org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}