package com.example.moonlightapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.moonlightapp.ui.items.DishContent
import java.util.*

@Dao
interface DishDao {

    @Query("SELECT * FROM dishcontent")
    fun getDishes(): LiveData<List<DishContent>>

    @Query("SELECT * FROM dishcontent WHERE id=(:id)")
    fun getDish(id: UUID): LiveData<DishContent?>

    @Insert
    fun addDish(dish: DishContent)
}