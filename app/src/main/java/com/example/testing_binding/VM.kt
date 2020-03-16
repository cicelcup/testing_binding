package com.example.testing_binding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VM:ViewModel() {
    private val _name = MutableLiveData("Jorge")
    private val _lastName = MutableLiveData("Peroza")
    private val _likes = MutableLiveData(0)

    val name: LiveData<String> = _name
    val lastName: LiveData<String> = _lastName
    val likes:LiveData<Int> = _likes

    fun changeName()
    {
        _likes.value = (_likes.value ?: 0) + 1
        _name.value = "Jorge ${_likes.value}"
        _lastName.value = "Peroza ${_likes.value}"
    }
}