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
import com.example.moonlightapp.cart.ShoppingCart
import com.squareup.picasso.Picasso

class ShoppingCartAdapter(var context: Context, var cartItems: MutableList<CartItem>) :
    RecyclerView.Adapter<ShoppingCartAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ShoppingCartAdapter.ViewHolder {
        val layout = LayoutInflater.from(context).inflate(R.layout.cart_item, parent, false)
        return ViewHolder(layout)
    }

    override fun getItemCount(): Int = cartItems.size

    override fun onBindViewHolder(viewHolder: ShoppingCartAdapter.ViewHolder, position: Int) {
        //viewHolder.bindItem(cartItems[position])
        viewHolder.nameDish!!.text = cartItems[position].product.name
        viewHolder.priceDish!!.text = cartItems[position].product.price.toString()
        viewHolder.quantity!!.text = cartItems[position].quantity.toString()
        Picasso.get()
            .load(cartItems[position].product.url)
            .into(viewHolder.imgDish)
        Picasso.get().load(cartItems[position].product.url).fit().into(viewHolder.imgDish)
        viewHolder.remove?.setOnClickListener {
            ShoppingCart.removeItem(cartItems, position)
            notifyDataSetChanged()
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var imgDish: ImageView? = null
        var nameDish: TextView? = null
        var priceDish: TextView? = null
        var remove: Button? = null
        var quantity: TextView? = null

        init {
            imgDish = itemView.findViewById(R.id.product_image)
            nameDish = itemView.findViewById(R.id.product_name)
            priceDish = itemView.findViewById(R.id.product_price)
            remove = itemView.findViewById(R.id.removeItem)
            quantity = itemView.findViewById(R.id.product_quantity)
        }
        /*@SuppressLint("SetTextI18n", "CheckResult")
        fun bindItem(cartItem: CartItem) {

            Picasso.get().load(cartItem.product.url).fit().into(itemView.product_image)
            itemView.product_name.text = cartItem.product.name
            itemView.product_price.text = "$${cartItem.product.price}"
            itemView.product_quantity.text = cartItem.quantity.toString()

            Observable.create(ObservableOnSubscribe<MutableList<CartItem>> {

                itemView.removeItem.setOnClickListener { view ->
                    val item =
                        CartItem(cartItem.product)
                    ShoppingCart.removeItem(item)
                    Toast.makeText(itemView.context, "Удалено: " + cartItem.product.name, Toast.LENGTH_SHORT).show()
                    it.onNext(ShoppingCart.getCart())
                }

            }).subscribe { cart ->
                var quantity = 0
                cart.forEach { basketItem ->
                    quantity += basketItem.quantity
                }
                (itemView.context as MainActivity).nav_view.getOrCreateBadge(R.id.navigation_basket).number =
                    quantity
            }
        }*/
    }
}