package com.example.moonlightapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.utils.Removable
import com.example.moonlightapp.databinding.CartItemBinding
import com.example.moonlightapp.entity.Cart
import kotlinx.android.synthetic.main.cart_item.view.*

class CartAdapter(
    var context: Context,
    private var removable: Removable
) :
    RecyclerView.Adapter<CartAdapter.ViewHolder>() {

    private var cartItems: MutableList<Cart> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val binding: CartItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.cart_item,
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = cartItems.size

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val model = cartItems[position]
        viewHolder.bind(model)
        viewHolder.itemView.removeItem.setOnClickListener {
            removable.removeFromCart(cartItems, position)
            notifyDataSetChanged()
        }
    }

    class ViewHolder(private val binding: CartItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Cart) {
            binding.cart = data
            binding.productQuantity.text = data.quantity.toString()
        }
    }

    fun setList(cartList: MutableList<Cart>) {
        cartItems = cartList
        notifyDataSetChanged()
    }
}