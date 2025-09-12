package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ten : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ten)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.page10)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val vidcall = findViewById<FrameLayout>(R.id.btn_end_call)
        vidcall.setOnClickListener {

            val intent = Intent(this, Nine::class.java)
            startActivity(intent)
        }
    }
}