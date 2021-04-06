package com.example.moonlightapp.utils

import com.example.moonlightapp.entity.Dish

interface UpdatableFavorites {
    fun updateItemFavorite(item: Dish)
}