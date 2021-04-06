package com.example.moonlightapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moonlightapp.data.FavouriteList
import com.example.moonlightapp.data.ShoppingCart
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Dish

class FavouriteViewModel : ViewModel() {

    private var favourites: FavouriteList = FavouriteList()
    var cartMutableLiveData: MutableLiveData<MutableList<Cart>> =
    MutableLiveData()
    private var cart: ShoppingCart = ShoppingCart()

    var favouritesMutableLiveData: MutableLiveData<MutableList<Dish>> =
        MutableLiveData()

    fun getFavouritesList() {
        favouritesMutableLiveData.value = favourites.getFavouriteList()
    }

    fun updateFavourites(dishItem: Dish) {
        favourites.updateItem(dishItem)
    }

    fun addDishToCart(cartItem: Cart){
        cart.addItem(cartItem)
    }

    fun getCartList(){
        cartMutableLiveData.value = cart.getCart()
    }
}