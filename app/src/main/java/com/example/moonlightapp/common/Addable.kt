package com.example.moonlightapp.common

import com.example.moonlightapp.entity.Cart

interface Addable {
    fun addToCart(cartItem: Cart)
}