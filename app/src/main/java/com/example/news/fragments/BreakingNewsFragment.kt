package com.example.news.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.news.NewsActivity
import com.example.news.R
import com.example.news.viewmodels.NewsViewModel

class BreakingNewsFragment : Fragment(R.layout.fragment_breaking_news) {

    private lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as NewsActivity).viewModel

    }

}