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
public final class SomeInterfaceImpl_Factory implements Factory<SomeInterfaceImpl> {
  private final Provider<String> messageProvider;

  public SomeInterfaceImpl_Factory(Provider<String> messageProvider) {
    this.messageProvider = messageProvider;
  }

  @Override
  public SomeInterfaceImpl get() {
    return newInstance(messageProvider.get());
  }

  public static SomeInterfaceImpl_Factory create(Provider<String> messageProvider) {
    return new SomeInterfaceImpl_Factory(messageProvider);
  }

  public static SomeInterfaceImpl newInstance(String message) {
    return new SomeInterfaceImpl(message);
  }
}
