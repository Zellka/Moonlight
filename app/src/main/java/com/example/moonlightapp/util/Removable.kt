package com.example.moonlightapp.util

import com.example.moonlightapp.cart.CartItem

interface Removable {
    fun removeDish(cartItems: MutableList<CartItem>, position: Int)
}