package com.example.moonlightapp.ui.detail

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.moonlightapp.R
import com.example.moonlightapp.databinding.ActivityAuthorizationBinding

class AuthorizationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAuthorizationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_authorization)
        binding.btnSignUp.setOnClickListener {
            if (binding.enterName.text!!.isNotEmpty() && binding.enterNumber.text!!.isNotEmpty()) {
                val intent = Intent()
                intent.putExtra("NAME_USER", binding.enterName.text.toString())
                setResult(RESULT_OK, intent)
                this.finish();
            } else {
                Toast.makeText(this, "Введите данные", Toast.LENGTH_SHORT).show()
            }
        }
    }
}