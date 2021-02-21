package com.example.moonlightapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.moonlightapp.R
import com.google.android.material.textfield.TextInputLayout

class AuthorizationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization)

        val enterName = findViewById<EditText>(R.id.enter_name)
        val btnSignUp = findViewById<Button>(R.id.btn_sign_up)
        val nameError = findViewById<TextInputLayout>(R.id.name_error)
        val numberError = findViewById<TextInputLayout>(R.id.number_error)
        val enterNumber = findViewById<EditText>(R.id.enter_number)

        btnSignUp.setOnClickListener {
            if(enterName.text.isNotEmpty() && enterNumber.text.isNotEmpty()){
                val intent = Intent()
                intent.putExtra("nameUser", enterName.text.toString())
                setResult(0, intent)
                this.finish();

            }
            else {
                Toast.makeText(this, "Введите данные", Toast.LENGTH_SHORT).show()
            }
        }
    }

}