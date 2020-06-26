package com.mohan.kotlindice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dice = Dice(5)

        dice_button.setOnClickListener {
            dice_number.text = dice.roll().toString()
        }
    }
}

class Dice(private val number: Int) {

    fun roll(): Int {
        return (1..number).random()
    }
}