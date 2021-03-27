package com.example.moonlightapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moonlightapp.data.OrderList
import com.example.moonlightapp.entity.HistoryOrder

class OrderViewModel : ViewModel() {

    var ordersMutableLiveData: MutableLiveData<MutableList<HistoryOrder>> =
        MutableLiveData()

    fun getAllOrderList() {
        ordersMutableLiveData.value = OrderList.getOrdersList()
    }

    fun clearAllList() {
        OrderList.clearList()
    }
}