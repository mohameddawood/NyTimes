package com.app.nytimes.ui;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<DoSomething> doSomethingProvider;

  public MainActivity_MembersInjector(Provider<DoSomething> doSomethingProvider) {
    this.doSomethingProvider = doSomethingProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<DoSomething> doSomethingProvider) {
    return new MainActivity_MembersInjector(doSomethingProvider);}

  @Override
  public void injectMembers(MainActivity instance) {
    injectDoSomething(instance, doSomethingProvider.get());
  }

  @InjectedFieldSignature("com.app.nytimes.ui.MainActivity.doSomething")
  public static void injectDoSomething(MainActivity instance, DoSomething doSomething) {
    instance.doSomething = doSomething;
  }
}
