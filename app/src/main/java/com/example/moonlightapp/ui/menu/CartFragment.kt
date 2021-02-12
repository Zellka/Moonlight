package com.example.moonlightapp.ui.menu

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.adapter.ShoppingCartAdapter
import com.example.moonlightapp.cart.CartItem
import com.example.moonlightapp.cart.ShoppingCart
import com.example.moonlightapp.ui.MainActivity
import com.example.moonlightapp.common.Removable
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import kotlinx.android.synthetic.main.activity_main.*

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

    @SuppressLint("CheckResult")
    override fun removeDish(cartItems: MutableList<CartItem>, position: Int) {
        Observable.create(ObservableOnSubscribe<MutableList<CartItem>> {
            ShoppingCart.removeItem(cartItems, position)
            it.onNext(ShoppingCart.getCart())
        }).subscribe { cart ->
            var quantity = 0
            cart.forEach { basketItem ->
                quantity += basketItem.quantity
            }
            (context as MainActivity).nav_view.getOrCreateBadge(R.id.navigation_cart).number =
                quantity
        }
    }
}