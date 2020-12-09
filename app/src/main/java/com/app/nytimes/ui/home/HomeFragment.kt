package com.app.nytimes.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.nytimes.databinding.FragmentHomeBinding
import com.app.nytimes.model.entities.ArticlesResponse
import org.koin.androidx.viewmodel.ext.android.viewModel


class HomeFragment : Fragment(), ArticlesAdapter.ArticleClick {

    private val homeViewModel: HomeViewModel by viewModel()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root



        homeViewModel.getRates()
        binding.rvHomeRates.layoutManager = LinearLayoutManager(requireContext())
        binding.rvHomeRates.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
        )

        homeViewModel.showArticles.observe(viewLifecycleOwner, {
            if (it != null) {
                val adapter = ArticlesAdapter(it,this)
                binding.rvHomeRates.adapter = adapter
            }
        })

        return view
    }

    override fun onArticleClick(article: ArticlesResponse) {
        val action = HomeFragmentDirections.actionHomeFragmentToArticleDetailsFragmnet(article)
        findNavController().navigate(action)
    }
}