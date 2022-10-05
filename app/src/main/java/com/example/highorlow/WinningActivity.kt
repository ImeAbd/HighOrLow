package com.example.highorlow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class WinningActivity : AppCompatActivity() {
    lateinit var winningTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_winning)

        winningTextView = findViewById(R.id.winningTextView)
        val playAgainButton: Button = (findViewById(R.id.playAgainButton))
        playAgainButton.setOnClickListener {
            playAgainButtonPress()
        }
    }

    fun playAgainButtonPress() {
        val intent = Intent(this, MainActivity::class.java)

        startActivity(intent)

    }
}