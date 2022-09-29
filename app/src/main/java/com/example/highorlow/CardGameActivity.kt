package com.example.highorlow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class CardGameActivity : AppCompatActivity() {
    private lateinit var cardImage: ImageView
    private val deck = mutableListOf<Card>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_game)

        val lowerButton: Button = findViewById<Button>(R.id.lowerButton)
        val higherButton: Button = findViewById<Button>(R.id.higherButton)

        cardImage = findViewById(R.id.cardImage)
        createDeck()

        findViewById<Button>(R.id.higherButton)
        higherButton.setOnClickListener {
            getRandomCard()


            findViewById<Button>(R.id.lowerButton)
            lowerButton.setOnClickListener {
                getRandomCard()
            }
        }
    }

    private fun getRandomCard() {
        val random = Random.nextInt(deck.size)
        val card = deck[random]
        cardImage.setImageResource(card.image)

    }


    private fun createDeck() {

        val card = Card(image = R.drawable.club_ace, 1, "clubs")
        val card1 = Card(image = R.drawable.club_two, 2, "clubs")
        val card2 = Card(image = R.drawable.club_three, 3, "clubs")
        val card3 = Card(image = R.drawable.club_four, 4, "clubs")
        val card4 = Card(image = R.drawable.club_five, 5, "clubs")
        val card5 = Card(image = R.drawable.club_six, 6, "clubs")
        val card6 = Card(image = R.drawable.club_seven, 7, "clubs")
        val card7 = Card(image = R.drawable.club_eight, 8, "clubs")
        val card8 = Card(image = R.drawable.club_nine, 9, "clubs")
        val card9 = Card(image = R.drawable.club_ten, 10, "clubs")
        val card10 = Card(image = R.drawable.club_four, 10, "clubs")
        val card11 = Card(image = R.drawable.club_four, 10, "clubs")
        val card12 = Card(image = R.drawable.club_four, 10, "clubs")


        deck.add(card)
        deck.add(card1)
        deck.add(card2)
        deck.add(card3)
        deck.add(card4)
        deck.add(card5)
        deck.add(card6)
        deck.add(card7)
        deck.add(card8)
        deck.add(card9)
        deck.add(card10)
        deck.add(card11)
        deck.add(card12)

        deck.shuffle()

    }

}










