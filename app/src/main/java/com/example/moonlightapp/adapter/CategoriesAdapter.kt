package com.example.moonlightapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.common.Addable
import com.example.moonlightapp.entity.Categories
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.common.ItemClickable

class CategoriesAdapter(
    private val context: Context,
    private val addable: Addable
) :
    RecyclerView.Adapter<CategoriesAdapter.MainViewHolder>() {
    private lateinit var listener: ItemClickable
    private var allCategory: MutableList<Categories> = ArrayList()

    fun setOnItemClickListener(onSaleable: ItemClickable) {
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
            categoryItem, listener, addable
        )
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = itemRecyclerAdapter
    }

    fun setList(dishList: MutableList<Categories>) {
        allCategory = dishList
        notifyDataSetChanged()
    }
}