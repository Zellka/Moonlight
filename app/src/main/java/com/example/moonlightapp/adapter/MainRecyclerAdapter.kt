package com.example.moonlightapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.models.AllCategory
import com.example.moonlightapp.models.CategoryItem
import com.example.moonlightapp.util.Saleable

class MainRecyclerAdapter(
    private val context: Context,
    private val allCategory: List<AllCategory>
) :
    RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder>() {
    private lateinit var saleable: Saleable

    fun setOnItemClickListener(onSaleable: Saleable) {
        saleable = onSaleable
    }
    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var categoryTitle: TextView = itemView.findViewById(R.id.title_text_view)
        var itemRecycler: RecyclerView = itemView.findViewById(R.id.items_container)
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

    override fun getItemCount(): Int {
        return allCategory.size
    }

    private fun setCatItemRecycler(recyclerView: RecyclerView, categoryItem: List<CategoryItem>) {
        val itemRecyclerAdapter = CategoryItemAdapter(
            context, categoryItem, saleable
        )
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = itemRecyclerAdapter
    }
}