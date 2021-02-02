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
import com.example.moonlightapp.models.ParentRepository
import com.example.moonlightapp.ui.DishFragment
import com.example.moonlightapp.util.onItemClickListener
import java.util.*


class MenuFragment : Fragment() {

    private lateinit var root: View
    private lateinit var mainCategoryRecycler: RecyclerView
    private lateinit var mainRecyclerAdapter: MainRecyclerAdapter
    private var dishData: ParentRepository = ParentRepository()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        root = inflater.inflate(R.layout.fragment_menu, container, false)
        setMainCategoryRecycler(dishData.getData())
        return root
    }

    private fun setMainCategoryRecycler(allCategory: List<AllCategory>) {
        mainCategoryRecycler = root.findViewById(R.id.items_main)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context)
        mainCategoryRecycler.layoutManager = layoutManager
        mainRecyclerAdapter = MainRecyclerAdapter(
            this.requireContext(),
            allCategory,
            object : onItemClickListener {
                override fun onItemClick(name: String, price: String) {
                    showDetailDish(name, price)
                }
            })
        mainCategoryRecycler.adapter = mainRecyclerAdapter
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