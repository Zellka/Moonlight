package com.example.moonlightapp.entity

import java.util.*

data class HistoryOrder(
    val numberOrder: Int,
    val dishList: MutableList<Cart>,
    val date: Date,
    val sumOrder: Int
)