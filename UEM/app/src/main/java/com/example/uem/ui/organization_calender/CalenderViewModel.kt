package com.example.uem.ui.organization_calender

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalenderViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is organization calender Fragment"
    }
    val text: LiveData<String> = _text
}