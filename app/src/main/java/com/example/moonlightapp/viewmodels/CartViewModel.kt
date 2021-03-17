package com.example.moonlightapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moonlightapp.data.ShoppingCart
import com.example.moonlightapp.entity.Cart

class CartViewModel: ViewModel() {

    var cartMutableLiveData: MutableLiveData<MutableList<Cart>> =
        MutableLiveData()

    fun addDishToCart(cartItem: Cart){
        ShoppingCart.addItem(cartItem)
    }

    fun removeDishFromCart(cartItems:MutableList<Cart>, position: Int){
        ShoppingCart.removeItem(cartItems, position)
    }

    fun getCartList(){
        cartMutableLiveData.value = ShoppingCart.getCart()
    }
}