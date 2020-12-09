// Generated by data binding compiler. Do not edit!
package com.app.nytimes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.app.nytimes.R;
import com.app.nytimes.ui.resource_layout.no_connection.NoConnectionSheet;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutNoConnectionBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivNoConnectionClose;

  @NonNull
  public final LottieAnimationView lottiNoConnectionImage;

  @NonNull
  public final TextView tvNoConnectionTitle;

  @Bindable
  protected NoConnectionSheet mClickListener;

  protected LayoutNoConnectionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivNoConnectionClose, LottieAnimationView lottiNoConnectionImage,
      TextView tvNoConnectionTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivNoConnectionClose = ivNoConnectionClose;
    this.lottiNoConnectionImage = lottiNoConnectionImage;
    this.tvNoConnectionTitle = tvNoConnectionTitle;
  }

  public abstract void setClickListener(@Nullable NoConnectionSheet clickListener);

  @Nullable
  public NoConnectionSheet getClickListener() {
    return mClickListener;
  }

  @NonNull
  public static LayoutNoConnectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_no_connection, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutNoConnectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutNoConnectionBinding>inflateInternal(inflater, R.layout.layout_no_connection, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutNoConnectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_no_connection, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutNoConnectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutNoConnectionBinding>inflateInternal(inflater, R.layout.layout_no_connection, null, false, component);
  }

  public static LayoutNoConnectionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static LayoutNoConnectionBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutNoConnectionBinding)bind(component, view, R.layout.layout_no_connection);
  }
}
