package com.example.highorlow

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class CardGameActivity : AppCompatActivity() {
    private var scoreCount = 2
    private lateinit var cardImage: ImageView
    private lateinit var scoreTextView: TextView
    private val deck = mutableListOf<Card>()
    private var lastCard: Card? = null


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_game)
        scoreCount = 2
        scoreTextView = findViewById(R.id.scoreTextView)
        scoreTextView.text = "Current point: $scoreCount"

        val lowerButton: Button = findViewById(R.id.lowerButton)
        val higherButton: Button = findViewById(R.id.higherButton)
        cardImage = findViewById(R.id.cardImage)

        createDeck()

        Log.d("!!!", "start")

        higherButton.setOnClickListener {
            getHighRandomCard()
        }


        lowerButton.setOnClickListener {
            getLowRandomCard()

        }
    }


    private fun getHighRandomCard() {
        val random = Random.nextInt(deck.size)
        val newCard = deck[random]
        cardImage.setImageResource(newCard.image)

        if (lastCard != null) {


            Log.d("!!!", "new: ${newCard.value} old: ${lastCard?.value}")

            if (newCard.value > lastCard!!.value) {
                upScore()
            }
            if (newCard.value == lastCard!!.value) {
                Toast.makeText(
                    this,
                    "${newCard.value} of ${newCard.suite} and ${lastCard!!.value} of ${lastCard!!.suite} has the same value. Nothing happened.",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (newCard.value < lastCard!!.value) {
                Toast.makeText(
                    this,
                    "Your guess was wrong. ${newCard.value} of ${newCard.suite} is a lower card.",
                    Toast.LENGTH_LONG
                ).show()
                downScore()

            }
        }
        lastCard = newCard
    }

    private fun getLowRandomCard() {
        val random = Random.nextInt(deck.size)
        val newCard = deck[random]
        cardImage.setImageResource(newCard.image)

        if (lastCard != null) {


            Log.d("!!!", "new: ${newCard.value} old: ${lastCard?.value}")

            if (newCard.value < lastCard!!.value) {
                upScore()
            }
            if (newCard.value == lastCard!!.value) {
                Toast.makeText(
                    this,
                    "${newCard.value} of ${newCard.suite} and ${lastCard!!.value} of ${lastCard!!.suite} has the same value. Nothing happened.",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (newCard.value > lastCard!!.value) {
                Toast.makeText(
                    this,
                    "Your guess was wrong. ${newCard.value} of ${newCard.suite} is a higher card.",
                    Toast.LENGTH_LONG
                ).show()
                downScore()
            }

        }

        lastCard = newCard
    }


    private fun createDeck() {

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
        val card13 = Card(image = R.drawable.diamond_ace, 1, "diamond")
        val card14 = Card(image = R.drawable.diamond_two, 2, "diamond")
        val card15 = Card(image = R.drawable.diamond_three, 3, "diamond")
        val card16 = Card(image = R.drawable.diamond_four, 4, "diamond")
        val card17 = Card(image = R.drawable.diamond_five, 5, "diamond")
        val card18 = Card(image = R.drawable.diamond_six, 6, "diamond")
        val card19 = Card(image = R.drawable.diamond_seven, 7, "diamond")
        val card20 = Card(image = R.drawable.diamond_eight, 8, "diamond")
        val card21 = Card(image = R.drawable.diamond_nine, 9, "diamond")
        val card22 = Card(image = R.drawable.diamond_ten, 10, "diamond")
        val card23 = Card(image = R.drawable.diamond_jack, 10, "diamond")
        val card24 = Card(image = R.drawable.diamond_queen, 10, "diamond")
        val card25 = Card(image = R.drawable.diamond_king, 10, "diamond")
        val card26 = Card(image = R.drawable.spade_ace, 1, "spade")
        val card27 = Card(image = R.drawable.spade_two, 2, "spade")
        val card28 = Card(image = R.drawable.spade_three, 3, "spade")
        val card29 = Card(image = R.drawable.spade_four, 4, "spade")
        val card30 = Card(image = R.drawable.spade_five, 5, "spade")
        val card31 = Card(image = R.drawable.spade_six, 6, "spade")
        val card32 = Card(image = R.drawable.spade_seven, 7, "spade")
        val card33 = Card(image = R.drawable.spade_eight, 8, "spade")
        val card34 = Card(image = R.drawable.spade_nine, 9, "spade")
        val card35 = Card(image = R.drawable.spade_ten, 10, "spade")
        val card36 = Card(image = R.drawable.spade_jack, 10, "spade")
        val card37 = Card(image = R.drawable.spade_queen, 10, "spade")
        val card38 = Card(image = R.drawable.spade_king, 10, "spade")
        val card39 = Card(image = R.drawable.heart_ace, 1, "heart")
        val card40 = Card(image = R.drawable.heart_two, 2, "heart")
        val card41 = Card(image = R.drawable.heart_three, 3, "heart")
        val card42 = Card(image = R.drawable.heart_four, 4, "heart")
        val card43 = Card(image = R.drawable.heart_five, 5, "heart")
        val card44 = Card(image = R.drawable.heart_six, 6, "heart")
        val card45 = Card(image = R.drawable.heart_seven, 7, "heart")
        val card46 = Card(image = R.drawable.heart_eight, 8, "heart")
        val card47 = Card(image = R.drawable.heart_nine, 9, "heart")
        val card48 = Card(image = R.drawable.heart_ten, 10, "heart")
        val card49 = Card(image = R.drawable.heart_jack, 10, "heart")
        val card50 = Card(image = R.drawable.heart_queen, 10, "heart")
        val card51 = Card(image = R.drawable.heart_king, 10, "heart")





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
        deck.add(card13)
        deck.add(card14)
        deck.add(card15)
        deck.add(card16)
        deck.add(card17)
        deck.add(card18)
        deck.add(card19)
        deck.add(card20)
        deck.add(card21)
        deck.add(card22)
        deck.add(card23)
        deck.add(card24)
        deck.add(card25)
        deck.add(card26)
        deck.add(card27)
        deck.add(card28)
        deck.add(card29)
        deck.add(card30)
        deck.add(card31)
        deck.add(card32)
        deck.add(card33)
        deck.add(card34)
        deck.add(card35)
        deck.add(card36)
        deck.add(card37)
        deck.add(card38)
        deck.add(card39)
        deck.add(card40)
        deck.add(card41)
        deck.add(card42)
        deck.add(card43)
        deck.add(card44)
        deck.add(card45)
        deck.add(card46)
        deck.add(card47)
        deck.add(card48)
        deck.add(card49)
        deck.add(card50)
        deck.add(card51)





        deck.shuffle()


    }

    private fun upScore() {
        Log.d("!!!", "score $scoreCount")
        scoreCount++
        scoreTextView.text = "Current score: $scoreCount"

        if (scoreCount == 10) {
            val intent = Intent(this, WinningActivity::class.java)
            startActivity(intent)
        }
    }

    private fun downScore() {
        scoreCount--
        scoreTextView.text = "Current score: $scoreCount"
        if (scoreCount == 0) {
            val intent = Intent(this, LosingActivity::class.java)
            startActivity(intent)
        }
    }
}


























