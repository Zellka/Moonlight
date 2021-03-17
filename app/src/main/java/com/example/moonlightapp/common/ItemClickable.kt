package com.example.moonlightapp.common

import com.example.moonlightapp.entity.Dish

interface ItemClickable {
    fun showDish(item: Dish)
}