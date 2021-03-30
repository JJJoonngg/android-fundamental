package kr.co.jjjoonngg.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ChangeAnAppActivity : AppCompatActivity() {

    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_an_app)

        val a1RollButton: Button = findViewById(R.id.a1_roll_button)
        a1RollButton.setOnClickListener { rollDice() }

        val a1ResetButton: Button = findViewById(R.id.a1_reset_button)
        a1ResetButton.setOnClickListener { resetText() }

    }

    private fun rollDice() {
        if (count > 6) {
            return
        }
        val a1ResultText: TextView = findViewById(R.id.a1_result_text)
        a1ResultText.text = (++count).toString()
    }

    private fun resetText() {
        count = 0
        val a1ResultText: TextView = findViewById(R.id.a1_result_text)
        a1ResultText.text = count.toString()
    }
}