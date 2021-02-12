package com.example.moonlightapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.common.ItemClickListener
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_dish.view.*

class CategoryItemAdapter(
    private val context: Context,
    private val categoryItem: List<Dish>,
    private val listener: ItemClickListener
) :
    RecyclerView.Adapter<CategoryItemAdapter.CategoryItemViewHolder>() {

    class CategoryItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(model: Dish, saleable: ItemClickListener){
            Picasso.get().load(model.url).centerCrop().fit().into(itemView.img_dish)
            itemView.name_dish.text = model.name
            itemView.price_dish.text = model.price.toString()
            itemView.addToCart.setOnClickListener { view ->
                saleable.addToCart(Cart(model))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryItemViewHolder {
        return CategoryItemViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_dish, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CategoryItemViewHolder, position: Int) {
        val item = categoryItem[position]
        holder.bind(item, listener)
        holder.itemView.setOnClickListener {
            listener.onItemClick(categoryItem[position].name, categoryItem[position].price, categoryItem[position].url)
        }
    }

    override fun getItemCount(): Int {
        return categoryItem.size
    }
}