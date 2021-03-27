package com.example.moonlightapp.ui.detail

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.moonlightapp.R
import com.example.moonlightapp.data.OrderList
import com.example.moonlightapp.entity.HistoryOrder
import kotlinx.android.synthetic.main.activity_ordering.*
import java.time.LocalDate

class OrderingActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ordering)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        val arguments = intent.extras
        val totalSum = arguments!!["TOTAL_SUM"].toString()
        val orderNum = (1..101).random()
        val date = LocalDate.now()
        val order = HistoryOrder("Заказ № $orderNum", date.toString(), totalSum)
        button_order.setOnClickListener {
            if (userName.text!!.isNotEmpty() && userNumber.text!!.isNotEmpty() && userHome.text!!.isNotEmpty() && userStreet.text!!.isNotEmpty()) {
                Toast.makeText(this, "Заказ оформлен", Toast.LENGTH_SHORT).show()
                OrderList.addItem(order)
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