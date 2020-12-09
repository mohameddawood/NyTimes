package com.app.nytimes.manager.connection

import com.google.gson.annotations.SerializedName

class Resource<T> {
    var resourceStatus: ResourceStatus? = null

    @SerializedName("results")
    val data: T? = null

    enum class ResourceStatus {
        SUCCESS, FAILED, NO_CONNECTION, LOADING, LOGOUT, AUTHENTICATED, HIDE_LOADING
    }


}