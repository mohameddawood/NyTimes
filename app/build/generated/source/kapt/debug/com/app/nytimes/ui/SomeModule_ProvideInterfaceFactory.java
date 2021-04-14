package com.app.nytimes.ui;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class SomeModule_ProvideInterfaceFactory implements Factory<SomeInterface> {
  private final SomeModule module;

  private final Provider<String> stringProvider;

  public SomeModule_ProvideInterfaceFactory(SomeModule module, Provider<String> stringProvider) {
    this.module = module;
    this.stringProvider = stringProvider;
  }

  @Override
  public SomeInterface get() {
    return provideInterface(module, stringProvider.get());
  }

  public static SomeModule_ProvideInterfaceFactory create(SomeModule module,
      Provider<String> stringProvider) {
    return new SomeModule_ProvideInterfaceFactory(module, stringProvider);
  }

  public static SomeInterface provideInterface(SomeModule instance, String string) {
    return Preconditions.checkNotNull(instance.provideInterface(string), "Cannot return null from a non-@Nullable @Provides method");
  }
}
