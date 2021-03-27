package com.example.moonlightapp.utils

import com.example.moonlightapp.entity.Cart

interface Addable {
    fun addToCart(cartItem: Cart)
}