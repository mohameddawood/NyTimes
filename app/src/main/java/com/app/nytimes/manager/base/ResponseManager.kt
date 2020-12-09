package com.app.nytimes.manager.base

import android.content.SharedPreferences
import androidx.lifecycle.MutableLiveData
import com.app.nytimes.manager.connection.Resource

data class ResponseManager constructor(
    private val resource: Resource<Any>,
    private val sharedPreferences: SharedPreferences?
){

    private val responseManager = MutableLiveData<Resource<Any>>()


    fun loading() { setResponseObject(Resource.ResourceStatus.LOADING, null) }
    fun hideLoading() { setResponseObject(Resource.ResourceStatus.HIDE_LOADING, null) }
    fun failed(message: String?) { setResponseObject(Resource.ResourceStatus.FAILED, message) }


    private fun setResponseObject(status: Resource.ResourceStatus, message: String?){
        resource.resourceStatus = status
        responseManager.value = resource
    }

    fun getResponseManager() =   responseManager


}