package com.example.testing_binding

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("app:hideIfZero")
fun hideIfZero(view: View, number: Int) {
    view.visibility = if (number == 5) View.GONE else View.VISIBLE
}