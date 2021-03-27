package com.example.moonlightapp.utils

import com.example.moonlightapp.entity.Dish

interface FavouriteClickable {
    fun addToFavourites(item: Dish)
}