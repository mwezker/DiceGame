package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.Spinner

class AirmeActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_airme)

            val buttonClick = findViewById<ImageButton>(R.id.imageButton)
            buttonClick.setOnClickListener {
                val intent = Intent(this, Technology::class.java)
                startActivity(intent)
            }
    }
}