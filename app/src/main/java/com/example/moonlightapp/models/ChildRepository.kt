package com.example.moonlightapp.models

class ChildRepository {
    fun getItems(): List<CategoryItem>? {
        val items: MutableList<CategoryItem> = ArrayList()
        items.add(CategoryItem("Тартар из телятины", "₽ 289", "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"))
        items.add(CategoryItem("Тартар из телятины", "₽ 289", "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"))
        items.add(CategoryItem("Тартар из телятины", "₽ 289", "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"))
        return items
    }
}