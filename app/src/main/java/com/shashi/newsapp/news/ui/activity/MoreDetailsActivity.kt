package com.shashi.newsapp.news.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.api.load
import com.shashi.newsapp.R
import com.shashi.newsapp.news.model.NewsArticles
import kotlinx.android.synthetic.main.activity_more_details.*
import kotlinx.android.synthetic.main.layout_movie_detail_body.*
import kotlinx.android.synthetic.main.layout_movie_detail_header.*
import kotlinx.android.synthetic.main.row_news_article.view.*

class MoreDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_details)
        val data = intent.extras
        val newsArticle = data?.getParcelable<NewsArticles>("news_details")
        initializeUI(newsArticle)
    }
    private fun initializeUI(newsArticle: NewsArticles?) {
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "More News Details"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        if (newsArticle != null) {
            news_title.text =newsArticle.title
            news_publish.text = "Published On : "+newsArticle.publishedAt
            news_author.text = "Author : "+newsArticle.author
            newsImage.load(newsArticle.urlToImage) {
                placeholder(R.drawable.tools_placeholder)
                error(R.drawable.tools_placeholder)
            }
            detail_body_summary.text =newsArticle.description
            news_url.text =newsArticle.url
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
