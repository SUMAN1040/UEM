package com.example.uem.ui.sem_feedback

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FeedbackViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Digital Library Fragment"
    }
    val text: LiveData<String> = _text
}