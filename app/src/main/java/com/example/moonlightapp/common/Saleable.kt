package com.example.moonlightapp.common

import com.example.moonlightapp.cart.CartItem

interface Saleable {
    fun onItemClick(name: String, price: Int, url: String)
    fun addToCart(cartItem: CartItem, nameDish: String)
}