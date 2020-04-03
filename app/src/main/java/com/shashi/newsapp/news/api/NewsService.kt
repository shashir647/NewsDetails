package com.shashi.newsapp.news.api

import com.shashi.newsapp.news.model.NewsSourceResponse
import retrofit2.Response
import retrofit2.http.GET

/**
 * Fetch all the latest news article from various news services
 * using the News API.
 */
interface NewsService {

    /**
     * Retrieves all the latest news article from Google news using News API.
     */
    @GET("everything?q=covid19india&apiKey=2e7a1197f4e7484683cc09fa2f1c4f04")
    suspend fun getNewsFromGoogle(): Response<NewsSourceResponse>

}
