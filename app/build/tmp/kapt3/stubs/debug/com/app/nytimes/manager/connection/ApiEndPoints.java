package com.app.nytimes.manager.connection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/app/nytimes/manager/connection/ApiEndPoints;", "", "()V", "ARTICLES", "", "app_debug"})
public final class ApiEndPoints {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTICLES = "https://api.nytimes.com/svc/mostpopular/v2/viewed/{period}.json?api-key=V3BgGjiDzZQsVTW8xPUy0WqRaL28U00X";
    @org.jetbrains.annotations.NotNull()
    public static final com.app.nytimes.manager.connection.ApiEndPoints INSTANCE = null;
    
    private ApiEndPoints() {
        super();
    }
}