package com.example.uem.ui.university_marks_system

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MarksViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Digital Library Fragment"
    }
    val text: LiveData<String> = _text
}