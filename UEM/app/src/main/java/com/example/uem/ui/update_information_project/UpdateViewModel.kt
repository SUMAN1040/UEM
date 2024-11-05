package com.example.uem.ui.update_information_project

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UpdateViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Update Information Fragment"
    }
    val text: LiveData<String> = _text
}