package com.example.moonlightapp.ui

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.moonlightapp.R
import com.example.moonlightapp.data.ShoppingCart
import io.paperdb.Paper

class MainActivity : AppCompatActivity() {

    private var cart: ShoppingCart = ShoppingCart()

    override fun onCreate(savedInstanceState: Bundle?) {
        Paper.init(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar_main)
        toolbar.title = ""
        setSupportActionBar(toolbar)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_menu,
                R.id.navigation_cart,
                R.id.navigation_chat,
                R.id.navigation_info
            )
        )
        navView.getOrCreateBadge(R.id.navigation_cart).number = cart.getShoppingCartSize()
        toolbar.setupWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}