package com.app.nytimes.manager.base

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import org.koin.core.KoinComponent
import org.koin.core.inject

open class BaseViewModel : ViewModel(), KoinComponent {
    val responseManager: ResponseManager by inject()
    val disposable :CompositeDisposable by inject ()

}