package com.example.moonlightapp

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.example.moonlightapp.database.DishDatabase
import com.example.moonlightapp.ui.items.DishContent
import java.util.*

private const val DATABASE_NAME = "dish-database"

class DishRepository private constructor(context:Context) {

    private val database : DishDatabase = Room.databaseBuilder(
        context.applicationContext,
        DishDatabase::class.java,
        DATABASE_NAME
    ).build()

    private val dishDao = database.dishDao()

    fun getDishes(): LiveData<List<DishContent>> = dishDao.getDishes()
    fun getDish(id: UUID): LiveData<DishContent?> = dishDao.getDish(id)

    companion object {
        private var INSTANCE: DishRepository? = null

        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = DishRepository(context)
            }
        }

        fun get(): DishRepository {
            return INSTANCE ?:
            throw IllegalStateException("DishRepository must be initialized")
        }
    }
}