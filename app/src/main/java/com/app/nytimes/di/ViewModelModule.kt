package com.app.nytimes.di

import com.app.nytimes.manager.base.BaseViewModel
import com.app.nytimes.ui.home.HomeViewModel

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {


    viewModel {
        BaseViewModel()
    }

    viewModel {
        HomeViewModel()
    }


}