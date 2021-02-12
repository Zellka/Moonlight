package com.example.moonlightapp.common

import com.example.moonlightapp.entity.Cart

interface Removable {
    fun removeDish(cartItems: MutableList<Cart>, position: Int)
}