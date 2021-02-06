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
import com.example.moonlightapp.adapter.MainRecyclerAdapter
import com.example.moonlightapp.cart.CartItem
import com.example.moonlightapp.cart.ShoppingCart
import com.example.moonlightapp.models.AllCategory
import com.example.moonlightapp.models.CategoriesRepository
import com.example.moonlightapp.ui.DishFragment
import com.example.moonlightapp.util.Saleable
import java.util.*

class MenuFragment : Fragment(), Saleable{

    private lateinit var root: View
    private lateinit var mainCategoryRecycler: RecyclerView
    private lateinit var mainRecyclerAdapter: MainRecyclerAdapter
    private var dishData: CategoriesRepository = CategoriesRepository()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?  ): View {
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
    override fun onItemClick(name: String, price: Int) {
        val dishFragment = DishFragment()
        //val dishFragment = DishFragment.newInstance(name, price)
        val args = Bundle()
        args.putString("nameDish", name)
        args.putInt("priceDish", price)
        dishFragment.arguments = args
        dishFragment.show(this@MenuFragment.requireFragmentManager(), "Dialog")
    }

    override fun addToCart(cartItem: CartItem, nameDish: String) {
        ShoppingCart.addItem(cartItem)
        Toast.makeText(context, "Добавлено: $nameDish", Toast.LENGTH_SHORT).show()
    }
}