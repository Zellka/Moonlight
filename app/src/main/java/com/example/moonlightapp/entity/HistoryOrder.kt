package com.example.moonlightapp.entity

data class HistoryOrder(
    val user: User,
    val dishList: MutableList<Dish>
)