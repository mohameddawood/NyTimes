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

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/app/nytimes/ui/MainActivity;", "Lcom/app/nytimes/manager/base/BaseActivity;", "()V", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "doSomething", "Lcom/app/nytimes/ui/DoSomething;", "getDoSomething", "()Lcom/app/nytimes/ui/DoSomething;", "setDoSomething", "(Lcom/app/nytimes/ui/DoSomething;)V", "getNavHost", "Landroidx/navigation/NavController;", "initializeAppBar", "", "initializeStatusBar", "color", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "userNavigation", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends com.app.nytimes.manager.base.BaseActivity {
    private androidx.navigation.ui.AppBarConfiguration appBarConfiguration;
    @javax.inject.Inject()
    public com.app.nytimes.ui.DoSomething doSomething;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.nytimes.ui.DoSomething getDoSomething() {
        return null;
    }
    
    public final void setDoSomething(@org.jetbrains.annotations.NotNull()
    com.app.nytimes.ui.DoSomething p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void userNavigation() {
    }
    
    private final androidx.navigation.NavController getNavHost() {
        return null;
    }
    
    private final void initializeStatusBar(int color) {
    }
    
    private final void initializeAppBar() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    public MainActivity() {
        super();
    }
}