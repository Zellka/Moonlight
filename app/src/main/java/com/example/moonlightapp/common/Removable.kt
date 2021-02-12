package com.example.moonlightapp.common

import com.example.moonlightapp.cart.CartItem

interface Removable {
    fun removeDish(cartItems: MutableList<CartItem>, position: Int)
}