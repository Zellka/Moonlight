package com.example.moonlightapp.ui.main

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.adapter.CartAdapter
import com.example.moonlightapp.utils.Removable
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.ui.MainActivity
import com.example.moonlightapp.ui.detail.OrderingActivity
import com.example.moonlightapp.utils.Addable
import com.example.moonlightapp.viewmodels.CartViewModel
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import kotlinx.android.synthetic.main.activity_main.*

class CartFragment : Fragment(), Removable, Addable {
    private lateinit var adapter: CartAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var cartViewModel: CartViewModel
    private lateinit var totalTextView: TextView
    private lateinit var btnToOrder: Button
    private lateinit var dishList: MutableList<Cart>

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
        adapter = CartAdapter(this.requireContext(), this, this)
        recyclerView = view.findViewById(R.id.rv_basket)
        cartViewModel.getCartList()
        cartViewModel.cartMutableLiveData.observe(viewLifecycleOwner) { postModels ->
            adapter.setList(postModels)
            dishList = postModels
        }
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
        totalTextView = view.findViewById(R.id.total_price)
        btnToOrder = view.findViewById(R.id.button_order)
        cartViewModel.getTotalPrice()
        var totalSum = ""
        cartViewModel.totalPriceMutableLiveData.observe(viewLifecycleOwner) { totalPrice ->
            totalTextView.text = "$totalPrice"
            totalSum = "$totalPrice ₽"
        }
        btnToOrder.setOnClickListener {
            if (totalTextView.text != "0.0") {
                if (totalTextView.text.toString().toDouble() > 400.0) {
                    val intent = Intent(context, OrderingActivity::class.java)
                    intent.putExtra("TOTAL_SUM", totalSum)
                    context?.startActivity(intent)
                } else {
                    Toast.makeText(context, "Минимальная сумма заказа 400₽", Toast.LENGTH_SHORT)
                        .show()
                }

            } else {
                Toast.makeText(context, "Корзина пуста", Toast.LENGTH_SHORT).show()
            }
        }
    }

    @SuppressLint("CheckResult")
    override fun removeFromCart(cartItems: MutableList<Cart>, position: Int) {
        Observable.create(ObservableOnSubscribe<MutableList<Cart>> {
            cartViewModel.removeDishFromCart(cartItems, position)
            cartViewModel.cartMutableLiveData.observe(viewLifecycleOwner) { postModels ->
                it.onNext(postModels)
            }
        }).subscribe { cart ->
            var quantity = 0
            cart.forEach { cartItem ->
                quantity += cartItem.quantity
            }
            cartViewModel.getTotalPrice()
            cartViewModel.totalPriceMutableLiveData.observe(viewLifecycleOwner) { totalPrice ->
                totalTextView.text = "$totalPrice"
            }
            (context as MainActivity).nav_view.getOrCreateBadge(R.id.navigation_cart).number =
                quantity
        }
    }

    @SuppressLint("CheckResult")
    override fun addToCart(cartItem: Cart) {
        cartViewModel.getCartList()
        Observable.create(ObservableOnSubscribe<MutableList<Cart>> {
            cartViewModel.addDishToCart(cartItem)
            cartViewModel.cartMutableLiveData.observe(viewLifecycleOwner) { postModels ->
                it.onNext(postModels)
            }
        }).subscribe { cart ->
            var quantity = 1
            cart.forEach { cartItem ->
                quantity += cartItem.quantity
            }
            cartViewModel.getTotalPrice()
            cartViewModel.totalPriceMutableLiveData.observe(viewLifecycleOwner) { totalPrice ->
                totalTextView.text = "$totalPrice"
            }
            (context as MainActivity).nav_view.getOrCreateBadge(R.id.navigation_cart).number =
                quantity
        }
    }
}