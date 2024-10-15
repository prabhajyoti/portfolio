package com.jyoti.portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Dashboaard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboaard)
        val enter = findViewById<Button>(R.id.enter)

        enter.setOnClickListener { this
        val Intent = Intent(this, About::class.java)
        startActivity(Intent)
        }
    }
}