package com.example.moonlightapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.adapter.OrderAdapter
import com.example.moonlightapp.viewmodels.OrderViewModel

class HistoryOrdersActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: OrderAdapter
    private lateinit var orderViewModel: OrderViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_orders)
        orderViewModel = ViewModelProvider(this).get(OrderViewModel::class.java)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.title = "История заказов"

        recyclerView = findViewById(R.id.rv_order)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = OrderAdapter()
        orderViewModel.getAllOrderList()
        orderViewModel.ordersMutableLiveData.observe(this) { postModels ->
            adapter.setList(postModels)
        }
        recyclerView.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.clear_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                this.finish()
                true
            }
            R.id.clear_action -> {
                orderViewModel.clearAllList()
                orderViewModel.getAllOrderList()
                orderViewModel.ordersMutableLiveData.observe(this) { postModels ->
                    adapter.setList(postModels)
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}