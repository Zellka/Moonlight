package com.example.moonlightapp.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.data.FavouriteList
import com.example.moonlightapp.utils.AddableToCart
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.utils.ShowableDish
import com.example.moonlightapp.databinding.ItemDishBinding
import com.example.moonlightapp.utils.UpdatableFavourites
import kotlinx.android.synthetic.main.item_dish.view.*

class DishAdapter(
    private val categoryItem: List<Dish>,
    private val listener: ShowableDish,
    private val addable: AddableToCart,
    private var favListener: UpdatableFavourites
) :
    RecyclerView.Adapter<DishAdapter.CategoryItemViewHolder>() {

    class CategoryItemViewHolder(private val binding: ItemDishBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Dish, addable: AddableToCart, favListener: UpdatableFavourites) {
            binding.dish = data
            binding.addToCart.setOnClickListener {
                addable.addToCart(Cart(data))
            }
            var flag = !FavouriteList.isFavourite(data)
            binding.addToFavourite.setOnClickListener {
                favListener.addToFavourites(data)
                if (flag) {
                    binding.addToFavourite.setImageResource(R.drawable.ic_heart_select)
                    flag = !flag
                } else {
                    binding.addToFavourite.setImageResource(R.drawable.ic_heart)
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

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: CategoryItemViewHolder, position: Int) {
        val item = categoryItem[position]
        holder.bind(item, addable, favListener)
        holder.itemView.setOnClickListener {
            listener.showDish(item)
        }
        if (FavouriteList.isFavourite(item)) {
            holder.itemView.add_to_favourite.setImageResource(R.drawable.ic_heart_select)
        } else {
            holder.itemView.add_to_favourite.setImageResource(R.drawable.ic_heart)
        }
    }

    override fun getItemCount(): Int = categoryItem.size
}


