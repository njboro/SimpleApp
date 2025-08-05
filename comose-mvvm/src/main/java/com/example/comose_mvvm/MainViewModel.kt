package com.example.comose_mvvm

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel: ViewModel() {
    //Backing state
    private val _name = MutableStateFlow<String>("")
    val name: StateFlow<String> = _name

    fun onNameChanged(newName: String) {
        _name.value = newName
    }

}