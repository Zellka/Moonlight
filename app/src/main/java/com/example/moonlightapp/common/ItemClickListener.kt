package com.example.moonlightapp.common

import com.example.moonlightapp.entity.Cart

interface ItemClickListener {
    fun onItemClick(name: String, price: Int, url: String)
    fun addToCart(cartItem: Cart)
}