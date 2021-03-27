package com.example.moonlightapp.ui.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.moonlightapp.R
import kotlinx.android.synthetic.main.activity_ordering.*

class OrderingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ordering)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        val intentHistory = Intent(this, HistoryOrdersActivity::class.java)
        button_order.setOnClickListener {
            if (userName.text!!.isNotEmpty() && userNumber.text!!.isNotEmpty() && userHome.text!!.isNotEmpty() && userStreet.text!!.isNotEmpty()) {
                startActivity(intentHistory)
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