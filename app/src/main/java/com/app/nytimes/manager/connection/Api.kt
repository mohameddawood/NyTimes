package com.app.nytimes.manager.connection

import com.app.nytimes.manager.connection.ApiEndPoints.ARTICLES
import com.app.nytimes.model.entities.ArticlesResponse
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {
    @GET(ARTICLES)
    fun getNyTimesArticles(@Path("period") period: Int): Flowable<Resource<List<ArticlesResponse>>>
}