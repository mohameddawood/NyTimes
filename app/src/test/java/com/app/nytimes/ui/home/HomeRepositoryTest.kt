package com.app.nytimes.ui.home

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.koin.dsl.koinApplication
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class HomeRepositoryTest {

    @InjectMocks
    var homeRepository: HomeRepository? = null
    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    @Throws(Exception::class)
    fun testGetArticles() {
        koinApplication{
            val result = homeRepository?.getArticles(0)
            Assert.assertEquals(null, result)
        }

    }
}