package com.example.moonlightapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.example.moonlightapp.R
import com.squareup.picasso.Picasso

class DishFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_dish_detail, container, false)

        val cancelBtn = root.findViewById<Button>(R.id.btn_cancel)
        val addBtn = root.findViewById<Button>(R.id.btn_add)
        val nameDish = root.findViewById<TextView>(R.id.dish_name)
        val priceDish = root.findViewById<TextView>(R.id.dish_price)
        val imgDish = root.findViewById<ImageView>(R.id.dish_img)

        nameDish.text = arguments?.getString("nameDish")
        priceDish.text = arguments?.getInt("priceDish").toString()
        val url: String? = arguments?.getString("imgDish")
        Picasso.get().load(url).centerCrop().fit().into(imgDish)

        cancelBtn.setOnClickListener {
            dismiss()
        }
        addBtn.setOnClickListener {

        }
        return root
    }
    /* companion object {

         fun newInstance(name: String, price: String): DishFragment {
             val args = Bundle().apply {
                 putSerializable("name", name)
                 putSerializable("price", price)
             }
             return DishFragment().apply {
                 arguments = args
             }
         }
     }*/
}