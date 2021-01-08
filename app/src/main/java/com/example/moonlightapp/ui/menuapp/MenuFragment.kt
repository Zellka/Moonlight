package com.example.moonlightapp.ui.menuapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.moonlightapp.R
import com.example.moonlightapp.ui.items.DishContent
import com.example.moonlightapp.ui.items.DishItem
import com.example.moonlightapp.ui.items.MainContainer
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.fragment_menu.*

class MenuFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,  savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.fragment_menu, container, false)
       /* val dishes = listOf(
            getAppetizer(),
        )
        items_container.adapter = GroupAdapter<GroupieViewHolder>().apply { addAll(dishes) }*/
        return root
    }
    //private fun getAppetizer(): Item { }
}