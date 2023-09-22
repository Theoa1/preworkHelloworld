package com.example.preworkhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.homeButton)
        button.setOnClickListener{
            Log.v("Testing Button", "Button Clicked")
            Toast.makeText(this, "Unfortunately i'm asleep. Reach out tomorrow!", LENGTH_SHORT).show()
        }
        val image = findViewById<ImageView>(R.id.homeimageView)
        image.setOnClickListener{
            Log.v("Testing Image", "Image Clicked")
            makeText(this, "Hey there, I'm your assistant. How can I help", LENGTH_LONG).show()
        }
    }
}

