package com.app.nytimes.di;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.app.nytimes.BuildConfig;
import com.app.nytimes.manager.connection.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.readystatesoftware.chuck.ChuckInterceptor;
import io.reactivex.disposables.CompositeDisposable;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\n"}, d2 = {"PREFERENCES_FILE_KEY", "", "dataModule", "Lorg/koin/core/module/Module;", "getDataModule", "()Lorg/koin/core/module/Module;", "provideSettingsPreferences", "Landroid/content/SharedPreferences;", "app", "Landroid/app/Application;", "app_debug"})
public final class DataModuleKt {
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module dataModule = null;
    private static final java.lang.String PREFERENCES_FILE_KEY = "com.example.settings_preferences";
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getDataModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.SharedPreferences provideSettingsPreferences(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
}