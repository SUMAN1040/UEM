package com.example.uem.ui.digital_library_resources

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DigitalViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Digital Library Fragment"
    }
    val text: LiveData<String> = _text
}