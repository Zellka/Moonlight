package com.example.moonlightapp.ui.detail

import android.annotation.SuppressLint
import android.graphics.Color
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
import com.google.android.material.snackbar.Snackbar
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_dish.*

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
        val descDish: String = arguments?.getString("DESCRIPTION_DISH").toString()
        val weightDish: String = arguments?.getString("WEIGHT_DISH").toString()
        val caloriesDish: String = arguments?.getString("CALORIES_DISH").toString()


        val data = Dish(nameDish, priceDish, imgDish, descDish, weightDish, caloriesDish)
        binding.dish = data
        binding.btnAdd.setOnClickListener {
            addToCart(Cart(data))
        }
        return binding.root
    }

    @SuppressLint("CheckResult")
    override fun addToCart(cartItem: Cart) {
        dishViewModel.getCartList()
        Snackbar.make(bottom_sheet_layout, "Добавлено: " + cartItem.product.name, Snackbar.LENGTH_SHORT)
            .setBackgroundTint(
                Color.parseColor("#FFFFFF")
            ).setTextColor(Color.BLACK)
            .show()
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