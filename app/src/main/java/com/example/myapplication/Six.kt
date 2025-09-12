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
        val homebtn = findViewById<ImageView>(R.id.home_icon)
        homebtn.setOnClickListener {
            // Create Intent to navigate to Two activity
            val intent = Intent(this, Five::class.java)
            startActivity(intent)
        }
        val searchbtn = findViewById<ImageView>(R.id.search_icon)
        searchbtn.setOnClickListener {
            // Create Intent to navigate to Two activity
            val intent = Intent(this, Six::class.java)
            startActivity(intent)
        }
        val notif = findViewById<ImageView>(R.id.like_icon_bottom)
        notif.setOnClickListener {
            // Create Intent to navigate to Two activity
            val intent = Intent(this, Eleven::class.java)
            startActivity(intent)
        }
        val post = findViewById<ImageView>(R.id.add_icon)
        post.setOnClickListener {

            val intent = Intent(this, Sixteen::class.java)
            startActivity(intent)
        }
        val prof = findViewById<ImageView>(R.id.profile_icon_bottom)
        prof.setOnClickListener {

            val intent = Intent(this, Thirteen::class.java)
            startActivity(intent)
        }

        val searchbar = findViewById<TextView>(R.id.searchbar)
        searchbar.setOnClickListener {
            val intent = Intent(this, Seven::class.java)
            startActivity(intent)
        }
    }
}