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
public final class DoAnotherSomething_Factory implements Factory<DoAnotherSomething> {
  private final Provider<SomeInterface> someInterfaceProvider;

  public DoAnotherSomething_Factory(Provider<SomeInterface> someInterfaceProvider) {
    this.someInterfaceProvider = someInterfaceProvider;
  }

  @Override
  public DoAnotherSomething get() {
    return newInstance(someInterfaceProvider.get());
  }

  public static DoAnotherSomething_Factory create(Provider<SomeInterface> someInterfaceProvider) {
    return new DoAnotherSomething_Factory(someInterfaceProvider);
  }

  public static DoAnotherSomething newInstance(SomeInterface someInterface) {
    return new DoAnotherSomething(someInterface);
  }
}
