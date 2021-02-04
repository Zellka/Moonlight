package com.example.moonlightapp.ui.menu

import android.content.Context
import android.media.Image
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ViewFlipper
import androidx.fragment.app.Fragment
import com.example.moonlightapp.R
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment(){

    private lateinit var viewFlipper:ViewFlipper
    private var images = intArrayOf(R.drawable.food1, R.drawable.food2, R.drawable.food3)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        viewFlipper = root.findViewById(R.id.view_flipper)
        flipImage()

        return root
    }

    private fun flipImage(){
        for(i in images) {
            viewFlipper.setInAnimation(this.context, android.R.anim.slide_in_left)
            viewFlipper.setOutAnimation(this.context, android.R.anim.slide_out_right)
            val view = ImageView(this.context)
            view.setImageResource(i)
            viewFlipper.addView(view)
        }
    }
}