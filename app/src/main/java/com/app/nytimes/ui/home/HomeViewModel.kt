package com.app.nytimes.ui.home

import androidx.lifecycle.MutableLiveData
import com.app.nytimes.manager.base.BaseViewModel
import com.app.nytimes.model.entities.ArticlesResponse
import org.koin.core.KoinComponent
import org.koin.core.inject

class HomeViewModel : BaseViewModel() ,KoinComponent{

    private val repository:HomeRepository by inject ()
    val showArticles = MutableLiveData<List<ArticlesResponse>>()

    fun getRates(){
        responseManager.loading()
        disposable.add(
            repository.getArticles(7).subscribe({
                responseManager.hideLoading()
                if (it!=null){
                    if (it.data!=null){
                        showArticles.value = it.data
                    }else responseManager.failed("Empty list")
                }else responseManager.failed("Empty list")
            }, {
            })
        )

    }
}