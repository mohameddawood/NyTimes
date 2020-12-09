package com.app.nytimes.manager.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lcom/app/nytimes/manager/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/KoinComponent;", "()V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable$delegate", "Lkotlin/Lazy;", "responseManager", "Lcom/app/nytimes/manager/base/ResponseManager;", "getResponseManager", "()Lcom/app/nytimes/manager/base/ResponseManager;", "responseManager$delegate", "app_debug"})
public class BaseViewModel extends androidx.lifecycle.ViewModel implements org.koin.core.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy responseManager$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy disposable$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.nytimes.manager.base.ResponseManager getResponseManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getDisposable() {
        return null;
    }
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}