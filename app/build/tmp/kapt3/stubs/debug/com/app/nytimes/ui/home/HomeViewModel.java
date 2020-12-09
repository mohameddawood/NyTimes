package com.app.nytimes.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/app/nytimes/ui/home/HomeViewModel;", "Lcom/app/nytimes/manager/base/BaseViewModel;", "Lorg/koin/core/KoinComponent;", "()V", "repository", "Lcom/app/nytimes/ui/home/HomeRepository;", "getRepository", "()Lcom/app/nytimes/ui/home/HomeRepository;", "repository$delegate", "Lkotlin/Lazy;", "showArticles", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/app/nytimes/model/entities/ArticlesResponse;", "getShowArticles", "()Landroidx/lifecycle/MutableLiveData;", "getRates", "", "app_debug"})
public final class HomeViewModel extends com.app.nytimes.manager.base.BaseViewModel implements org.koin.core.KoinComponent {
    private final kotlin.Lazy repository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.app.nytimes.model.entities.ArticlesResponse>> showArticles = null;
    
    private final com.app.nytimes.ui.home.HomeRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.app.nytimes.model.entities.ArticlesResponse>> getShowArticles() {
        return null;
    }
    
    public final void getRates() {
    }
    
    public HomeViewModel() {
        super();
    }
}