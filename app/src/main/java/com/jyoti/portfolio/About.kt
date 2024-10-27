package com.jyoti.portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.net.Uri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_about)
        val experience = findViewById<Button>(R.id.experience)
        experience.setOnClickListener { this
            val Intent = Intent(this, Experience::class.java)
            startActivity(Intent)
        }



        setupLinkButton()
    }
       fun setupLinkButton() {
           val cvlinkButton = findViewById<Button>(R.id.cv);
           cvlinkButton.setOnClickListener { this
              val browserIntent = Intent(
                  Intent.ACTION_VIEW,
                  Uri.parse("https://drive.google.com/file/d/1iNroc-4XhvCwkVI0qY_4oeE_SgWJavW0/view?usp=sharing")
              )
                startActivity(browserIntent)

           }


       }




    
}