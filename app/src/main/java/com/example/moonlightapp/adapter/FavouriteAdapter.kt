package com.example.moonlightapp.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.data.FavouriteList
import com.example.moonlightapp.databinding.FavouriteItemBinding
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.utils.FavouriteClickable
import kotlinx.android.synthetic.main.favourite_item.view.*

class FavouriteAdapter(private var listener: FavouriteClickable) :
    RecyclerView.Adapter<FavouriteAdapter.FavouriteViewHolder>() {
    private var dishList: MutableList<Dish> = ArrayList()

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
        holder.bind(item, listener)
        if (FavouriteList.isFavourite(item)) {
            holder.itemView.add_to_favourite.setImageResource(R.drawable.ic_baseline_favorite_24)
        } else {
            holder.itemView.add_to_favourite.setImageResource(R.drawable.ic_baseline_favorite_border_24)
        }
    }

    override fun getItemCount(): Int = dishList.size

    class FavouriteViewHolder(private val binding: FavouriteItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("CheckResult")
        fun bind(data: Dish, listener: FavouriteClickable) {
            binding.dish = data
            var flag = !FavouriteList.isFavourite(data)
            binding.addToFavourite.setOnClickListener {
                listener.addToFavourites(data)
                if (flag) {
                    binding.addToFavourite.setImageResource(R.drawable.ic_baseline_favorite_24)
                    flag = !flag
                } else {
                    binding.addToFavourite.setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    flag = !flag
                }
            }
            binding.executePendingBindings()
        }
    }

    fun setList(list: MutableList<Dish>) {
        dishList = list
        notifyDataSetChanged()
    }

}