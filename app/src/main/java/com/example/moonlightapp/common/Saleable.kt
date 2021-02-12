package com.example.moonlightapp.common

import com.example.moonlightapp.entity.Cart

interface Saleable {
    fun onItemClick(name: String, price: Int, url: String)
    fun addToCart(cartItem: Cart, nameDish: String)
}