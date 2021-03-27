package com.example.moonlightapp.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.adapter.CategoriesAdapter
import com.example.moonlightapp.utils.Addable
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.ui.detail.DishFragment
import com.example.moonlightapp.ui.MainActivity
import com.example.moonlightapp.utils.ItemClickable
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.utils.FavouriteClickable
import com.example.moonlightapp.viewmodels.MenuViewModel
import io.reactivex.ObservableOnSubscribe
import kotlinx.android.synthetic.main.activity_main.*
import io.reactivex.Observable
import java.util.*

class MenuFragment : Fragment(), ItemClickable, Addable, FavouriteClickable {

    private lateinit var recyclerView: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter
    private lateinit var dishViewModel: MenuViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dishViewModel = ViewModelProvider(this).get(MenuViewModel::class.java)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dishViewModel.getAllCategoriesList()
        recyclerView = view.findViewById(R.id.recycler_parent)
        recyclerView.layoutManager = LinearLayoutManager(context)
        categoriesAdapter = CategoriesAdapter(this.requireContext(), this, this)
        categoriesAdapter.setOnItemClickListener(this)
        dishViewModel.categoriesMutableLiveData.observe(
            viewLifecycleOwner
        ) { postModels ->
            categoriesAdapter.setList(postModels)
        }
        recyclerView.adapter = categoriesAdapter
    }

    override fun showDish(item: Dish) {
        val dishFragment = DishFragment()
        val args = Bundle()
        args.putString("NAME_DISH", item.name)
        args.putString("IMAGE_DISH", item.url)
        args.putString("PRICE_DISH", item.price)
        dishFragment.arguments = args
        dishFragment.show(this@MenuFragment.requireFragmentManager(), "Dialog")
    }

    @SuppressLint("CheckResult")
    override fun addToCart(cartItem: Cart) {
        dishViewModel.getCartList()
        Observable.create(ObservableOnSubscribe<MutableList<Cart>> {
            dishViewModel.addDishToCart(cartItem)
            dishViewModel.cartMutableLiveData.observe(viewLifecycleOwner) { postModels ->
                it.onNext(postModels)
            }
        }).subscribe { cart ->
            var quantity = 1
            cart.forEach { cartItem ->
                quantity += cartItem.quantity
            }
            (context as MainActivity).nav_view.getOrCreateBadge(R.id.navigation_cart).number =
                quantity
        }
    }

    override fun addToFavourites(item: Dish) {
        dishViewModel.addToFavourites(item)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.search_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.search_action) {
            val searchView = item.actionView as SearchView
            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    return false
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    categoriesAdapter.filter.filter(newText)
                    return true
                }
            })
        }
        return super.onOptionsItemSelected(item)
    }
}