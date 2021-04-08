package com.example.moonlightapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moonlightapp.data.ShoppingCart
import com.example.moonlightapp.data.CategoriesRepository
import com.example.moonlightapp.data.FavoritesList
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Categories
import com.example.moonlightapp.entity.Dish

class MenuViewModel: ViewModel() {

    var categoriesMutableLiveData: MutableLiveData<MutableList<Categories>> =
        MutableLiveData()

    var cartMutableLiveData: MutableLiveData<MutableList<Cart>> =
        MutableLiveData()

    private var dishData: CategoriesRepository = CategoriesRepository()
    private var cart: ShoppingCart = ShoppingCart()
    private var favourites: FavoritesList = FavoritesList()

    fun getAllCategoriesList() {
        categoriesMutableLiveData.value = dishData.getData()
    }

    fun addDishToCart(cartItem: Cart){
        cart.addDish(cartItem)
    }

    fun updateFavourites(dishItem: Dish){
        favourites.updateFavorite(dishItem)
    }

    fun getCartList(){
        cartMutableLiveData.value = cart.getCart()
    }
}