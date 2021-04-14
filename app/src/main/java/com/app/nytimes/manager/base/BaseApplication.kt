package com.app.nytimes.manager.base

import android.app.Application
import com.app.nytimes.di.apiModule
import com.app.nytimes.di.dataModule
import com.app.nytimes.di.viewModelModule
import dagger.hilt.android.HiltAndroidApp
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

@HiltAndroidApp
class BaseApplication :Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@BaseApplication)
            modules(listOf(dataModule, apiModule,viewModelModule))
        }

    }
}