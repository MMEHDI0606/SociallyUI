package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
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
        val sendmsg = findViewById<ImageView>(R.id.send_msg)
        sendmsg.setOnClickListener {
            // Create Intent to navigate to Two activity
            val intent = Intent(this, Eight::class.java)
            startActivity(intent)
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


        val ss = findViewById<ImageView>(R.id.craigstory)
        ss.setOnClickListener {

            val intent = Intent(this, Eighteen::class.java)
            startActivity(intent)
        }
        val story = findViewById<ImageView>(R.id.putstory)
        story.setOnClickListener {

            val intent = Intent(this, Seventeen::class.java)
            startActivity(intent)
        }
        val cs = findViewById<ImageView>(R.id.cstory)
        cs.setOnClickListener {

            val intent = Intent(this, Nineteen::class.java)
            startActivity(intent)
        }


        val celeb = findViewById<LinearLayout>(R.id.celebrity)
        celeb.setOnClickListener {

            val intent = Intent(this, Twentyone::class.java)
            startActivity(intent)
        }

    }
}