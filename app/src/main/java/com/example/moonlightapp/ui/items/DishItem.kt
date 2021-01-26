package com.example.moonlightapp.ui.items

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.moonlightapp.R
import com.example.moonlightapp.ui.DishDetailFragment
import com.squareup.picasso.Picasso
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import java.util.UUID
import kotlinx.android.synthetic.main.item_dish.*
import java.util.*

class DishItem(private val content: DishContent) : Item() {

    override fun getLayout() = R.layout.item_dish

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.name_dish.text = content.name
        viewHolder.price_dish.text = content.price
        Picasso.get()
            .load(content.url)
            .into(viewHolder.img_dish)


        viewHolder.itemView.setOnClickListener {
            Log.d("SelectItem", viewHolder.name_dish.text.toString())
        }
    }
}

data class DishContent(
    val name: String,
    val price: String,
    val url: String
)