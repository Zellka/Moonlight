package com.example.moonlightapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import com.example.moonlightapp.R

class DishFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_dish_detail, container, false)
        val cancelBtn = root.findViewById<Button>(R.id.btn_cancel)
        val addBtn = root.findViewById<Button>(R.id.btn_add)
        cancelBtn.setOnClickListener {
            dismiss()
        }
        addBtn.setOnClickListener {

        }
        return root
    }
}