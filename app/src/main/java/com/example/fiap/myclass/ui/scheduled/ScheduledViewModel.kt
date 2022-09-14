package com.example.fiap.myclass.ui.scheduled

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScheduledViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is scheduled Fragment"
    }
    val text: LiveData<String> = _text
}