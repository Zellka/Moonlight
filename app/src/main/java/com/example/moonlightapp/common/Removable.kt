package com.example.moonlightapp.common

import com.example.moonlightapp.models.Cart

interface Removable {
    fun removeDish(cartItems: MutableList<Cart>, position: Int)
}