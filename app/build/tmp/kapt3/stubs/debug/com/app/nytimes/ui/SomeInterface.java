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

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/app/nytimes/ui/SomeInterface;", "", "donInterfaceJob", "", "app_debug"})
public abstract interface SomeInterface {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String donInterfaceJob();
}