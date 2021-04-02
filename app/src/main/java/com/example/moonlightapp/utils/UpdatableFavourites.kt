package com.example.moonlightapp.utils

import com.example.moonlightapp.entity.Dish

interface UpdatableFavourites {
    fun addToFavourites(item: Dish)
}