package com.example.moonlightapp.data

import com.example.moonlightapp.models.Categories
import java.util.ArrayList

class CategoriesModel {
    private var childData: CategoryItemModel = CategoryItemModel()

    fun getData(): List<Categories> {
        val allCategory: MutableList<Categories> = ArrayList()
        allCategory.add(Categories("Закуски", childData.getAppetizerData()))
        allCategory.add(Categories("Салаты", childData.getSaladData()))
        allCategory.add(Categories("Основные блюда", childData.getMainDishData()))
        allCategory.add(Categories("Гарниры", childData.getSideDishData()))
        allCategory.add(Categories("Десерты", childData.getDessertData()))

        return allCategory
    }
}