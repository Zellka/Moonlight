package com.example.moonlightapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moonlightapp.data.FavoritesList
import com.example.moonlightapp.data.ShoppingCart
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Dish

class FavoritesViewModel : ViewModel() {

    var cartMutableLiveData: MutableLiveData<MutableList<Cart>> =
        MutableLiveData()
    var favoritesMutableLiveData: MutableLiveData<MutableList<Dish>> =
        MutableLiveData()

    private var favorites: FavoritesList = FavoritesList()
    private var cart: ShoppingCart = ShoppingCart()

    fun getFavoritesList() {
        favoritesMutableLiveData.value = favorites.getFavoriteList()
    }

    fun updateFavorites(dishItem: Dish) {
        favorites.updateFavorite(dishItem)
    }

    fun addDishToCart(cartItem: Cart) {
        cart.addDish(cartItem)
    }

    fun getCartList() {
        cartMutableLiveData.value = cart.getCart()
    }
}