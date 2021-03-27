package com.example.moonlightapp.utils

import com.example.moonlightapp.entity.Cart

interface Removable {
    fun removeFromCart(cartItems: MutableList<Cart>, position: Int)
}