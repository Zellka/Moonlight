package com.example.moonlightapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.adapter.FavouriteAdapter
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.utils.FavouriteClickable
import com.example.moonlightapp.viewmodels.FavouriteViewModel

class FavouriteActivity : AppCompatActivity(), FavouriteClickable {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FavouriteAdapter
    private lateinit var favouriteViewModel: FavouriteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourite)
        favouriteViewModel = ViewModelProvider(this).get(FavouriteViewModel::class.java)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        recyclerView = findViewById(R.id.rv_favourite)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = FavouriteAdapter(this)
        favouriteViewModel.getFavouritesList()
        favouriteViewModel.favouritesMutableLiveData.observe(this) { postModels ->
            adapter.setList(postModels)
        }
        recyclerView.adapter = adapter
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
}