package com.example.moonlightapp.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.data.FavoritesList
import com.example.moonlightapp.databinding.ItemFavoriteBinding
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.utils.AddableToCart
import com.example.moonlightapp.utils.UpdatableFavorites
import kotlinx.android.synthetic.main.item_favorite.view.*

class FavoriteAdapter(
    private var listener: UpdatableFavorites,
    private val addable: AddableToCart
) :
    RecyclerView.Adapter<FavoriteAdapter.FavouriteViewHolder>() {
    private var dishList: MutableList<Dish> = ArrayList()

    private var favourites: FavoritesList = FavoritesList()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FavouriteViewHolder {
        val binding: ItemFavoriteBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_favorite,
            parent,
            false
        )
        return FavouriteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FavouriteViewHolder, position: Int) {
        val item = dishList[position]
        holder.bind(item, listener, favourites, addable)
        if (favourites.isFavorite(item)) {
            holder.itemView.btn_add_favorite.setImageResource(R.drawable.ic_heart_select)
        } else {
            holder.itemView.btn_add_favorite.setImageResource(R.drawable.ic_heart)
        }
    }

    override fun getItemCount(): Int = dishList.size

    class FavouriteViewHolder(private val binding: ItemFavoriteBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("CheckResult")
        fun bind(
            data: Dish,
            listener: UpdatableFavorites,
            favourites: FavoritesList,
            addable: AddableToCart
        ) {
            binding.dish = data
            var flag = !favourites.isFavorite(data)
            binding.btnAddFavorite.setOnClickListener {
                listener.updateItemFavorite(data)
                if (flag) {
                    binding.btnAddFavorite.setImageResource(R.drawable.ic_heart_select)
                    flag = !flag
                } else {
                    binding.btnAddFavorite.setImageResource(R.drawable.ic_heart)
                    flag = !flag
                }
            }
            binding.btnAdd.setOnClickListener {
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