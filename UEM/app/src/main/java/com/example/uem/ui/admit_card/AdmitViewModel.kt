package com.example.uem.ui.admit_card

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AdmitViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Admit Fragment"
    }
    val text: LiveData<String> = _text
}