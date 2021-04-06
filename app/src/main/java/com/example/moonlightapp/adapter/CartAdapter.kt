package com.example.moonlightapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.utils.RemovableFromCart
import com.example.moonlightapp.databinding.ItemCartBinding
import com.example.moonlightapp.entity.Cart
import kotlinx.android.synthetic.main.item_cart.view.*

class CartAdapter(
    var context: Context,
    private var removable: RemovableFromCart
) :
    RecyclerView.Adapter<CartAdapter.ViewHolder>() {

    private var cartItems: MutableList<Cart> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val binding: ItemCartBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_cart,
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = cartItems.size

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val model = cartItems[position]
        viewHolder.bind(model)
        viewHolder.itemView.btn_remove.setOnClickListener {
            removable.removeFromCart(cartItems, position)
            notifyDataSetChanged()
        }
    }

    class ViewHolder(private val binding: ItemCartBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Cart) {
            binding.cart = data
            binding.quantity.text = data.quantity.toString()
        }
    }

    fun setList(cartList: MutableList<Cart>) {
        cartItems = cartList
        notifyDataSetChanged()
    }
}