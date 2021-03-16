package com.example.moonlightapp.common

import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Dish

interface ItemClickListener {
    fun showItem(item: Dish)
    fun addToCart(cartItem: Cart)
    fun removeDish(cartItems: MutableList<Cart>, position: Int)
}