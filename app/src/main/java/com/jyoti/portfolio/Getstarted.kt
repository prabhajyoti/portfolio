package com.jyoti.portfolio
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Getstarted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_getstarted)

        val getstarted = findViewById<Button>(R.id.getstarted)

        getstarted.setOnClickListener { this
         val Intent = Intent(this, Dashboaard::class.java)
         startActivity(Intent)
        }

    }
}
