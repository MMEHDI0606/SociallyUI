package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Five : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_five)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.page5)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val searchbtn = findViewById<ImageView>(R.id.search_button)
        searchbtn.setOnClickListener {
            // Create Intent to navigate to Two activity
            val intent = Intent(this, Six::class.java)
            startActivity(intent)
        }
        val sendmsg = findViewById<ImageView>(R.id.send_msg)
        sendmsg.setOnClickListener {
            // Create Intent to navigate to Two activity
            val intent = Intent(this, Eight::class.java)
            startActivity(intent)
        }

    }
}