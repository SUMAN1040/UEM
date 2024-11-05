package com.example.uem

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class FlashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flash_screen)
        Handler(Looper.getMainLooper()).postDelayed(
            {
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            },3000
        )
    }
}