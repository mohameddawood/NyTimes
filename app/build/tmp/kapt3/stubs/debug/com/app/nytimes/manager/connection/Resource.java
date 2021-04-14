package com.app.nytimes.manager.connection;

import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lcom/app/nytimes/manager/connection/Resource;", "T", "", "()V", "data", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "resourceStatus", "Lcom/app/nytimes/manager/connection/Resource$ResourceStatus;", "getResourceStatus", "()Lcom/app/nytimes/manager/connection/Resource$ResourceStatus;", "setResourceStatus", "(Lcom/app/nytimes/manager/connection/Resource$ResourceStatus;)V", "ResourceStatus", "app_debug"})
public final class Resource<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private com.app.nytimes.manager.connection.Resource.ResourceStatus resourceStatus;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "results")
    private final T data = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.app.nytimes.manager.connection.Resource.ResourceStatus getResourceStatus() {
        return null;
    }
    
    public final void setResourceStatus(@org.jetbrains.annotations.Nullable()
    com.app.nytimes.manager.connection.Resource.ResourceStatus p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    public Resource() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/app/nytimes/manager/connection/Resource$ResourceStatus;", "", "(Ljava/lang/String;I)V", "SUCCESS", "FAILED", "NO_CONNECTION", "LOADING", "LOGOUT", "AUTHENTICATED", "HIDE_LOADING", "app_debug"})
    public static enum ResourceStatus {
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ FAILED /* = new FAILED() */,
        /*public static final*/ NO_CONNECTION /* = new NO_CONNECTION() */,
        /*public static final*/ LOADING /* = new LOADING() */,
        /*public static final*/ LOGOUT /* = new LOGOUT() */,
        /*public static final*/ AUTHENTICATED /* = new AUTHENTICATED() */,
        /*public static final*/ HIDE_LOADING /* = new HIDE_LOADING() */;
        
        ResourceStatus() {
        }
    }
}