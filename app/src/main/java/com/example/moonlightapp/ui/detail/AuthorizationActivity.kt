package com.example.moonlightapp.ui.detail

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.moonlightapp.R
import com.example.moonlightapp.databinding.ActivityAuthorizationBinding

class AuthorizationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAuthorizationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_authorization)
        binding.btnSignUp.setOnClickListener {
            if (binding.enterName.text!!.isNotEmpty() && binding.enterNumber.text!!.isNotEmpty()) {
                val intent = Intent()
                intent.putExtra("NAME_USER", binding.enterName.text.toString())
                setResult(RESULT_OK, intent)
                this.finish()
            } else {
                Toast.makeText(this, "Введите данные", Toast.LENGTH_SHORT).show()
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