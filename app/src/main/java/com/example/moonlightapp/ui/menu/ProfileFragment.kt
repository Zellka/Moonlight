package com.example.moonlightapp.ui.menu

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.moonlightapp.ui.AuthorizationActivity
import com.example.moonlightapp.ui.DeliveryActivity
import com.example.moonlightapp.R

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_profile, container, false)
        val textGreeting = root.findViewById<TextView>(R.id.text_greeting)
        val textLogInOut = root.findViewById<TextView>(R.id.text_log_in_out)
        val btnLogInOut = root.findViewById<Button>(R.id.log_in_out)
        val btnOrderHistory = root.findViewById<Button>(R.id.order_history)
        val btnFavorites = root.findViewById<Button>(R.id.favorites)
        val btnDelivery = root.findViewById<Button>(R.id.delivery)
        val intent = Intent(this.context, AuthorizationActivity::class.java)
        btnLogInOut.setOnClickListener {
            startActivity(intent)
        }
        val intentDel = Intent(this.context, DeliveryActivity::class.java)
        btnDelivery.setOnClickListener {
            startActivity(intentDel)
        }

        return root
    }

}