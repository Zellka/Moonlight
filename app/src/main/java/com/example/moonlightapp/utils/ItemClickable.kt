package com.example.moonlightapp.utils

import com.example.moonlightapp.entity.Dish

interface ItemClickable {
    fun showDish(item: Dish)
}