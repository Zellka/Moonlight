package com.example.moonlightapp.data

import com.example.moonlightapp.entity.Dish
import io.paperdb.Paper

class FavoritesList {

    fun updateFavorite(item: Dish) {
        val favoriteList = getFavoriteList()
        val targetItem = favoriteList.singleOrNull { it.name == item.name }
        if (targetItem == null) {
            favoriteList.add(item)
        } else {
            favoriteList.remove(item)
        }
        saveList(favoriteList)
    }

    fun isFavorite(item: Dish): Boolean {
        val favouriteList = getFavoriteList()
        return favouriteList.contains(item)
    }

    private fun saveList(favorites: MutableList<Dish>) {
        Paper.book().write("favorites", favorites)
    }

    fun getFavoriteList(): MutableList<Dish> {
        return Paper.book().read("favorites", mutableListOf())
    }
}