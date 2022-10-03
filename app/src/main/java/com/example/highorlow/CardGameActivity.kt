package com.example.highorlow

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class CardGameActivity : AppCompatActivity() {
    var scoreCount = 0
    var scoreView: TextView? = null
    private lateinit var cardImage: ImageView
    lateinit var scoreTextView: TextView
    private val deck = mutableListOf<Card>()

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_game)
        scoreCount = 0
        this.scoreTextView = findViewById<View>(R.id.scoreTextView) as TextView
        scoreTextView.text = "Score: $scoreCount"

        val lowerButton: Button = findViewById(R.id.lowerButton)
        val higherButton: Button = findViewById(R.id.higherButton)


        cardImage = findViewById(R.id.cardImage)


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
            when (random){
                R.id.higherButton -> if (card.value > deck.size) card.value else deck.size

                }
                if (card.value < deck.size) deck.size else (card.value); run {
                    Log.d("!!!", card.suite)

            upScore()
         }
            when (random){
                R.id.lowerButton -> if (card.value < deck.size) card.value else deck.size
            }

                if (card.value > deck.size) deck.size else (card.value); run {
                    Log.d("!!!", card.suite)

            upScore()
                }


//    private fun getRandomCard() {
//        val random = Random.nextInt(deck.size)
//        val card = deck[random]
//        cardImage.setImageResource(card.image)
//        // val index = Random.nextInt(deck.size)
//        // val cpuChoice = deck[index]
//        // var message = ""
////         val id = view.id
//        when (random) {
//            R.id.higherButton -> if (card.value < random) {
//                //Right Choice
////                message = "You were right! It was a higher card!"
//            } else if (card.value < random) {
//                //Wrong Choice
////                message = "You were wrong! It was a lower card!"
////
////                upScore()


//         Function för att slump kort


    fun createDeck() {

        val card0 = Card(image = R.drawable.club_ace, 1, "clubs")
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


        deck.add(card0)
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


    @SuppressLint("SetTextI18n")
    fun upScore() {
        scoreCount++
        scoreView!!.text = "Score: $scoreCount"
        }
}

















