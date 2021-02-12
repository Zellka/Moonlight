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
import com.example.moonlightapp.adapter.CategoriesAdapter
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.cart.ShoppingCart
import com.example.moonlightapp.entity.Categories
import com.example.moonlightapp.data.CategoriesModel
import com.example.moonlightapp.ui.DishFragment
import com.example.moonlightapp.ui.MainActivity
import com.example.moonlightapp.common.ItemClickListener
import com.example.moonlightapp.entity.Dish
import io.reactivex.ObservableOnSubscribe
import kotlinx.android.synthetic.main.activity_main.*
import io.reactivex.Observable
import java.util.*

class MenuFragment : Fragment(), ItemClickListener {

    private lateinit var root: View
    private lateinit var recyclerView: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter
    private var dishData: CategoriesModel = CategoriesModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        root = inflater.inflate(R.layout.fragment_menu, container, false)
        setCategoriesRecycler(dishData.getData())
        return root
    }

    private fun setCategoriesRecycler(allCategory: List<Categories>) {
        recyclerView = root.findViewById(R.id.items_main)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        categoriesAdapter = CategoriesAdapter(this.requireContext(), allCategory)
        categoriesAdapter.setOnItemClickListener(this)
        recyclerView.adapter = categoriesAdapter
    }

    override fun onItemClick(item: Dish) {
        val dishFragment = DishFragment()
        //val dishFragment = DishFragment.newInstance(name, price)
        val args = Bundle()
        args.putString("nameDish", item.name)
        args.putString("imgDish", item.url)
        args.putInt("priceDish", item.price)
        dishFragment.arguments = args
        dishFragment.show(this@MenuFragment.requireFragmentManager(), "Dialog")
    }

    @SuppressLint("CheckResult")
    override fun addToCart(cartItem: Cart) {
        Observable.create(ObservableOnSubscribe<MutableList<Cart>> {
            ShoppingCart.addItem(cartItem)
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