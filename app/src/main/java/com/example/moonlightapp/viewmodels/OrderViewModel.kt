package com.example.moonlightapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moonlightapp.data.OrderList
import com.example.moonlightapp.entity.HistoryOrder

class OrderViewModel : ViewModel() {

    private var orders: OrderList = OrderList()

    var ordersMutableLiveData: MutableLiveData<MutableList<HistoryOrder>> =
        MutableLiveData()

    fun getAllOrderList() {
        ordersMutableLiveData.value = orders.getOrdersList()
    }

    fun addOrder(order: HistoryOrder){
        orders.addOrder(order)
    }

    fun clearAllList() {
        orders.clearOrderList()
    }
}