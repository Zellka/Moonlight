package com.example.moonlightapp.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.data.FavouriteList
import com.example.moonlightapp.databinding.FavouriteItemBinding
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.utils.AddableToCart
import com.example.moonlightapp.utils.UpdatableFavourites
import kotlinx.android.synthetic.main.favourite_item.view.*

class FavouriteAdapter(private var listener: UpdatableFavourites,
                       private val addable: AddableToCart) :
    RecyclerView.Adapter<FavouriteAdapter.FavouriteViewHolder>() {
    private var dishList: MutableList<Dish> = ArrayList()

    private var favourites: FavouriteList = FavouriteList()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FavouriteViewHolder {
        val binding: FavouriteItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.favourite_item,
            parent,
            false
        )
        return FavouriteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FavouriteViewHolder, position: Int) {
        val item = dishList[position]
        holder.bind(item, listener, favourites, addable)
        if (favourites.isFavourite(item)) {
            holder.itemView.add_to_favourite.setImageResource(R.drawable.ic_heart_select)
        } else {
            holder.itemView.add_to_favourite.setImageResource(R.drawable.ic_heart)
        }
    }

    override fun getItemCount(): Int = dishList.size

    class FavouriteViewHolder(private val binding: FavouriteItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("CheckResult")
        fun bind(data: Dish, listener: UpdatableFavourites, favourites: FavouriteList, addable: AddableToCart) {
            binding.dish = data
            var flag = !favourites.isFavourite(data)
            binding.addToFavourite.setOnClickListener {
                listener.addToFavourites(data)
                if (flag) {
                    binding.addToFavourite.setImageResource(R.drawable.ic_heart_select)
                    flag = !flag
                } else {
                    binding.addToFavourite.setImageResource(R.drawable.ic_heart)
                    flag = !flag
                }
            }
            binding.addToCart.setOnClickListener {
                addable.addToCart(Cart(data))
            }
            binding.executePendingBindings()
        }
    }

    fun setList(list: MutableList<Dish>) {
        dishList = list
        notifyDataSetChanged()
    }

}