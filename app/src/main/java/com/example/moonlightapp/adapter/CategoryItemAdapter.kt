package com.example.moonlightapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.cart.CartItem
import com.example.moonlightapp.models.CategoryItem
import com.example.moonlightapp.common.Saleable
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_dish.view.*

class CategoryItemAdapter(
    private val context: Context,
    private val categoryItem: List<CategoryItem>,
    private val saleable: Saleable
) :
    RecyclerView.Adapter<CategoryItemAdapter.CategoryItemViewHolder>() {

    class CategoryItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(model: CategoryItem, saleable: Saleable){
            Picasso.get().load(model.url).centerCrop().fit().into(itemView.img_dish)
            itemView.name_dish.text = model.name
            itemView.price_dish.text = model.price.toString()
            itemView.addToCart.setOnClickListener { view ->
                saleable.addToCart(CartItem(model),model.name)
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
        holder.bind(item, saleable)
        holder.itemView.setOnClickListener {
            saleable.onItemClick(categoryItem[position].name, categoryItem[position].price, categoryItem[position].url)
        }
    }

    override fun getItemCount(): Int {
        return categoryItem.size
    }
}