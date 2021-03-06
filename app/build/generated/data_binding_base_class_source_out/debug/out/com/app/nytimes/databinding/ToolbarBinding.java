// Generated by view binder compiler. Do not edit!
package com.app.nytimes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.app.nytimes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ToolbarBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final ConstraintLayout layoutToolbar;

  @NonNull
  public final TextView tvTitle;

  private ToolbarBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivBack,
      @NonNull ConstraintLayout layoutToolbar, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.ivBack = ivBack;
    this.layoutToolbar = layoutToolbar;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.toolbar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ToolbarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_back;
      ImageView ivBack = rootView.findViewById(id);
      if (ivBack == null) {
        break missingId;
      }

      ConstraintLayout layoutToolbar = (ConstraintLayout) rootView;

      id = R.id.tv_title;
      TextView tvTitle = rootView.findViewById(id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ToolbarBinding((ConstraintLayout) rootView, ivBack, layoutToolbar, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
