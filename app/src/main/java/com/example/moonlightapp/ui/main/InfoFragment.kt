package com.example.moonlightapp.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.moonlightapp.R
import com.example.moonlightapp.databinding.FragmentInfoBinding
import com.example.moonlightapp.ui.detail.DeliveryActivity
import com.example.moonlightapp.ui.detail.HistoryOrdersActivity

class InfoFragment : Fragment() {
    private lateinit var binding: FragmentInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.fragment_info,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val intentDelivery = Intent(this.context, DeliveryActivity::class.java)
        binding.delivery.setOnClickListener {
            startActivity(intentDelivery)
        }
        val intentOrders = Intent(this.context, HistoryOrdersActivity::class.java)
        binding.orderHistory.setOnClickListener {
            startActivity(intentOrders)
        }
    }
}