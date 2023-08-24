package com.example.testfourfetchingactivity.api

import com.example.testfourfetchingactivity.model.Post
import retrofit2.http.GET

interface JsonPlaceholderApi {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}