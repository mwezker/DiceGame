package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button2)

         var dice = arrayOf(R.drawable.dice_1,R.drawable.dice_1,R.drawable.dice_3,R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6)
        btn.setOnClickListener {
        var txt = findViewById<TextView>(R.id.textView2)

            txt.text = Random.nextInt(1, 7).toString()

            var counter = txt.text.toString()
            var count = Integer.parseInt(counter)

            var img = findViewById<ImageView>(R.id.imageView)



            when (count) {
                1 -> img.setImageResource(R.drawable.dice_1)
                2 -> img.setImageResource(R.drawable.dice_2)
                3 -> img.setImageResource(R.drawable.dice_3)
                4 -> img.setImageResource(R.drawable.dice_4)
                5 -> img.setImageResource(R.drawable.dice_5)
                6 -> img.setImageResource(R.drawable.dice_6)
            }


        }
        val buttonClick = findViewById<Button>(R.id.button)
        buttonClick.setOnClickListener {
            val intent = Intent(this, AirmeActivity::class.java)
            startActivity(intent)
        }
    }
}