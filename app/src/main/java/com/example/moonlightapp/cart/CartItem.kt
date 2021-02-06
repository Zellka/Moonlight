package com.example.moonlightapp.cart

import com.example.moonlightapp.models.CategoryItem

data class CartItem(var product: CategoryItem, var quantity: Int = 0)