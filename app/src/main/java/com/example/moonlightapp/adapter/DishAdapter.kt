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
    RecyclerView.Adapter<DishAdapter.DishViewHolder>() {

    private var favourites: FavouriteList = FavouriteList()

    class DishViewHolder(private val binding: ItemDishBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Dish, addable: AddableToCart, favListener: UpdatableFavourites, favourites: FavouriteList) {
            binding.dish = data
            binding.addToCart.setOnClickListener {
                addable.addToCart(Cart(data))
            }
            var flag = !favourites.isFavourite(data)
            binding.addToFavourite.setOnClickListener {
                favListener.updateItemFavourite(data)
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val binding: ItemDishBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_dish,
            parent,
            false
        )
        return DishViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        val item = categoryItem[position]
        holder.bind(item, addable, favListener, favourites)
        holder.itemView.setOnClickListener {
            listener.showDish(item)
        }
        if (favourites.isFavourite(item)) {
            holder.itemView.add_to_favourite.setImageResource(R.drawable.ic_heart_select)
        } else {
            holder.itemView.add_to_favourite.setImageResource(R.drawable.ic_heart)
        }
    }

    override fun getItemCount(): Int = categoryItem.size
}


