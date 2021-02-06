package com.example.moonlightapp.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.adapter.ShoppingCartAdapter
import com.example.moonlightapp.cart.CartItem
import com.example.moonlightapp.cart.ShoppingCart
import com.example.moonlightapp.util.Removable

class CartFragment : Fragment(), Removable {
    lateinit var adapter: ShoppingCartAdapter
    private lateinit var rv: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_cart, container, false)
        adapter = ShoppingCartAdapter(this.requireContext(), ShoppingCart.getCart(), this)
        rv = root.findViewById(R.id.rv_basket)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(context)
        return root
    }

    override fun removeDish(cartItems: MutableList<CartItem>, position: Int) {
        ShoppingCart.removeItem(cartItems, position)
        Toast.makeText(context, "Удалено", Toast.LENGTH_SHORT).show()
    }
}