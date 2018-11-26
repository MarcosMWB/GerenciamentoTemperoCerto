package com.temperocerto.gerenciamentotemperocerto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_new_client.*
import com.temperocerto.gerenciamentotemperocerto.R.id.edt_Numero
import com.github.rtoshiro.util.format.text.MaskTextWatcher
import com.github.rtoshiro.util.format.SimpleMaskFormatter



class NewClientActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_client)

        BackButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val smf = SimpleMaskFormatter("(NN)N NNNN-NNNN")
        val mtw = MaskTextWatcher(edt_Numero, smf)
        edt_Numero.addTextChangedListener(mtw)
    }
}
