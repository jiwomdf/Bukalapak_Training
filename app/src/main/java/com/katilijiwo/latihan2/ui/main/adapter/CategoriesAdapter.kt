package com.katilijiwo.latihan2.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.katilijiwo.latihan2.R
import com.katilijiwo.latihan2.data.remote.json.categories.Category
import com.katilijiwo.latihan2.databinding.ListCategoryBinding
import javax.inject.Inject

class CategoriesAdapter: RecyclerView.Adapter<CategoriesAdapter.CategoryViewHolder>() {

    private val diffCallback = object: DiffUtil.ItemCallback<Category>(){
        override fun areItemsTheSame(oldItem: Category, newItem: Category) = oldItem == newItem
        override fun areContentsTheSame(oldItem: Category, newItem: Category) = oldItem == newItem
    }

    private val differ = AsyncListDiffer(this, diffCallback)

    var listCategories : List<Category>
        get() = differ.currentList
        set(value) = differ.submitList(value)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding:ListCategoryBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.list_category, parent, false)
        return CategoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(listCategories[position])
    }

    override fun getItemCount(): Int = listCategories.size

    inner class CategoryViewHolder(private val binding: ListCategoryBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(category: Category) {
            binding.tvCategories.text = category.name
        }
    }
}