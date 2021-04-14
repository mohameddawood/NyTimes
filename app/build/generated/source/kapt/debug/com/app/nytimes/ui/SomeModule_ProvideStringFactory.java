package com.app.nytimes.ui;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SomeModule_ProvideStringFactory implements Factory<String> {
  private final SomeModule module;

  public SomeModule_ProvideStringFactory(SomeModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideString(module);
  }

  public static SomeModule_ProvideStringFactory create(SomeModule module) {
    return new SomeModule_ProvideStringFactory(module);
  }

  public static String provideString(SomeModule instance) {
    return Preconditions.checkNotNull(instance.provideString(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
