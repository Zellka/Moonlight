package com.example.moonlightapp.ui.items

import android.util.Log
import com.example.moonlightapp.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_categories.*

class MainContainer(
    private val title: String? = "",
    private val items: List<Item>
) : Item() {

    override fun getLayout() = R.layout.item_categories

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.title_text_view.text = title
        viewHolder.items_container.adapter =
            GroupAdapter<GroupieViewHolder>().apply { addAll(items) }
    }

}