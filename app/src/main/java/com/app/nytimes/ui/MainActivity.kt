package com.app.nytimes.ui

import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.app.nytimes.R
import com.app.nytimes.databinding.ActivityMainBinding
import com.app.nytimes.manager.base.BaseActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Inject
import javax.inject.Qualifier
import javax.inject.Singleton


@AndroidEntryPoint
class MainActivity : BaseActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    @Inject
    lateinit var doSomething: DoSomething



    //fsdfsdf
    //dasdasd

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)


        initializeStatusBar(R.color.colorPrimary)
        initializeAppBar()
        userNavigation()

        Log.d("DDEEDD", doSomething.doSomething())
    }


    private fun userNavigation() {
        Handler(Looper.getMainLooper()).postDelayed({
            initializeStatusBar(R.color.colorWhite)
            getNavHost().navigate(R.id.action_splashFragment_to_homeFragment)

        }, 2000)
    }

    private fun getNavHost(): NavController {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.hostFragment) as NavHostFragment
        return navHostFragment.navController
    }

    private fun initializeStatusBar(color: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            window.statusBarColor = getColor(color)
        }
    }

    private fun initializeAppBar() {
        appBarConfiguration = AppBarConfiguration.Builder(getNavHost().graph).build()
        setupActionBarWithNavController(getNavHost(), appBarConfiguration)
        NavigationUI.setupActionBarWithNavController(this, getNavHost(), null)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(getNavHost(), appBarConfiguration)
    }

}

class DoSomething @Inject constructor(
    private val doAnotherSomething: DoAnotherSomething
) {
    fun doSomething() = doAnotherSomething.doAnotherSomething()
}

class DoAnotherSomething @Inject constructor(
   @InterfaceTwo private val someInterface: SomeInterface
) {
    fun doAnotherSomething() = someInterface.donInterfaceJob()
}

class SomeInterfaceImpl @Inject constructor(val message: String) : SomeInterface {
    override fun donInterfaceJob() = "i did second hilt injection -> $message"
}

interface SomeInterface {
    fun donInterfaceJob(): String
}

//@InstallIn(ActivityComponent::class)
@InstallIn(ApplicationComponent::class)
@Module
class SomeModule {

    // @ActivityScoped
    /**
    @Singleton
    @Binds
    abstract fun bindSomeInterface(someInterfaceImpl: SomeInterfaceImpl):SomeInterface
     ***/
    @InterfaceOne
    @Singleton
    @Provides
    fun provideInterface(string: String): SomeInterface {
        return SomeInterfaceImpl(string)
    }

    @InterfaceTwo
    @Singleton
    @Provides
    fun provideInterface0(string: String): SomeInterface {
        return SomeInterfaceImpl(string)
    }

    @Singleton
    @Provides
    fun provideString(): String {
        return "ProvideNewInstance"
    }

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class InterfaceOne

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class InterfaceTwo