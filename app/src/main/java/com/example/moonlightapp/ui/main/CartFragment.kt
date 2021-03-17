package com.example.moonlightapp.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.adapter.CartAdapter
import com.example.moonlightapp.common.Removable
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.ui.detail.MainActivity
import com.example.moonlightapp.viewmodels.CartViewModel
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import kotlinx.android.synthetic.main.activity_main.*

class CartFragment : Fragment(), Removable {
    lateinit var adapter: CartAdapter
    private lateinit var recyclerView: RecyclerView
    lateinit var cartViewModel: CartViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cartViewModel = ViewModelProvider(this).get(CartViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cart, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = CartAdapter(this.requireContext(), this)
        recyclerView = view.findViewById(R.id.rv_basket)
        cartViewModel.getCartList()
        cartViewModel.cartMutableLiveData.observe(viewLifecycleOwner){
                postModels -> adapter.setList(postModels)
        }
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
    }

    @SuppressLint("CheckResult")
    override fun removeFromCart(cartItems: MutableList<Cart>, position: Int) {
        Observable.create(ObservableOnSubscribe<MutableList<Cart>> {
            cartViewModel.removeDishFromCart(cartItems, position)
            cartViewModel.cartMutableLiveData.observe(viewLifecycleOwner){
                    postModels -> it.onNext(postModels)
            }
        }).subscribe { cart ->
            var quantity = 0
            cart.forEach { cartItem ->
                quantity += cartItem.quantity
            }
            (context as MainActivity).nav_view.getOrCreateBadge(R.id.navigation_cart).number =
                quantity
        }
    }
}