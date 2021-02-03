package com.example.moonlightapp.ui.menu

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ViewFlipper
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.replace
import com.example.moonlightapp.R
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment(), View.OnClickListener  {

    private lateinit var viewFlipper:ViewFlipper
    private var images = intArrayOf(R.drawable.food1, R.drawable.food2, R.drawable.food3)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
       //val imgBtn = root.findViewById<ImageView>(R.id.imgg)
       // imgBtn.setOnClickListener(this)*/
        viewFlipper = root.findViewById<ViewFlipper>(R.id.view_flipper)
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

    override fun onClick(v: View?) {
        Log.d("Click","image")
        /*var fragment: Fragment? = null
        val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
        when (requireView().id) {
            R.id.imgg -> {
                fragment = MenuFragment()
                transaction.replace(R.id.content, fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            }
        }*/
    }
}