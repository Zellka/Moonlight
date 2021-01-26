package com.example.moonlightapp.ui.adapters

import com.example.moonlightapp.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.ui.menu.MenuFragment
import com.example.moonlightapp.ui.model.Dish
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.dish_item.view.*

class DishAdapter(val arrayList: ArrayList<Dish>, val context: MenuFragment): RecyclerView.Adapter<DishAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bindItems(dish: Dish){
            itemView.title_dish.text = dish.name
            itemView.weight_dish.text = dish.weight
            itemView.btn_add_dish.text = dish.price
            Picasso.get().load(dish.url).centerCrop().fit().into(itemView.img_dish)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v:View = LayoutInflater.from(parent.context).inflate(R.layout.dish_item, parent, false)
        return ViewHolder(v)
    }
    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val item = arrayList[position]
        holder.bindItems(item)
        holder.itemView.setOnClickListener {

        }
    }
}