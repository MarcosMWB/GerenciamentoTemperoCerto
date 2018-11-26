package com.temperocerto.gerenciamentotemperocerto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonNewClient.setOnClickListener{
            val intent = Intent(this, NewClientActivity::class.java)
            startActivity(intent)
        }

        buttonNewOrder.setOnClickListener{
            val intent = Intent(this, NewOrderActivity::class.java)
            startActivity(intent)
        }

        buttonProfitManager.setOnClickListener{
            val intent = Intent(this, Profit::class.java)
            startActivity(intent)
        }

    }
}
