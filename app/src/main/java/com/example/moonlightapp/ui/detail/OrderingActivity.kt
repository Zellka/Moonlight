package com.example.moonlightapp.ui.detail

import android.os.Build
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.moonlightapp.R
import com.example.moonlightapp.entity.HistoryOrder
import com.example.moonlightapp.viewmodels.OrderViewModel
import kotlinx.android.synthetic.main.activity_ordering.*
import java.text.SimpleDateFormat
import java.util.*

class OrderingActivity : AppCompatActivity() {

    private lateinit var orderViewModel: OrderViewModel

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ordering)
        orderViewModel = ViewModelProvider(this).get(OrderViewModel::class.java)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.title = "Оформление заказа"
        val arguments = intent.extras
        val totalSum = arguments!!["TOTAL_SUM"].toString()
        btn_order.text = "Заказать за $totalSum"
        val orderNum = (1..1001).random()
        val date: String = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(Date())
        val order = HistoryOrder("Заказ № $orderNum", date, totalSum)
        btn_order.setOnClickListener {
            if (edit_name.text!!.isNotEmpty() && edit_number.text!!.isNotEmpty() && edit_address.text!!.isNotEmpty()) {
                Toast.makeText(this, "Заказ оформлен", Toast.LENGTH_SHORT).show()
                orderViewModel.addOrder(order)
                this.finish()
            }
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
}