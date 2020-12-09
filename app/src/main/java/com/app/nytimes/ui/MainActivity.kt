package com.app.nytimes.ui

import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
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
import com.app.nytimes.manager.base.ResponseManager
import org.koin.android.ext.android.inject


class MainActivity : BaseActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)


        initializeStatusBar(R.color.colorPrimary)
        initializeAppBar()


        userNavigation()
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

    private fun initializeAppBar(){
        appBarConfiguration = AppBarConfiguration.Builder(getNavHost().graph).build()
        setupActionBarWithNavController(getNavHost(), appBarConfiguration)
        NavigationUI.setupActionBarWithNavController(this, getNavHost(), null)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(getNavHost(), appBarConfiguration)
    }

}