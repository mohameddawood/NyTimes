package com.app.nytimes.ui.home

import com.app.nytimes.manager.base.ResponseManager
import com.app.nytimes.manager.connection.Resource
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.MockitoAnnotations

class HomeViewModelTest {

    @InjectMocks
    var homeViewModel: HomeViewModel? = null
    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    @Throws(Exception::class)
    fun testGetShowArticles() {
        val result = homeViewModel!!.showArticles
        Assert.assertEquals(null, result)
    }

    @Test
    @Throws(Exception::class)
    fun testGetRates() {
        homeViewModel!!.getRates()
    }

    @Test
    @Throws(Exception::class)
    fun testGetResponseManager() {
        val result = homeViewModel!!.responseManager
        Assert.assertEquals(ResponseManager(Resource(), null), result)
    }

    @Test
    @Throws(Exception::class)
    fun testGetDisposable() {
        val result = homeViewModel!!.disposable
        Assert.assertEquals(null, result)
    }
}