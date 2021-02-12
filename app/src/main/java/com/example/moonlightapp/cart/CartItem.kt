package com.example.moonlightapp.cart

import com.example.moonlightapp.models.Dish

data class CartItem(var product: Dish, var quantity: Int = 0)