package com.app.nytimes.manager.connection;

import io.reactivex.*;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007J\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u00a8\u0006\t"}, d2 = {"Lcom/app/nytimes/manager/connection/AppSchedulerProvider;", "", "()V", "io", "Lio/reactivex/Scheduler;", "ioToMainFlowableScheduler", "Lio/reactivex/FlowableTransformer;", "T", "ui", "app_debug"})
public final class AppSchedulerProvider {
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.FlowableTransformer<T, T> ioToMainFlowableScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.Scheduler ui() {
        return null;
    }
    
    private final io.reactivex.Scheduler io() {
        return null;
    }
    
    public AppSchedulerProvider() {
        super();
    }
}