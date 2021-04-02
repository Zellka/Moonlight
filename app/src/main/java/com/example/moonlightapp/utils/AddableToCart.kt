package com.example.moonlightapp.utils

import com.example.moonlightapp.entity.Cart

interface AddableToCart {
    fun addToCart(cartItem: Cart)
}