package com.app.nytimes.manager.connection

import io.reactivex.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class AppSchedulerProvider {


    fun <T> ioToMainFlowableScheduler(): FlowableTransformer<T, T> = FlowableTransformer { upstream ->
        upstream.subscribeOn(io())
            .observeOn(ui()).onBackpressureBuffer()
    }


    fun ui(): Scheduler? {
        return AndroidSchedulers.mainThread()
    }

    private fun io(): Scheduler {
        return Schedulers.io()
    }

}


