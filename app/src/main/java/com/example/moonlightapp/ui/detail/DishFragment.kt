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
import com.example.moonlightapp.common.Addable
import com.example.moonlightapp.databinding.FragmentDishDetailBinding
import com.example.moonlightapp.entity.Cart
import com.example.moonlightapp.entity.Dish
import com.example.moonlightapp.ui.MainActivity
import com.example.moonlightapp.viewmodels.DishViewModel
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import kotlinx.android.synthetic.main.activity_main.*

class DishFragment : DialogFragment(), Addable {

    private lateinit var dishViewModel: DishViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dishViewModel = ViewModelProvider(this).get(DishViewModel::class.java)
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