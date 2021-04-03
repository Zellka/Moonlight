package com.example.moonlightapp.ui.detail

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.moonlightapp.R
import com.example.moonlightapp.adapter.FavouriteAdapter
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.utils.AddableToCart
import com.example.moonlightapp.utils.UpdatableFavourites
import com.example.moonlightapp.viewmodels.FavouriteViewModel
import com.google.android.material.snackbar.Snackbar
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import kotlinx.android.synthetic.main.activity_favourite.*

class FavouriteActivity : AppCompatActivity(), UpdatableFavourites, AddableToCart {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FavouriteAdapter
    private lateinit var favouriteViewModel: FavouriteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourite)
        favouriteViewModel = ViewModelProvider(this).get(FavouriteViewModel::class.java)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.title = "Избранное"

        recyclerView = findViewById(R.id.rv_favourite)
        recyclerView.layoutManager =
            GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        adapter = FavouriteAdapter(this, this)
        getFavouriteList()
        recyclerView.adapter = adapter

        val swipeRefresh = findViewById<SwipeRefreshLayout>(R.id.swipe_refresh)
        swipeRefresh.setOnRefreshListener {
            getFavouriteList()
            swipeRefresh.isRefreshing = false
        }
    }

    private fun getFavouriteList() {
        favouriteViewModel.getFavouritesList()
        favouriteViewModel.favouritesMutableLiveData.observe(this) { postModels ->
            adapter.setList(postModels)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                this.finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun addToFavourites(item: Dish) {
        favouriteViewModel.addToFavourites(item)
    }

    @SuppressLint("CheckResult")
    override fun addToCart(cartItem: Cart) {
        favouriteViewModel.getCartList()
        Snackbar.make(favorite_layout, "Добавлено: " + cartItem.product.name, Snackbar.LENGTH_SHORT)
            .setBackgroundTint(
                Color.parseColor("#FFFFFF")
            ).setTextColor(Color.BLACK)
            .show()
        Observable.create(ObservableOnSubscribe<MutableList<Cart>> {
            favouriteViewModel.addDishToCart(cartItem)
            favouriteViewModel.cartMutableLiveData.observe(this) { postModels ->
                it.onNext(postModels)
            }
        }).subscribe()
    }
}