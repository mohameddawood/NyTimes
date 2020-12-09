package com.app.nytimes.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.nytimes.databinding.ItemArticleBinding
import com.app.nytimes.model.entities.ArticlesResponse


class ArticlesAdapter(private val dataSet: List<ArticlesResponse>, private val listener: ArticleClick) :
    RecyclerView.Adapter<ArticlesAdapter.ArticlesViewHolder>() {

    class ArticlesViewHolder(val binding: ItemArticleBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(article: ArticlesResponse) {
            binding.response = article
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ArticlesViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemArticleBinding.inflate(layoutInflater, parent, false)

                return ArticlesViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ArticlesViewHolder {
        return ArticlesViewHolder.from(viewGroup)
    }

    override fun onBindViewHolder(viewHolder: ArticlesViewHolder, position: Int) {
        viewHolder.bind(dataSet[position])
        viewHolder.binding.adapter = this

    }

    override fun getItemCount() = dataSet.size

    fun observeItemClick(article: ArticlesResponse) {
        listener.onArticleClick(article)
    }

    interface ArticleClick {
        fun onArticleClick(article: ArticlesResponse)
    }

}

