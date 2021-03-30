package kr.co.jjjoonngg.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        //Task : Add a button
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        //Task : Change the text
        /*
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
        */

        //Coding challenge
        /*
        if (count > 6) {
            return
        }
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = (++count).toString()
         */
    }

}