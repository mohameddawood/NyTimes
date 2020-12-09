package com.app.nytimes.di

import com.app.nytimes.manager.base.ResponseManager
import com.app.nytimes.manager.connection.Resource
import com.app.nytimes.ui.home.HomeRepository
import org.koin.dsl.module


val apiModule = module {

    single {
        HomeRepository()
    }


    single {
        ResponseManager(Resource(), get())
    }

}