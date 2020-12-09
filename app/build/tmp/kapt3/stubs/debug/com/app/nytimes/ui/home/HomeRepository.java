package com.app.nytimes.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/app/nytimes/ui/home/HomeRepository;", "Lorg/koin/core/KoinComponent;", "()V", "api", "Lcom/app/nytimes/manager/connection/Api;", "getApi", "()Lcom/app/nytimes/manager/connection/Api;", "api$delegate", "Lkotlin/Lazy;", "appSchedulerProvider", "Lcom/app/nytimes/manager/connection/AppSchedulerProvider;", "getAppSchedulerProvider", "()Lcom/app/nytimes/manager/connection/AppSchedulerProvider;", "appSchedulerProvider$delegate", "getArticles", "Lio/reactivex/Flowable;", "Lcom/app/nytimes/manager/connection/Resource;", "", "Lcom/app/nytimes/model/entities/ArticlesResponse;", "period", "", "app_debug"})
public final class HomeRepository implements org.koin.core.KoinComponent {
    private final kotlin.Lazy api$delegate = null;
    private final kotlin.Lazy appSchedulerProvider$delegate = null;
    
    private final com.app.nytimes.manager.connection.Api getApi() {
        return null;
    }
    
    private final com.app.nytimes.manager.connection.AppSchedulerProvider getAppSchedulerProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<com.app.nytimes.manager.connection.Resource<java.util.List<com.app.nytimes.model.entities.ArticlesResponse>>> getArticles(int period) {
        return null;
    }
    
    public HomeRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}