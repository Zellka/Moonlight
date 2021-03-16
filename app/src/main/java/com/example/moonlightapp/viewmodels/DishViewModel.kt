package com.example.moonlightapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moonlightapp.data.ShoppingCart
import com.example.moonlightapp.data.CategoriesModel
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Categories

class DishViewModel: ViewModel() {

    var categoriesMutableLiveData: MutableLiveData<MutableList<Categories>> =
        MutableLiveData()

    var cartMutableLiveData: MutableLiveData<MutableList<Cart>> =
        MutableLiveData()

    private var dishData: CategoriesModel = CategoriesModel()

    fun getAllCategoriesList() {
        categoriesMutableLiveData.value = dishData.getData()
    }

    fun addDishToCart(cartItem: Cart){
        ShoppingCart.addItem(cartItem)
    }

    fun removeDishFromCart(cartItems:MutableList<Cart>, position: Int){
        ShoppingCart.removeItem(cartItems, position)
    }

//    fun getCartList(): MutableList<Cart>{
//        return ShoppingCart.getCart()
//    }

    fun getCartList(){
        cartMutableLiveData.value = ShoppingCart.getCart()
    }
}