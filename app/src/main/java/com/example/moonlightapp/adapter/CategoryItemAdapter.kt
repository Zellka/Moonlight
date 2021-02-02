package com.example.moonlightapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.models.CategoryItem
import com.example.moonlightapp.util.ItemClickListener
import com.squareup.picasso.Picasso

class CategoryItemAdapter(
    private val context: Context,
    private val categoryItem: List<CategoryItem>,
    private val itemClickListener: ItemClickListener
) :
    RecyclerView.Adapter<CategoryItemAdapter.CategoryItemViewHolder>() {

    class CategoryItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgDish: ImageView? = null
        var nameDish: TextView? = null
        var priceDish: TextView? = null

        init {
            imgDish = itemView.findViewById(R.id.img_dish)
            nameDish = itemView.findViewById(R.id.name_dish)
            priceDish = itemView.findViewById(R.id.price_dish)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryItemViewHolder {
        return CategoryItemAdapter.CategoryItemViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_dish, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CategoryItemViewHolder, position: Int) {
        holder.nameDish!!.text = categoryItem[position].name
        holder.priceDish!!.text = categoryItem[position].price
        Picasso.get()
            .load(categoryItem[position].url)
            .into(holder.imgDish)
        holder.itemView.setOnClickListener {
            itemClickListener.onItemClick(categoryItem[position].name, categoryItem[position].price)
        }
    }

    override fun getItemCount(): Int {
        return categoryItem.size
    }
}