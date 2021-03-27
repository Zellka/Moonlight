package com.example.moonlightapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moonlightapp.data.FavouriteList
import com.example.moonlightapp.entity.Dish

class FavouriteViewModel : ViewModel() {

    var favouritesMutableLiveData: MutableLiveData<MutableList<Dish>> =
        MutableLiveData()

    fun getFavouritesList() {
        favouritesMutableLiveData.value = FavouriteList.getFavouriteList()
    }

    fun addToFavourites(dishItem: Dish) {
        FavouriteList.updateItem(dishItem)
    }
}