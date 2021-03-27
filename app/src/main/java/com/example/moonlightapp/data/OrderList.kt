package com.example.moonlightapp.data

import com.example.moonlightapp.entity.HistoryOrder
import io.paperdb.Paper

class OrderList {

    companion object {
        fun addItem(order: HistoryOrder) {
            val orderList = getOrdersList()

            val targetItem = orderList.singleOrNull { it.numberOrder == order.numberOrder }
            if (targetItem == null) {
                orderList.add(order)
            }
            saveOrderList(orderList)
        }

        fun clearList(){
            val orderList = getOrdersList()
            orderList.clear()
            saveOrderList(orderList)
        }

        private fun saveOrderList(orderList: MutableList<HistoryOrder>) {
            Paper.book().write("orders", orderList)
        }

        fun getOrdersList(): MutableList<HistoryOrder> {
            return Paper.book().read("orders", mutableListOf())
        }
    }
}