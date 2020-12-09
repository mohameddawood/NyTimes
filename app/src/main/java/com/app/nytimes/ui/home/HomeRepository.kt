package com.app.nytimes.ui.home

import com.app.nytimes.manager.connection.Api
import com.app.nytimes.manager.connection.AppSchedulerProvider
import com.app.nytimes.manager.connection.Resource
import com.app.nytimes.model.entities.ArticlesResponse
import io.reactivex.Flowable
import org.koin.core.KoinComponent
import org.koin.core.inject

class HomeRepository : KoinComponent {
    private val api: Api by inject()
    private val appSchedulerProvider: AppSchedulerProvider by inject()

    fun getArticles(period: Int): Flowable<Resource<List<ArticlesResponse>>> {
        return api.getNyTimesArticles(period)
            .compose(appSchedulerProvider.ioToMainFlowableScheduler())
    }
}