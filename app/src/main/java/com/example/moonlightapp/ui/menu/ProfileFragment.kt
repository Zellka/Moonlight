package com.example.moonlightapp.ui.menu

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.moonlightapp.R
import com.example.moonlightapp.ui.AuthorizationActivity
import com.example.moonlightapp.ui.DeliveryActivity

class ProfileFragment : Fragment() {

   private lateinit var textGreeting:TextView
   private lateinit var textLogInOut:TextView
   private lateinit var btnLogInOut:Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_profile, container, false)

        textGreeting = root.findViewById<TextView>(R.id.text_greeting)
        textLogInOut = root.findViewById<TextView>(R.id.text_log_in_out)
        btnLogInOut = root.findViewById<Button>(R.id.log_in_out)
        val btnOrderHistory = root.findViewById<Button>(R.id.order_history)
        val btnFavorites = root.findViewById<Button>(R.id.favorites)
        val btnDelivery = root.findViewById<Button>(R.id.delivery)

        val intent = Intent(this.context, AuthorizationActivity::class.java)
        btnLogInOut.setOnClickListener {
            startActivityForResult(intent, 1)
        }
        val intentDel = Intent(this.context, DeliveryActivity::class.java)
        btnDelivery.setOnClickListener {
            startActivity(intentDel)
        }
        return root
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==0){
            textGreeting.text = data!!.getStringExtra("nameUser") + "!"
            textLogInOut.setText(R.string.log_out)
            btnLogInOut.isVisible = false
            btnLogInOut.isClickable = false
        }
    }
}