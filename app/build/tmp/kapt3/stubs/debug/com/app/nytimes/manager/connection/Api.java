package com.app.nytimes.manager.connection;

import com.app.nytimes.model.entities.ArticlesResponse;
import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/app/nytimes/manager/connection/Api;", "", "getNyTimesArticles", "Lio/reactivex/Flowable;", "Lcom/app/nytimes/manager/connection/Resource;", "", "Lcom/app/nytimes/model/entities/ArticlesResponse;", "period", "", "app_debug"})
public abstract interface Api {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "https://api.nytimes.com/svc/mostpopular/v2/viewed/{period}.json?api-key=V3BgGjiDzZQsVTW8xPUy0WqRaL28U00X")
    public abstract io.reactivex.Flowable<com.app.nytimes.manager.connection.Resource<java.util.List<com.app.nytimes.model.entities.ArticlesResponse>>> getNyTimesArticles(@retrofit2.http.Path(value = "period")
    int period);
}