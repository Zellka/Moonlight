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
import com.example.moonlightapp.adapter.MainRecyclerAdapter
import com.example.moonlightapp.cart.CartItem
import com.example.moonlightapp.cart.ShoppingCart
import com.example.moonlightapp.models.AllCategory
import com.example.moonlightapp.data.CategoriesModel
import com.example.moonlightapp.ui.DishFragment
import com.example.moonlightapp.ui.MainActivity
import com.example.moonlightapp.common.Saleable
import io.reactivex.ObservableOnSubscribe
import kotlinx.android.synthetic.main.activity_main.*
import io.reactivex.Observable
import java.util.*

class MenuFragment : Fragment(), Saleable {

    private lateinit var root: View
    private lateinit var mainCategoryRecycler: RecyclerView
    private lateinit var mainRecyclerAdapter: MainRecyclerAdapter
    private var dishData: CategoriesModel = CategoriesModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        root = inflater.inflate(R.layout.fragment_menu, container, false)
        setMainCategoryRecycler(dishData.getData())
        return root
    }

    private fun setMainCategoryRecycler(allCategory: List<AllCategory>) {
        mainCategoryRecycler = root.findViewById(R.id.items_main)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context)
        mainCategoryRecycler.layoutManager = layoutManager
        mainRecyclerAdapter = MainRecyclerAdapter(this.requireContext(), allCategory)
        mainRecyclerAdapter.setOnItemClickListener(this)
        mainCategoryRecycler.adapter = mainRecyclerAdapter
    }

    override fun onItemClick(name: String, price: Int, url: String) {
        val dishFragment = DishFragment()
        //val dishFragment = DishFragment.newInstance(name, price)
        val args = Bundle()
        args.putString("nameDish", name)
        args.putString("imgDish", url)
        args.putInt("priceDish", price)
        dishFragment.arguments = args
        dishFragment.show(this@MenuFragment.requireFragmentManager(), "Dialog")
    }

    @SuppressLint("CheckResult")
    override fun addToCart(cartItem: CartItem, nameDish: String) {
        Observable.create(ObservableOnSubscribe<MutableList<CartItem>> {
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