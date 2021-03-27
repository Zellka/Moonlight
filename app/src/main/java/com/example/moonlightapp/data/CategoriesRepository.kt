package com.example.moonlightapp.data

import com.example.moonlightapp.entity.Categories
import java.util.ArrayList

class CategoriesRepository {
    private var childData: DishesRepository = DishesRepository()

    fun getData(): MutableList<Categories> {
        val allCategory: MutableList<Categories> = ArrayList()
        allCategory.add(Categories("Закуски", childData.getAppetizerData()))
        allCategory.add(Categories("Салаты", childData.getSaladData()))
        allCategory.add(Categories("Основные блюда", childData.getMainDishData()))
        allCategory.add(Categories("Гарниры", childData.getSideDishData()))
        allCategory.add(Categories("Десерты", childData.getDessertData()))

        return allCategory
    }
}