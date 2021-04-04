package com.example.moonlightapp.ui.main

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.moonlightapp.R
import com.example.moonlightapp.adapter.CategoriesAdapter
import com.example.moonlightapp.utils.AddableToCart
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.ui.detail.DishFragment
import com.example.moonlightapp.ui.MainActivity
import com.example.moonlightapp.utils.ShowableDish
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.ui.detail.FavouriteActivity
import com.example.moonlightapp.utils.UpdatableFavourites
import com.example.moonlightapp.viewmodels.MenuViewModel
import com.google.android.material.snackbar.Snackbar
import io.reactivex.ObservableOnSubscribe
import kotlinx.android.synthetic.main.activity_main.*
import io.reactivex.Observable
import kotlinx.android.synthetic.main.fragment_menu.*
import java.util.*

class MenuFragment : Fragment(), ShowableDish, AddableToCart, UpdatableFavourites {

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
        recyclerView = view.findViewById(R.id.recycler_parent)
        val swipeRefresh: SwipeRefreshLayout = view.findViewById(R.id.swipe_refresh)
        recyclerView.layoutManager = LinearLayoutManager(context)
        categoriesAdapter = CategoriesAdapter(this.requireContext(), this, this)
        categoriesAdapter.setOnItemClickListener(this)
        getDishList()
        recyclerView.adapter = categoriesAdapter
        swipeRefresh.setOnRefreshListener {
            getDishList()
            swipeRefresh.isRefreshing = false
        }
    }

    private fun getDishList() {
        dishViewModel.getAllCategoriesList()
        dishViewModel.categoriesMutableLiveData.observe(
            viewLifecycleOwner
        ) { postModels ->
            categoriesAdapter.setList(postModels)
        }
    }

    override fun showDish(item: Dish) {
        val dishFragment = DishFragment()
        val args = Bundle()
        args.putString("NAME_DISH", item.name)
        args.putString("PRICE_DISH", item.price)
        args.putString("IMAGE_DISH", item.url)
        args.putString("DESCRIPTION_DISH", item.description)
        args.putString("WEIGHT_DISH", item.weight)
        args.putString("CALORIES_DISH", item.calories)
        dishFragment.arguments = args
        dishFragment.show(this@MenuFragment.requireFragmentManager(), "Dialog")
    }

    @SuppressLint("CheckResult")
    override fun addToCart(cartItem: Cart) {
        dishViewModel.getCartList()
        Snackbar.make(menu_container, "Добавлено: " + cartItem.product.name, Snackbar.LENGTH_SHORT)
            .setBackgroundTint(
                Color.parseColor("#FFFFFF")
            ).setTextColor(Color.BLACK)
            .show()
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
        inflater.inflate(R.menu.search_fav_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.action_search) {
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
        if (id == R.id.action_favourite) {
            val intent = Intent(this.context, FavouriteActivity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}