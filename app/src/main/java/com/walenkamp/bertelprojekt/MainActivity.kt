package com.walenkamp.bertelprojekt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var games: Float = 0F
    var winRate: Float = 0.0F
    var wins: Float = 0F
    var losses: Float = 0F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        increase.setOnClickListener {
            increase()
        }

        decrease.setOnClickListener {
            decrease()
        }
    }


    private fun increase() {
        wins += 1
        games += 1
        calcRate()
   win_counter.text = wins.toInt().toString() }

    private fun decrease() {
        losses -= 1
        games += 1
        calcRate()
        loss_counter.text = losses.toInt().toString()
    }

    private fun calcRate() {


        winRate = wins / games * 100F

        win_rate.text = winRate.toString()
    }
}
