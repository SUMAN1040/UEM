package com.example.uem.ui.upload_my_photo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PhotoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Photo Fragment"
    }
    val text: LiveData<String> = _text
}