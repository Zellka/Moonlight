package com.example.moonlightapp.ui.menu

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
import com.example.moonlightapp.adapter.ShoppingCartAdapter
import com.example.moonlightapp.common.ItemClickListener
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.data.ShoppingCart
import com.example.moonlightapp.ui.MainActivity
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.ui.DishFragment
import com.example.moonlightapp.viewmodels.DishViewModel
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import kotlinx.android.synthetic.main.activity_main.*

class CartFragment : Fragment(), ItemClickListener {
    lateinit var adapter: ShoppingCartAdapter
    private lateinit var recyclerView: RecyclerView
    lateinit var dishViewModel: DishViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dishViewModel = ViewModelProvider(this).get(DishViewModel::class.java)
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
        adapter = ShoppingCartAdapter(this.requireContext(), this)
        recyclerView = view.findViewById(R.id.rv_basket)
        dishViewModel.getCartList()
        dishViewModel.cartMutableLiveData.observe(viewLifecycleOwner){
                postModels -> adapter.setList(postModels)
        }
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
    }

    override fun showItem(item: Dish) {
        val dishFragment = DishFragment()
        val args = Bundle()
        args.putString("nameDish", item.name)
        args.putString("imgDish", item.url)
        args.putString("priceDish", item.price)
        dishFragment.arguments = args
        dishFragment.show(this@CartFragment.requireFragmentManager(), "Dialog")
    }

    @SuppressLint("CheckResult")
    override fun addToCart(cartItem: Cart) {
    }

    @SuppressLint("CheckResult")
    override fun removeDish(cartItems: MutableList<Cart>, position: Int) {
        Observable.create(ObservableOnSubscribe<MutableList<Cart>> {
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