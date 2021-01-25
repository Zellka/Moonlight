package com.example.moonlightapp

import androidx.lifecycle.ViewModel

class DishListViewModel: ViewModel() {

    private val dishRepository = DishRepository.get()
    val dishListLiveData = dishRepository.getDishes()
}