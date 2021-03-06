package com.temperocerto.gerenciamentotemperocerto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profit.*

class ActivityProfit : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profit)

        BackButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        profitbtn.setOnClickListener {
            val result = sell.text.toString().toInt() - cost.text.toString().toInt()
            display.text = result.toString()
        }
    }
}
