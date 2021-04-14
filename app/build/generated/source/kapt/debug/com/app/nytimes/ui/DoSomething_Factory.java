package com.app.nytimes.ui;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DoSomething_Factory implements Factory<DoSomething> {
  private final Provider<DoAnotherSomething> doAnotherSomethingProvider;

  public DoSomething_Factory(Provider<DoAnotherSomething> doAnotherSomethingProvider) {
    this.doAnotherSomethingProvider = doAnotherSomethingProvider;
  }

  @Override
  public DoSomething get() {
    return newInstance(doAnotherSomethingProvider.get());
  }

  public static DoSomething_Factory create(
      Provider<DoAnotherSomething> doAnotherSomethingProvider) {
    return new DoSomething_Factory(doAnotherSomethingProvider);
  }

  public static DoSomething newInstance(DoAnotherSomething doAnotherSomething) {
    return new DoSomething(doAnotherSomething);
  }
}
