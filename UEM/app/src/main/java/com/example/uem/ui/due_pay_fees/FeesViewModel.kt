package com.example.uem.ui.due_pay_fees

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FeesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Digital Library Fragment"
    }
    val text: LiveData<String> = _text
}