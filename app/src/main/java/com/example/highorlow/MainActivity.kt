package com.example.highorlow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    late init var introtextView = TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.startButton)
        val buttonClick = findViewById<Button>(R.id.startButton)
        buttonClick.setOnClickListener {
            val intent = Intent(this, CardGameActivity::class.java)
            startActivity(intent)

        }
    }
}