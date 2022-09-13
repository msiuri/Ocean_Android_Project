package com.example.ocean_android_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Detectar clique

        //Pegamos o item na tela através do ID
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        //Adciona um listener para o btEnviar
        btEnviar.setOnClickListener {
            //Executa ao clicar no botão

            tvResultado.text = "Iuri Moura"
        }



    }
}