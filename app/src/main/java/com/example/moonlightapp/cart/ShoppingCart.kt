package com.example.moonlightapp.cart

import com.example.moonlightapp.models.Cart
import io.paperdb.Paper

class ShoppingCart {

    companion object {
        fun addItem(cartItem: Cart) {
            val cart = getCart()

            val targetItem = cart.singleOrNull { it.product.name == cartItem.product.name }
            if (targetItem == null) {
                cartItem.quantity++
                cart.add(cartItem)
            } else {
                targetItem.quantity++
            }
            saveCart(cart)
        }

        fun removeItem(cartItems: MutableList<Cart>, position: Int) {
            val targetItem =
                cartItems.singleOrNull { it.product.name == cartItems[position].product.name }
            if (targetItem != null) {
                if (targetItem.quantity > 1) {
                    targetItem.quantity--
                } else {
                    cartItems.removeAt(position)
                }
            }
            saveCart(cartItems)
        }

        private fun saveCart(cart: MutableList<Cart>) {
            Paper.book().write("cart", cart)
        }

        fun getCart(): MutableList<Cart> {
            return Paper.book().read("cart", mutableListOf())
        }

        fun getShoppingCartSize(): Int {
            var cartSize = 0
            getCart().forEach {
                cartSize += it.quantity;
            }
            return cartSize
        }
    }
}