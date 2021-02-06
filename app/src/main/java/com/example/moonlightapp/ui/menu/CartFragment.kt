package com.example.moonlightapp.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.adapter.ShoppingCartAdapter
import com.example.moonlightapp.cart.ShoppingCart

class CartFragment : Fragment() {
    lateinit var adapter: ShoppingCartAdapter
    private lateinit var rv: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_cart, container, false)
        adapter = ShoppingCartAdapter(this.requireContext(), ShoppingCart.getCart())
        rv = root.findViewById(R.id.rv_basket)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(context)
        return root
    }
}