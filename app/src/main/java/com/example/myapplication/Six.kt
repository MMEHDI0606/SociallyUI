package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Six : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_six)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.page6)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val searchbtn = findViewById<ImageView>(R.id.search_btn)
        searchbtn.setOnClickListener {
            // Create Intent to navigate to Two activity
            val intent = Intent(this, Seven::class.java)
            startActivity(intent)
        }
        val searchbar = findViewById<TextView>(R.id.searchbar)
        searchbar.setOnClickListener {
            // Create Intent to navigate to Two activity
            val intent = Intent(this, Seven::class.java)
            startActivity(intent)
        }
    }
}