package com.example.uem.ui.set_my_password

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PasswordViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Password Fragment"
    }
    val text: LiveData<String> = _text
}