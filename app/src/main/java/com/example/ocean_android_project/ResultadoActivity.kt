package com.example.ocean_android_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        //Pegamso o nome digitado que foi passado pela outra tela via Intent
        val nomeDigitado = intent.getStringExtra("NOME_DIGITADO")

        //Pegamos o tvResultado e atualizamos o texto dele
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        tvResultado.text = nomeDigitado

        //Pegamos o Button (btVoltar) na tela, pelo ID
        val btVoltar = findViewById<Button>(R.id.btVoltar)

        //Adicionamos um listener
        btVoltar.setOnClickListener {
            finish()
            
        }
    }
}