package com.app.nytimes.manager.base;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import com.app.nytimes.R;
import com.app.nytimes.manager.connection.Resource;
import com.app.nytimes.manager.utilities.Constants;
import com.app.nytimes.ui.resource_layout.error.ErrorSheet;
import com.app.nytimes.ui.resource_layout.no_connection.NoConnectionSheet;
import com.app.nytimes.ui.resource_layout.success.SuccessSheet;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\u0012\u0010\u001b\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/app/nytimes/manager/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "baseViewModel", "Lcom/app/nytimes/manager/base/BaseViewModel;", "getBaseViewModel", "()Lcom/app/nytimes/manager/base/BaseViewModel;", "baseViewModel$delegate", "Lkotlin/Lazy;", "loadingBar", "Landroid/app/Dialog;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "failedMessage", "", "message", "", "hideProgress", "initializeProgress", "noConnection", "observeResponse", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showProgress", "successMessage", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.app.Dialog loadingBar;
    private final kotlin.Lazy baseViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.app.nytimes.manager.base.BaseViewModel getBaseViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void observeResponse() {
    }
    
    private final void successMessage(java.lang.String message) {
    }
    
    private final void failedMessage(java.lang.String message) {
    }
    
    private final void noConnection() {
    }
    
    private final void initializeProgress() {
    }
    
    private final void showProgress() {
    }
    
    private final void hideProgress() {
    }
    
    @java.lang.Override()
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent ev) {
        return false;
    }
    
    public BaseActivity() {
        super();
    }
}