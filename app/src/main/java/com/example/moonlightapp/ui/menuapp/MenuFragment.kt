package com.example.moonlightapp.ui.menuapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.ui.items.DishContent
import com.example.moonlightapp.ui.items.DishItem
import com.example.moonlightapp.ui.items.MainContainer
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item

class MenuFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,  savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.fragment_menu, container, false)
        val dishes = listOf(
            getAppetizer(),
            getStarters(),
            getSalads(),
            getMainDishes(),
            getSides(),
            getDesserts()
        )
        val rv:RecyclerView = root.findViewById(R.id.items_main)
        rv.adapter = GroupAdapter<GroupieViewHolder>().apply { addAll(dishes) }
        return root
    }
    private fun getAppetizer(): Item {
        return MainContainer(
            "Закуски", ::onItemClick,
            listOf(
                DishItem(
                    DishContent(
                        "Тартар из телятины",
                        "₽ 289",
                        "Рубленная телячья вырезка в сочетании с крымским луком, солеными огурцами, каперсами, заправленная маслом оливковым, горчицей, бальзамическим и чили соусом. Подается с перепелиным яйцом, рукколой и слоеными гренками.",
                        "https://www.goodcity.com.ru/assets/product/thumbs/2b168da23194240974abdda0487fd884.jpg"
                    )
                )
            )
        )
    }
    private fun getStarters(): Item {
        return MainContainer(
            "Первые блюда", ::onItemClick,
            listOf(
                DishItem(
                    DishContent(
                        "Борщ",
                        "₽ 129",
                        "Готовится борщ на говяжьем бульоне. Подается с говядиной, сметаной, зеленью и пампушками",
                        "https://www.goodcity.com.ru/assets/product/thumbs/41c4febf6c6af2656a93c3dcd959a849.jpg"
                    )
                )
            )
        )
    }
    private fun getSalads(): Item {
        return MainContainer(
            "Салаты", ::onItemClick,
            listOf(
                DishItem(
                    DishContent(
                        "Цезарь",
                        "₽ 259",
                        "Сочетание свежих хрустящих огурцов, спелых томатов, болгарского перца, сочных листьев салата и пекинской капусты с сочным куриным филе, обжаренном на гриле под фирменной заправкой, сдобренное сыром Пармезан и ароматными гренками.",
                        "https://www.goodcity.com.ru/assets/product/thumbs/11509b2990e7673ad6a6c157fba9ba19.jpg"
                    )
                )
            )
        )
    }
    private fun getMainDishes(): Item {
        return MainContainer(
            "Основные блюда", ::onItemClick,
            listOf(
                DishItem(
                    DishContent(
                        "Стейк Перчини",
                        "₽ 549",
                        "Идеальное сочетание специй в стейке из нежного филе телятины, поджаренного на гриле, гарнированного помидорами черри и шампиньонами.Острое блюдо!",
                        "https://www.goodcity.com.ru/assets/product/thumbs/acaf82d63c1ef82d1005a0d514be3a2d.jpg"
                    )
                )
            )
        )
    }
    private fun getSides(): Item {
        return MainContainer(
            "Гарниры", ::onItemClick,
            listOf(
                DishItem(
                    DishContent(
                        "Картофель «Гурман»",
                        "₽ 69",
                        "Дольки картофеля в кожуре, обжаренные в большом количестве кипящего масла и приправленные пряными специями",
                        "https://www.goodcity.com.ru/assets/product/thumbs/2a550fc1ea638f3f69479dc4abf5f73d.jpg"
                    )
                )
            )
        )
    }
    private fun getDesserts(): Item {
        return MainContainer(
            "Десерты", ::onItemClick,
            listOf(
                DishItem(
                    DishContent(
                        "Джелато-сендвич",
                        "₽ 149",
                        "Классический макаронс с мороженым в виде сендвича на подушке из сладкой воздушной ваты в дополнении ягод малины и шоколадных конфет",
                        "https://www.goodcity.com.ru/assets/product/thumbs/19eeba587b93197a2ef78188dfb0f183.jpg"
                    )
                )
            )
        )
    }
    fun onItemClick(url: String) {
    }
}