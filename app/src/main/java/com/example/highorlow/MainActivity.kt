package com.example.highorlow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var welcomeTextView: TextView
    lateinit var welcomeImageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcomeTextView = findViewById(R.id.welcomeText)
        welcomeImageView = findViewById((R.id.welcomeImage))


       val button = findViewById<Button>(R.id.startButton)
        button.setOnClickListener{

            handleButtonPress()
        }


        }
        fun handleButtonPress() {
            val intent = Intent(this, CardGameActivity::class.java)

            startActivity(intent)

        }
    }