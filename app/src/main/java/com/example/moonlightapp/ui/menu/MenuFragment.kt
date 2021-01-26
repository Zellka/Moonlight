package com.example.moonlightapp.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.moonlightapp.R
import com.example.moonlightapp.ui.categories.CategoryAdapter
import com.google.android.material.tabs.TabLayout


class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_menu, container, false)
        val adapter = CategoryAdapter(this.requireContext(), childFragmentManager)
        val viewPager: ViewPager = root.findViewById(R.id.view_pager)
        viewPager.adapter = adapter
        val tabs: TabLayout = root.findViewById(R.id.tab_layout)
        tabs.setupWithViewPager(viewPager)
        return root
    }
}