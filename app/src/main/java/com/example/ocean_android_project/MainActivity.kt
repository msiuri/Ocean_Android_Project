package com.example.ocean_android_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Detectar clique

        //Pegamos o item na tela através do ID
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val etNome = findViewById<EditText>(R.id.etNome)
        val brAbrirNovaTela = findViewById<Button>(R.id.btNovaTela)




        //Add um listener para o btEnviar
        btEnviar.setOnClickListener {
            //Executa ao clicar no botão
            if (etNome.text.isNotEmpty() ) {
                tvResultado.text = etNome.text
            }
            else {
                val msgError = "Digite algo!"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(applicationContext, msgError, duration)

                toast.show()

            }
        }

        //Add listener para btAbrirNovaTela
        brAbrirNovaTela.setOnClickListener {
            //Criamos Intent (intenção de ir dessa tela para a ResultadoActivity
            val intentNovaTela = Intent(this, ResultadoActivity::class.java)

            val nomeDigitado = etNome.text.toString()
            intentNovaTela.putExtra("NOME_DIGITADO", nomeDigitado)

            //Registramos a Intent passando que é uma Activity
            startActivity(intentNovaTela)
        }





    }
}