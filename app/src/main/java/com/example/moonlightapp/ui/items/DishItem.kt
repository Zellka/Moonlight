package com.example.moonlightapp.ui.items

import com.example.moonlightapp.R
import com.squareup.picasso.Picasso
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_dish.*

class DishItem(
    private val content: DishContent,
    private val onClick: (dec:String) -> Unit
) : Item() {

    override fun getLayout() = R.layout.item_dish

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.name_dish.text = content.name
        viewHolder.price_dish.text = content.price
        Picasso.get()
            .load(content.url)
            .into(viewHolder.img_dish)


        viewHolder.itemView.setOnClickListener {
            onClick(viewHolder.name_dish.text.toString())
        }
    }
}

data class DishContent(
    val name: String,
    val price: String,
    val url: String
)