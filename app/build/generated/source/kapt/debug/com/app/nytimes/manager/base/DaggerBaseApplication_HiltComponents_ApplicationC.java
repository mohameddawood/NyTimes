package com.app.nytimes.manager.base;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.app.nytimes.ui.DoAnotherSomething;
import com.app.nytimes.ui.DoSomething;
import com.app.nytimes.ui.MainActivity;
import com.app.nytimes.ui.MainActivity_MembersInjector;
import com.app.nytimes.ui.SomeInterface;
import com.app.nytimes.ui.SomeModule;
import com.app.nytimes.ui.SomeModule_ProvideInterface0Factory;
import com.app.nytimes.ui.SomeModule_ProvideStringFactory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerBaseApplication_HiltComponents_ApplicationC extends BaseApplication_HiltComponents.ApplicationC {
  private final SomeModule someModule;

  private volatile Object string = new MemoizedSentinel();

  private volatile Object interfaceTwoSomeInterface = new MemoizedSentinel();

  private DaggerBaseApplication_HiltComponents_ApplicationC(SomeModule someModuleParam) {
    this.someModule = someModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static BaseApplication_HiltComponents.ApplicationC create() {
    return new Builder().build();
  }

  private String getString() {
    Object local = string;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = string;
        if (local instanceof MemoizedSentinel) {
          local = SomeModule_ProvideStringFactory.provideString(someModule);
          string = DoubleCheck.reentrantCheck(string, local);
        }
      }
    }
    return (String) local;
  }

  private SomeInterface getInterfaceTwoSomeInterface() {
    Object local = interfaceTwoSomeInterface;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = interfaceTwoSomeInterface;
        if (local instanceof MemoizedSentinel) {
          local = SomeModule_ProvideInterface0Factory.provideInterface0(someModule, getString());
          interfaceTwoSomeInterface = DoubleCheck.reentrantCheck(interfaceTwoSomeInterface, local);
        }
      }
    }
    return (SomeInterface) local;
  }

  @Override
  public void injectBaseApplication(BaseApplication baseApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();}

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();}

  public static final class Builder {
    private SomeModule someModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder someModule(SomeModule someModule) {
      this.someModule = Preconditions.checkNotNull(someModule);
      return this;
    }

    public BaseApplication_HiltComponents.ApplicationC build() {
      if (someModule == null) {
        this.someModule = new SomeModule();
      }
      return new DaggerBaseApplication_HiltComponents_ApplicationC(someModule);
    }
  }

  private final class ActivityRetainedCBuilder implements BaseApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public BaseApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends BaseApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();}

    private final class ActivityCBuilder implements BaseApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public BaseApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends BaseApplication_HiltComponents.ActivityC {
      private ActivityCImpl(Activity activity) {

      }

      private DoAnotherSomething getDoAnotherSomething() {
        return new DoAnotherSomething(DaggerBaseApplication_HiltComponents_ApplicationC.this.getInterfaceTwoSomeInterface());}

      private DoSomething getDoSomething() {
        return new DoSomething(getDoAnotherSomething());}

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
        injectMainActivity2(mainActivity);}

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>emptySet();}

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();}

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();}

      private MainActivity injectMainActivity2(MainActivity instance) {
        MainActivity_MembersInjector.injectDoSomething(instance, getDoSomething());
        return instance;
      }

      private final class FragmentCBuilder implements BaseApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public BaseApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends BaseApplication_HiltComponents.FragmentC {
        private FragmentCImpl(Fragment fragment) {

        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>emptySet();}

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();}

        private final class ViewWithFragmentCBuilder implements BaseApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public BaseApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends BaseApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements BaseApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public BaseApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends BaseApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }
    }
  }

  private final class ServiceCBuilder implements BaseApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public BaseApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends BaseApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
