package com.example.moonlightapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.databinding.ItemOrderBinding
import com.example.moonlightapp.entity.HistoryOrder

class OrderAdapter() :
    RecyclerView.Adapter<OrderAdapter.OrderViewHolder>() {

    private var orderList: MutableList<HistoryOrder> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): OrderViewHolder {
        val binding: ItemOrderBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_order,
            parent,
            false
        )
        return OrderViewHolder(binding)
    }

    override fun getItemCount(): Int = orderList.size

    override fun onBindViewHolder(viewHolder: OrderViewHolder, position: Int) {
        val model = orderList[position]
        viewHolder.bind(model)
    }

    class OrderViewHolder(private val binding: ItemOrderBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: HistoryOrder) {
            binding.order = data
        }
    }

    fun setList(list: MutableList<HistoryOrder>) {
        orderList = list
        notifyDataSetChanged()
    }
}