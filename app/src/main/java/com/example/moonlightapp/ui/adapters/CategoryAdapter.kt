package com.example.moonlightapp.ui.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.moonlightapp.R
import com.example.moonlightapp.ui.categories.DessertFragment
import com.example.moonlightapp.ui.categories.MainDishFragment
import com.example.moonlightapp.ui.categories.PizzaFragment
import com.example.moonlightapp.ui.categories.SaladFragment

class CategoryAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm){

    private val TAB_TITLES = arrayOf(
        R.string.title_pizza,
        R.string.title_salads,
        R.string.title_main_dishes,
        R.string.title_desserts
    )
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PizzaFragment()
            1 -> SaladFragment()
            2 -> MainDishFragment()
            else -> { return DessertFragment() }
        }
    }
    override fun getCount(): Int {
        return 4
    }
    override fun getPageTitle(position: Int): CharSequence {
        return context.resources.getString(TAB_TITLES[position])
    }
}