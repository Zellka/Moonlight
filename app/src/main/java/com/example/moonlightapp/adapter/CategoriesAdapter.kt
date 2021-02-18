package com.example.moonlightapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.entity.Categories
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.common.ItemClickListener

class CategoriesAdapter(
    private val context: Context,
    private val allCategory: List<Categories>
) :
    RecyclerView.Adapter<CategoriesAdapter.MainViewHolder>() {
    private lateinit var listener: ItemClickListener

    fun setOnItemClickListener(onSaleable: ItemClickListener) {
        listener = onSaleable
    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var categoryTitle: TextView = itemView.findViewById(R.id.title_text_view)
        var itemRecycler: RecyclerView = itemView.findViewById(R.id.recycler_nested)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_categories, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.categoryTitle.text = allCategory[position].categoryTitle
        setCatItemRecycler(holder.itemRecycler, allCategory[position].categoryItem)
    }

    override fun getItemCount(): Int = allCategory.size

    private fun setCatItemRecycler(recyclerView: RecyclerView, categoryItem: List<Dish>) {
        val itemRecyclerAdapter = DishAdapter(
            context, categoryItem, listener
        )
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = itemRecyclerAdapter
    }
}