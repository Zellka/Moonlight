package com.example.moonlightapp.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.moonlightapp.R
import java.util.concurrent.TimeUnit
import android.util.Patterns
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout
import com.jakewharton.rxbinding2.widget.RxTextView
import io.reactivex.Observable
import io.reactivex.ObservableTransformer
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_profile, container, false)
        val enterEmail = root.findViewById<EditText>(R.id.enterEmail)
        val emailError = root.findViewById<TextInputLayout>(R.id.emailError)
        val passwordError = root.findViewById<TextInputLayout>(R.id.passwordError)
        val enterPassword = root.findViewById<EditText>(R.id.enterPassword)
        RxTextView.afterTextChangeEvents(enterEmail)
            .skipInitialValue()
            .map {
                emailError.error = null
                it.view().text.toString()
            }
            .debounce(400, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread())
            .compose(validateEmailAddress)
            .compose(retryWhenError {
                emailError.error = it.message
            })
            .subscribe()

        RxTextView.afterTextChangeEvents(enterPassword)
            .skipInitialValue()
            .map {
                passwordError.error = null
                it.view().text.toString()
            }
            .debounce(400, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread())
            .compose(validatePassword)
            .compose(retryWhenError {
                passwordError.error = it.message
            })
            .subscribe()
        return root
    }

    private inline fun retryWhenError(crossinline onError: (ex: Throwable) -> Unit): ObservableTransformer<String, String> =
        ObservableTransformer { observable ->
            observable.retryWhen { errors ->
                errors.flatMap {
                    onError(it)
                    Observable.just("")
                }
            }
        }

    private val validatePassword = ObservableTransformer<String, String> { observable ->
        observable.flatMap {
            Observable.just(it).map { it.trim() }
                .filter { it.length > 7 }
                .singleOrError()

                .onErrorResumeNext {
                    if (it is NoSuchElementException) {
                        Single.error(Exception("Your password must be 7 characters or more"))

                    } else {
                        Single.error(it)
                    }
                }
                .toObservable()
        }
    }
    private val validateEmailAddress = ObservableTransformer<String, String> { observable ->
        observable.flatMap {
            Observable.just(it).map { it.trim() }
                .filter {
                    Patterns.EMAIL_ADDRESS.matcher(it).matches()
                }
                .singleOrError()
                .onErrorResumeNext {
                    if (it is NoSuchElementException) {
                        Single.error(Exception("Please enter a valid email address"))
                    } else {
                        Single.error(it)

                    }
                }
                .toObservable()
        }
    }
}