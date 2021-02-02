package com.example.moonlightapp.models

import java.util.ArrayList

class ParentRepository {
    private var childData: ChildRepository = ChildRepository()

    fun getData(): List<AllCategory> {
        val allCategory: MutableList<AllCategory> = ArrayList()
        allCategory.add(AllCategory("Закуски", childData.getAppetizerData()))
        allCategory.add(AllCategory("Салаты", childData.getSaladData()))
        allCategory.add(AllCategory("Основные блюда", childData.getMainDishData()))
        allCategory.add(AllCategory("Гарниры", childData.getSideDishData()))
        allCategory.add(AllCategory("Десерты", childData.getDessertData()))

        return allCategory
    }
}