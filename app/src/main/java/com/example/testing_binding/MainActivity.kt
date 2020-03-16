package com.example.testing_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.testing_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Obtain ViewModel from ViewModelProviders
    private val viewModel by lazy { ViewModelProvider(this).get(VM::class.java) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding:ActivityMainBinding =
            DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.lifecycleOwner = this

        binding.vm = viewModel
    }
}
