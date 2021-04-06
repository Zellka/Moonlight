package com.example.moonlightapp.data

import com.example.moonlightapp.entity.Dish
import io.paperdb.Paper

class FavouriteList {

    fun updateItem(item: Dish) {
        val favouriteList = getFavouriteList()
        val targetItem = favouriteList.singleOrNull { it.name == item.name }
        if (targetItem == null) {
            favouriteList.add(item)
        } else {
            favouriteList.remove(item)
        }
        saveList(favouriteList)
    }

    fun isFavourite(item: Dish): Boolean {
        val favouriteList = getFavouriteList()
        return favouriteList.contains(item)
    }

    private fun saveList(favourites: MutableList<Dish>) {
        Paper.book().write("favourites", favourites)
    }

    fun getFavouriteList(): MutableList<Dish> {
        return Paper.book().read("favourites", mutableListOf())
    }
}