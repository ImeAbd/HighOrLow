package com.example.highorlow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class LosingActivity : AppCompatActivity() {

    lateinit var losingTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_losing)

        losingTextView = findViewById(R.id.losingTextView)
        val tryAgainButton: Button = findViewById(R.id.tryAgainButton)

        tryAgainButton.setOnClickListener {
            tryAgainButtonPress()
        }
    }

    fun tryAgainButtonPress() {
        val intent = Intent(this, MainActivity::class.java)

        startActivity(intent)

    }
}