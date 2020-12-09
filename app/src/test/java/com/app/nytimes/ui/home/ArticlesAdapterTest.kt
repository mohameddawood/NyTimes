package com.app.nytimes.ui.home

import com.app.nytimes.model.entities.ArticlesResponse
import com.app.nytimes.ui.home.ArticlesAdapter.ArticleClick
import com.app.nytimes.ui.home.ArticlesAdapter.ArticlesViewHolder
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import java.util.*

class ArticlesAdapterTest {
    @Mock
    var dataSet: List<ArticlesResponse>? = null

    @Mock
    var listener: ArticleClick? = null


    @InjectMocks
    var articlesAdapter: ArticlesAdapter? = null
    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }


    @Test
    @Throws(Exception::class)
    fun testGetItemCount() {
        val result = articlesAdapter!!.itemCount
        Assert.assertEquals(0, result.toLong())
    }

    @Test
    @Throws(Exception::class)
    fun testObserveItemClick() {
        articlesAdapter!!.observeItemClick(
            ArticlesResponse(
                "abstract",
                "adxKeywords",
                0L,
                "byline",
                "column",
                Arrays.asList("String"),
                0,
                Arrays.asList("String"),
                0L,
                Arrays.asList(
                    ArticlesResponse.Media(
                        0,
                        "caption",
                        "copyright",
                        Arrays.asList(ArticlesResponse.Media.MediaMetadata("format", 0, "url", 0)),
                        "subtype",
                        "type"
                    )
                ),
                "nytdsection",
                Arrays.asList("String"),
                Arrays.asList("String"),
                "publishedDate",
                "section",
                "source",
                "subsection",
                "title",
                "type",
                "updated",
                "uri",
                "url"
            )
        )
    }
}