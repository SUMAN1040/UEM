package com.example.uem.ui.exam_form

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExamViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Exam Fragment"
    }
    val text: LiveData<String> = _text
}