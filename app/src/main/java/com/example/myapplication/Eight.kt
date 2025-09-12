package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Eight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_eight)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.page8)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val gotomsg = findViewById<LinearLayout>(R.id.gotomsg)
        gotomsg.setOnClickListener {
            // Create Intent to navigate to Two activity
            val intent = Intent(this, Nine::class.java)
            startActivity(intent)
        }
    }
}