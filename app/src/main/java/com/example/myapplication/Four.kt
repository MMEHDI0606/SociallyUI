package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R.id

class Four : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_four)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.page2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val switchacc = findViewById<TextView>(id.switchacc)
        switchacc.setOnClickListener {
            // Create Intent to navigate to Two activity
            val intent = Intent(this, Three::class.java)
            startActivity(intent)
        }
        val signup = findViewById<TextView>(R.id.SignUp)
        signup.setOnClickListener {
            // Create Intent to navigate to Two activity
            val intent = Intent(this, Two::class.java)
            startActivity(intent)
        }
        val btnlogin = findViewById<TextView>(R.id.buttonLogin)
        btnlogin.setOnClickListener {
            // Create Intent to navigate to Two activity
            val intent = Intent(this, Five::class.java)
            startActivity(intent)
        }
    }
}