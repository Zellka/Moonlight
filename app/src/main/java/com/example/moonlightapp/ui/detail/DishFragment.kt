package com.example.moonlightapp.ui.detail

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.example.moonlightapp.R
import com.example.moonlightapp.databinding.FragmentDishBinding
import com.example.moonlightapp.utils.AddableToCart
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.ui.MainActivity
import com.example.moonlightapp.viewmodels.MenuViewModel
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import kotlinx.android.synthetic.main.activity_main.*

class DishFragment : BottomSheetDialogFragment(), AddableToCart {

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

        val binding: FragmentDishBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.fragment_dish,
            container,
            false
        )
        val nameDish: String = arguments?.getString("NAME_DISH").toString()
        val priceDish: String = arguments?.getString("PRICE_DISH").toString() + ""
        val imgDish: String = arguments?.getString("IMAGE_DISH").toString()
        val data = Dish(nameDish, priceDish, imgDish)
        dishViewModel.isFavourite(data)
        if (dishViewModel.isFavourite(data)) {
            binding.addToFavourite.setImageResource(R.drawable.ic_heart_select_30)
        } else {
            binding.addToFavourite.setImageResource(R.drawable.ic_heart_30)
        }
        var flag = !dishViewModel.isFavourite(data)
        binding.addToFavourite.setOnClickListener {
            dishViewModel.addToFavourites(data)
            if (flag) {
                binding.addToFavourite.setImageResource(R.drawable.ic_heart_select_30)
                flag = !flag
            } else {
                binding.addToFavourite.setImageResource(R.drawable.ic_heart_30)
                flag = !flag
            }
        }
        binding.dish = data
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