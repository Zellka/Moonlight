package com.example.moonlightapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moonlightapp.data.ShoppingCart
import com.example.moonlightapp.entity.Cart

class CartViewModel : ViewModel() {

    private var cart: ShoppingCart = ShoppingCart()

    var cartMutableLiveData: MutableLiveData<MutableList<Cart>> =
        MutableLiveData()

    var totalPriceMutableLiveData: MutableLiveData<Double> =
        MutableLiveData()

    fun removeDishFromCart(cartItems: MutableList<Cart>, position: Int) {
        cart.removeDish(cartItems, position)
    }

    fun getCartList() {
        cartMutableLiveData.value = cart.getCart()
    }

    fun getTotalPrice() {
        val totalPrice = cart.getCart()
            .fold(0.toDouble()) { acc, cartItem -> acc + cartItem.quantity.times(cartItem.product.price.toDouble()) }
        totalPriceMutableLiveData.value = totalPrice
    }

    fun clearAllList() {
        cart.clearList()
    }
}