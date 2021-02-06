package com.example.moonlightapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.cart.CartItem
import com.example.moonlightapp.util.Removable
import com.squareup.picasso.Picasso

class ShoppingCartAdapter(
    var context: Context,
    var cartItems: MutableList<CartItem>,
    private var removable: Removable
) :
    RecyclerView.Adapter<ShoppingCartAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ShoppingCartAdapter.ViewHolder {
        val layout = LayoutInflater.from(context).inflate(R.layout.cart_item, parent, false)
        return ViewHolder(layout)
    }

    override fun getItemCount(): Int = cartItems.size

    override fun onBindViewHolder(viewHolder: ShoppingCartAdapter.ViewHolder, position: Int) {
        val model = cartItems[position]
        viewHolder.nameDish!!.text = model.product.name
        viewHolder.priceDish!!.text = model.product.price.toString()
        viewHolder.quantity!!.text = model.quantity.toString()
        Picasso.get()
            .load(model.product.url)
            .into(viewHolder.imgDish)
        viewHolder.remove?.setOnClickListener {
            removable.removeDish(cartItems, position)
            notifyDataSetChanged()
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var imgDish: ImageView? = itemView.findViewById(R.id.product_image)
        var nameDish: TextView? = itemView.findViewById(R.id.product_name)
        var priceDish: TextView? = itemView.findViewById(R.id.product_price)
        var remove: Button? = itemView.findViewById(R.id.removeItem)
        var quantity: TextView? = itemView.findViewById(R.id.product_quantity)
    }
}