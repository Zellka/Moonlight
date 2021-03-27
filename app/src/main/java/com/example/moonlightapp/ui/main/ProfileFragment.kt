package com.example.moonlightapp.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.moonlightapp.R
import com.example.moonlightapp.databinding.FragmentProfileBinding
import com.example.moonlightapp.ui.detail.AuthorizationActivity
import com.example.moonlightapp.ui.detail.DeliveryActivity
import com.example.moonlightapp.ui.detail.FavouriteActivity
import com.example.moonlightapp.ui.detail.HistoryOrdersActivity

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.fragment_profile,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val intent = Intent(this.context, AuthorizationActivity::class.java)
        binding.logInOut.setOnClickListener {
            startActivityForResult(intent, 1)
        }
        val intentDelivery = Intent(this.context, DeliveryActivity::class.java)
        binding.delivery.setOnClickListener {
            startActivity(intentDelivery)
        }
        val intentFavorites = Intent(this.context, FavouriteActivity::class.java)
        binding.favorites.setOnClickListener {
            startActivity(intentFavorites)
        }
        val intentOrders = Intent(this.context, HistoryOrdersActivity::class.java)
        binding.orderHistory.setOnClickListener {
            startActivity(intentOrders)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data == null) {
            return
        }
        binding.textGreeting.text = data.getStringExtra("NAME_USER")
        binding.textLogInOut.setText(R.string.log_out)
        binding.logInOut.isVisible = false
        binding.logInOut.isClickable = false

    }
}