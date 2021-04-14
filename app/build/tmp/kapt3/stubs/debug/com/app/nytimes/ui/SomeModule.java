package com.app.nytimes.ui;

import android.os.*;
import android.util.Log;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import com.app.nytimes.R;
import com.app.nytimes.databinding.ActivityMainBinding;
import com.app.nytimes.manager.base.BaseActivity;
import com.app.nytimes.manager.base.ResponseManager;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import javax.inject.Inject;
import javax.inject.Qualifier;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/app/nytimes/ui/SomeModule;", "", "()V", "provideInterface", "Lcom/app/nytimes/ui/SomeInterface;", "string", "", "provideInterface0", "provideString", "app_debug"})
@dagger.Module()
public final class SomeModule {
    
    /**
     * @Singleton
     * @Binds
     * abstract fun bindSomeInterface(someInterfaceImpl: SomeInterfaceImpl):SomeInterface
     */
    @org.jetbrains.annotations.NotNull()
    @InterfaceOne()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.app.nytimes.ui.SomeInterface provideInterface(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @InterfaceTwo()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.app.nytimes.ui.SomeInterface provideInterface0(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final java.lang.String provideString() {
        return null;
    }
    
    public SomeModule() {
        super();
    }
}