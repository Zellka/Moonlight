package com.example.moonlightapp.ui.detail

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.example.moonlightapp.R
import com.example.moonlightapp.data.FavouriteList
import com.example.moonlightapp.utils.Addable
import com.example.moonlightapp.databinding.FragmentDishDetailBinding
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.ui.MainActivity
import com.example.moonlightapp.viewmodels.MenuViewModel
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.favourite_item.view.*

class DishFragment : DialogFragment(), Addable {

    private lateinit var dishViewModel: MenuViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dishViewModel = ViewModelProvider(this).get(MenuViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding: FragmentDishDetailBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.fragment_dish_detail,
            container,
            false
        )
        val nameDish: String = arguments?.getString("NAME_DISH").toString()
        val priceDish: String = arguments?.getString("PRICE_DISH").toString()
        val imgDish: String = arguments?.getString("IMAGE_DISH").toString()
        val data = Dish(nameDish, priceDish, imgDish)
        FavouriteList.isFavourite(data)
        if (FavouriteList.isFavourite(data)) {
            binding.addToFavourite.setImageResource(R.drawable.ic_heart_select)
        } else {
            binding.addToFavourite.setImageResource(R.drawable.ic_heart)
        }
        var flag = !FavouriteList.isFavourite(data)
        binding.addToFavourite.setOnClickListener {
            FavouriteList.updateItem(data)
            if (flag) {
                binding.addToFavourite.setImageResource(R.drawable.ic_heart_select)
                flag = !flag
            } else {
                binding.addToFavourite.setImageResource(R.drawable.ic_heart)
                flag = !flag
            }
        }
        binding.dish = data
        binding.btnCancel.setOnClickListener {
            dismiss()
        }
        binding.btnAdd.setOnClickListener {
            addToCart(Cart(data))
        }
        return binding.root
    }

    @SuppressLint("CheckResult")
    override fun addToCart(cartItem: Cart) {
        dishViewModel.getCartList()
        Observable.create(ObservableOnSubscribe<MutableList<Cart>> {
            dishViewModel.addDishToCart(cartItem)
            dishViewModel.cartMutableLiveData.observe(viewLifecycleOwner) { postModels ->
                it.onNext(postModels)
            }
        }).subscribe { cart ->
            var quantity = 1
            cart.forEach { cartItem ->
                quantity += cartItem.quantity
            }
            (context as MainActivity).nav_view.getOrCreateBadge(R.id.navigation_cart).number =
                quantity
        }
    }
}