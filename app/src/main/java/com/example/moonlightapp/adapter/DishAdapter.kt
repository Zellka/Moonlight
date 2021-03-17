package com.example.moonlightapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.common.Addable
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.common.ItemClickable
import com.example.moonlightapp.databinding.ItemDishBinding

class DishAdapter(
    private val categoryItem: List<Dish>,
    private val listener: ItemClickable,
    private val addable: Addable
) :
    RecyclerView.Adapter<DishAdapter.CategoryItemViewHolder>() {

    class CategoryItemViewHolder(private val binding: ItemDishBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Dish, addable: Addable){
            binding.dish = data
            binding.addToCart.setOnClickListener {
                addable.addToCart(Cart(data))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryItemViewHolder {
        val binding: ItemDishBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_dish,
            parent,
            false
        )
        return CategoryItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryItemViewHolder, position: Int) {
        val item = categoryItem[position]
        holder.bind(item, addable)
        holder.itemView.setOnClickListener {
            listener.showDish(categoryItem[position])
        }
    }

    override fun getItemCount(): Int = categoryItem.size
}


