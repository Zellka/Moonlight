package com.example.moonlightapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.moonlightapp.R
import com.example.moonlightapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var images = intArrayOf(R.drawable.food1, R.drawable.food2, R.drawable.food3)
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.fragment_home,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewFlipper
        for (i in images) {
            binding.viewFlipper.setInAnimation(this.context, android.R.anim.slide_in_left)
            binding.viewFlipper.setOutAnimation(this.context, android.R.anim.slide_out_right)
            val view = ImageView(this.context)
            view.setImageResource(i)
            binding.viewFlipper.addView(view)
        }
    }
}