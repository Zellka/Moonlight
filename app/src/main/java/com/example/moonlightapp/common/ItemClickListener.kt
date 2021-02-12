package com.example.moonlightapp.common

import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Dish

interface ItemClickListener {
    fun onItemClick(item: Dish)
    fun addToCart(cartItem: Cart)
}