package com.example.testfourfetchingactivity.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.example.testfourfetchingactivity.repository.PostRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class PostViewModel:ViewModel() {
    val repository = PostRepository()

    val posts = liveData(Dispatchers.IO) {
        val retrievedPosts = repository.getPosts()
        emit(retrievedPosts)
    }
    fun fetchPosts() {
        viewModelScope.launch {

            val fetchedPosts = repository.fetchPosts()

        }
    }
}