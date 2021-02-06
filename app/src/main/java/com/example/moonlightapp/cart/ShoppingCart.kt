package com.example.moonlightapp.cart

import io.paperdb.Paper

class ShoppingCart {
    
    companion object {
        fun addItem(cartItem: CartItem) {
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

        fun removeItem(cartItems: MutableList<CartItem>, position: Int) {
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

        private fun saveCart(cart: MutableList<CartItem>) {
            Paper.book().write("cart", cart)
        }

        fun getCart(): MutableList<CartItem> {
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