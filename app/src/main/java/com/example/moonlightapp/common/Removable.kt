package com.example.moonlightapp.common

import com.example.moonlightapp.entity.Cart

interface Removable {
    fun removeFromCart(cartItems: MutableList<Cart>, position: Int)
}