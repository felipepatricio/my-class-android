package com.example.fiap.myclass.ui.`class`

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ClassViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Class Fragment"
    }
    val text: LiveData<String> = _text
}