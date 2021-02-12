package com.example.moonlightapp.common

import com.example.moonlightapp.models.Cart

interface Saleable {
    fun onItemClick(name: String, price: Int, url: String)
    fun addToCart(cartItem: Cart, nameDish: String)
}