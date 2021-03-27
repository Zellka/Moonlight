package com.example.moonlightapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moonlightapp.data.ShoppingCart
import com.example.moonlightapp.data.CategoriesRepository
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Categories

class MenuViewModel: ViewModel() {

    var categoriesMutableLiveData: MutableLiveData<MutableList<Categories>> =
        MutableLiveData()

    var cartMutableLiveData: MutableLiveData<MutableList<Cart>> =
        MutableLiveData()

    private var dishData: CategoriesRepository = CategoriesRepository()

    fun getAllCategoriesList() {
        categoriesMutableLiveData.value = dishData.getData()
    }

    fun addDishToCart(cartItem: Cart){
        ShoppingCart.addItem(cartItem)
    }

    fun getCartList(){
        cartMutableLiveData.value = ShoppingCart.getCart()
    }
}