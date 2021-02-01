package com.example.moonlightapp.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.adapter.MainRecyclerAdapter
import com.example.moonlightapp.models.AllCategory
import com.example.moonlightapp.models.CategoryItem
import com.example.moonlightapp.ui.DishFragment
import com.example.moonlightapp.util.onItemClickListener
import java.util.*


class MenuFragment : Fragment() {

    private var mainCategoryRecycler: RecyclerView? = null
    private var mainRecyclerAdapter: MainRecyclerAdapter? = null
    private lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root = inflater.inflate(R.layout.fragment_menu, container, false)
        val categoryItemList1: MutableList<CategoryItem> = ArrayList()
        categoryItemList1.add(
            CategoryItem(
                "Снеки1",
                "₽ 289",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList1.add(
            CategoryItem(
                "Снеки2",
                "₽ 289",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList1.add(
            CategoryItem(
                "Снеки3",
                "₽ 289",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList1.add(
            CategoryItem(
                "Снеки4",
                "₽ 289",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList1.add(
            CategoryItem(
                "Снеки5",
                "₽ 289",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        val categoryItemList2: MutableList<CategoryItem> = ArrayList()
        categoryItemList2.add(
            CategoryItem(
                "Крабовый1",
                "₽ 389",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList2.add(
            CategoryItem(
                "Крабовый2",
                "₽ 389",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList2.add(
            CategoryItem(
                "Крабовый3",
                "₽ 389",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList2.add(
            CategoryItem(
                "Крабовый4",
                "₽ 389",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList2.add(
            CategoryItem(
                "Крабовый5",
                "₽ 389",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        val categoryItemList3: MutableList<CategoryItem> = ArrayList()
        categoryItemList3.add(
            CategoryItem(
                "Мясо1",
                "₽ 400",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList3.add(
            CategoryItem(
                "Мясо2",
                "₽ 400",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList3.add(
            CategoryItem(
                "Мясо3",
                "₽ 400",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList3.add(
            CategoryItem(
                "Мясо4",
                "₽ 400",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList3.add(
            CategoryItem(
                "Мясо5",
                "₽ 400",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        val categoryItemList4: MutableList<CategoryItem> = ArrayList()
        categoryItemList4.add(
            CategoryItem(
                "Гречка1",
                "₽ 100",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList4.add(
            CategoryItem(
                "Гречка2",
                "₽ 100",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList4.add(
            CategoryItem(
                "Гречка3",
                "₽ 100",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList4.add(
            CategoryItem(
                "Гречка4",
                "₽ 100",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList4.add(
            CategoryItem(
                "Гречка5",
                "₽ 100",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        val categoryItemList5: MutableList<CategoryItem> = ArrayList()
        categoryItemList5.add(
            CategoryItem(
                "Торт1",
                "₽ 500",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList5.add(
            CategoryItem(
                "Торт2",
                "₽ 500",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList5.add(
            CategoryItem(
                "Торт3",
                "₽ 500",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList5.add(
            CategoryItem(
                "Торт4",
                "₽ 500",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )
        categoryItemList5.add(
            CategoryItem(
                "Торт5",
                "₽ 500",
                "https://sun9-29.userapi.com/impg/c854024/v854024546/2235f1/yHBkXIcQnBk.jpg?size=520x0&quality=90&sign=8c559cc05bf42491b56129418a7d488e"
            )
        )

        val allCategory: MutableList<AllCategory> = ArrayList()
        allCategory.add(AllCategory("Закуски", categoryItemList1))
        allCategory.add(AllCategory("Салаты", categoryItemList2))
        allCategory.add(AllCategory("Основные блюда", categoryItemList3))
        allCategory.add(AllCategory("Гарниры", categoryItemList4))
        allCategory.add(AllCategory("Десерты", categoryItemList5))


        setMainCategoryRecycler(allCategory)
        return root
    }

    private fun setMainCategoryRecycler(allCategory: List<AllCategory>) {
        mainCategoryRecycler = root.findViewById(R.id.items_main)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(this.requireContext())
        mainCategoryRecycler!!.layoutManager = layoutManager
        mainRecyclerAdapter = MainRecyclerAdapter(
            this.requireContext(),
            allCategory,
            object : onItemClickListener {
                override fun onItemClick(name: String, price: String) {
                    showDetailDish(name, price)
                }
            })
        mainCategoryRecycler!!.adapter = mainRecyclerAdapter
    }

    private fun showDetailDish(name: String, price: String) {
        val dishFragment = DishFragment()
        val args = Bundle()
        args.putString("nameDish", name)
        args.putString("priceDish", price)
        dishFragment.arguments = args
        dishFragment.show(this@MenuFragment.requireFragmentManager(), "Dialog")
    }
}