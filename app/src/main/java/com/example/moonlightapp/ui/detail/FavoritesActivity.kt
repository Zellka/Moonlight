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
import com.example.moonlightapp.adapter.FavoriteAdapter
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.utils.AddableToCart
import com.example.moonlightapp.utils.UpdatableFavorites
import com.example.moonlightapp.viewmodels.FavoritesViewModel
import com.google.android.material.snackbar.Snackbar
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import kotlinx.android.synthetic.main.activity_favorites.*

class FavoritesActivity : AppCompatActivity(), UpdatableFavorites, AddableToCart {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FavoriteAdapter
    private lateinit var favoritesViewModel: FavoritesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites)
        favoritesViewModel = ViewModelProvider(this).get(FavoritesViewModel::class.java)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.title = "Избранное"

        recyclerView = findViewById(R.id.rv_favorite)
        recyclerView.layoutManager =
            GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        adapter = FavoriteAdapter(this, this)
        getFavouriteList()
        recyclerView.adapter = adapter

        val swipeRefresh = findViewById<SwipeRefreshLayout>(R.id.swipe_refresh)
        swipeRefresh.setOnRefreshListener {
            getFavouriteList()
            swipeRefresh.isRefreshing = false
        }
    }

    private fun getFavouriteList() {
        favoritesViewModel.getFavoritesList()
        favoritesViewModel.favoritesMutableLiveData.observe(this) { postModels ->
            adapter.setList(postModels)
        }
    }

    @SuppressLint("CheckResult")
    override fun addToCart(cartItem: Cart) {
        favoritesViewModel.getCartList()
        Snackbar.make(layout_favorite, "Добавлено: " + cartItem.product.name, Snackbar.LENGTH_SHORT)
            .setBackgroundTint(
                Color.parseColor("#FFFFFF")
            ).setTextColor(Color.BLACK)
            .show()
        Observable.create(ObservableOnSubscribe<MutableList<Cart>> {
            favoritesViewModel.addDishToCart(cartItem)
            favoritesViewModel.cartMutableLiveData.observe(this) { postModels ->
                it.onNext(postModels)
            }
        }).subscribe()
    }

    override fun updateItemFavorite(item: Dish) {
        favoritesViewModel.updateFavorites(item)
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
}