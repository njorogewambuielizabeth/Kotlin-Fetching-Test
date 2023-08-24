package com.example.testfourfetchingactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.example.testfourfetchingactivity.databinding.ActivityMainBinding
import com.example.testfourfetchingactivity.viewModel.PostViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: PostViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = PostAdapter(emptyList())
        val recyclerView = binding.postRv
        recyclerView.adapter = adapter

        viewModel.posts.observe(this, Observer { posts ->
            adapter.updatePosts(posts)
        })

        viewModel.fetchPosts()
    }
}