package com.example.moonlightapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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

    }

}