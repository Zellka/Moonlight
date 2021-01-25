package com.example.moonlightapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.moonlightapp.ui.items.DishContent

@Database(entities = [DishContent::class], version = 1)
@TypeConverters(DishTypeConverters::class)

abstract class DishDatabase:RoomDatabase() {
    abstract fun dishDao(): DishDao
}