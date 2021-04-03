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
import com.example.moonlightapp.ui.MainActivity
import com.example.moonlightapp.ui.detail.DeliveryActivity
import com.example.moonlightapp.ui.detail.FavouriteActivity
import com.example.moonlightapp.ui.detail.HistoryOrdersActivity
import kotlinx.android.synthetic.main.activity_main.*

class InfoFragment : Fragment() {
    private lateinit var binding: FragmentInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (context as MainActivity).toolbar_title.text = context?.getString(R.string.title_info)
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