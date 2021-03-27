package com.example.moonlightapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.adapter.OrderAdapter
import com.example.moonlightapp.data.OrderList

class HistoryOrdersActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: OrderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_orders)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        recyclerView = findViewById(R.id.rv_order)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = OrderAdapter()
        adapter.setList(OrderList.getOrdersList())
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
                OrderList.clearList()
                adapter.setList(OrderList.getOrdersList())
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}