package com.example.testfourfetchingactivity.repository

import com.example.testfourfetchingactivity.api.JsonPlaceholderApi
import com.example.testfourfetchingactivity.model.Post
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PostRepository {
    private val api: JsonPlaceholderApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(JsonPlaceholderApi::class.java)
    }

    suspend fun getPosts(): List<Post> {
        return api.getPosts()
    }

    suspend fun fetchPosts(): List<Post> {

        return api.getPosts()
    }
}