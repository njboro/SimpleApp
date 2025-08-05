package com.example.comose_mvvm

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MyViewModel1 : ViewModel() {

    private val _name = MutableStateFlow("Hello")
    val name : StateFlow<String> = _name

    fun changeName() {
        _name.value = generateRandomString(20)
    }

    fun generateRandomString(length: Int): String {
        val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
        return (1..length)
            .map { chars.random() }
            .joinToString("")
    }

}