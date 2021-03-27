package com.example.moonlightapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.data.FavouriteList
import com.example.moonlightapp.utils.Addable
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.utils.ItemClickable
import com.example.moonlightapp.databinding.ItemDishBinding
import com.example.moonlightapp.utils.FavouriteClickable
import kotlinx.android.synthetic.main.item_dish.view.*

class DishAdapter(
    private val categoryItem: List<Dish>,
    private val listener: ItemClickable,
    private val addable: Addable,
    private var favListener: FavouriteClickable
) :
    RecyclerView.Adapter<DishAdapter.CategoryItemViewHolder>() {

    class CategoryItemViewHolder(private val binding: ItemDishBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Dish, addable: Addable, favListener: FavouriteClickable) {
            binding.dish = data
            binding.addToCart.setOnClickListener {
                addable.addToCart(Cart(data))
            }
            var flag = !FavouriteList.isFavourite(data)
            binding.addToFavourite.setOnClickListener {
                favListener.addToFavourites(data)
                if (flag) {
                    binding.addToFavourite.setImageResource(R.drawable.ic_baseline_favorite_24)
                    flag = !flag
                } else {
                    binding.addToFavourite.setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    flag = !flag
                }
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
        holder.bind(item, addable, favListener)
        holder.itemView.setOnClickListener {
            listener.showDish(item)
        }
        if (FavouriteList.isFavourite(item)) {
            holder.itemView.add_to_favourite.setImageResource(R.drawable.ic_baseline_favorite_24)
        } else {
            holder.itemView.add_to_favourite.setImageResource(R.drawable.ic_baseline_favorite_border_24)
        }
    }

    override fun getItemCount(): Int = categoryItem.size
}


