package com.app.nytimes.ui.splash;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.app.nytimes.R;

public class SplashFragmentDirections {
  private SplashFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSplashFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashFragment_to_homeFragment);
  }
}
