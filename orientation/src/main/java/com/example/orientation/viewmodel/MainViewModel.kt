package com.example.orientation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _count = MutableLiveData(0)
    val count : LiveData<Int> get() = _count

    fun incrementNumber() {
        _count.value = (_count.value  ?: 0) +1
    }
}