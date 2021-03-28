package com.example.moonlightapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.utils.Addable
import com.example.moonlightapp.entity.Categories
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.utils.FavouriteClickable
import com.example.moonlightapp.utils.ItemClickable
import java.util.*
import kotlin.collections.ArrayList

class CategoriesAdapter(
    private val context: Context,
    private val addable: Addable,
    private var favListener: FavouriteClickable
) :
    RecyclerView.Adapter<CategoriesAdapter.MainViewHolder>(), Filterable {
    private lateinit var listener: ItemClickable
    private var allCategory: MutableList<Categories> = ArrayList()
    private var categories: MutableList<Categories> = ArrayList()

    fun setOnItemClickListener(onSaleable: ItemClickable) {
        listener = onSaleable
    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var categoryTitle: TextView = itemView.findViewById(R.id.title_text_view)
        var itemRecycler: RecyclerView = itemView.findViewById(R.id.recycler_nested)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_categories, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.categoryTitle.text = allCategory[position].categoryTitle
        setCatItemRecycler(holder.itemRecycler, allCategory[position].categoryItem)
    }

    override fun getItemCount(): Int = allCategory.size

    private fun setCatItemRecycler(recyclerView: RecyclerView, categoryItem: List<Dish>) {
        val itemRecyclerAdapter = DishAdapter(
            categoryItem, listener, addable, favListener
        )
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = itemRecyclerAdapter
    }

    fun setList(dishList: MutableList<Categories>) {
        allCategory = dishList
        categories = dishList
        notifyDataSetChanged()
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString()
                if (charSearch.isEmpty()) {
                    allCategory = categories
                } else {
                    val resultList: MutableList<Categories> = ArrayList()
                    for (row in categories) {
                        for (dish in row.categoryItem) {
                            if (row.categoryTitle.toLowerCase(Locale.ROOT)
                                    .contains(charSearch.toLowerCase(Locale.ROOT))
                            ) {
                                resultList.add(row)
                                break
                            } else if (dish.name.toLowerCase(Locale.ROOT)
                                    .contains(charSearch.toLowerCase(Locale.ROOT))
                            ) {
                                resultList.add(row)
                                break
                            }
                        }

                    }
                    allCategory = resultList
                }
                val filterResults = FilterResults()
                filterResults.values = allCategory
                return filterResults
            }

            @Suppress("UNCHECKED_CAST")
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                allCategory = results?.values as MutableList<Categories>
                notifyDataSetChanged()
            }
        }
    }
}