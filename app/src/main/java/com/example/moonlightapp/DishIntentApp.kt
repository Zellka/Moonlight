package com.example.moonlightapp

import android.app.Application

class DishIntentApp:Application() {
    override fun onCreate() {
        super.onCreate()
        DishRepository.initialize(this);
    }
}