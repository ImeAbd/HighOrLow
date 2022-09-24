package com.example.highorlow

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class CardGameActivity : AppCompatActivity() {

    val deck = mutableListOf<Card>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_game)
        


    createDeck()
        deck.shuffle()
        val currentCard = deck[1-10]

        val imageView = findViewById<ImageView>()
        imageView.setImageResource(currentCard.image)
    }


    }
    fun createDeck(){



        val card = Card(R.drawable.club_ace, 1, "clubs")
        val card1 = Card(R.drawable.club_two, 2, "clubs")
        val card2 = Card(R.drawable.club_three, 3, "clubs")
        val card3 = Card(R.drawable.club_four, 4, "clubs")
        val card4 = Card(R.drawable.club_five, 5, "clubs")
        val card5 = Card(R.drawable.club_six, 6, "clubs")
        val card6 = Card(R.drawable.club_seven, 7, "clubs")
        val card7 = Card(R.drawable.club_eight, 8, "clubs")
        val card8 = Card(R.drawable.club_nine, 9, "clubs")
        val card9 = Card(R.drawable.club_ten, 10, "clubs")
        val card10 = Card(R.drawable.club_four, 10, "clubs")
        val card11 = Card(R.drawable.club_four, 10, "clubs")
        val card12 = Card(R.drawable.club_four, 10, "clubs")
















     }



    




