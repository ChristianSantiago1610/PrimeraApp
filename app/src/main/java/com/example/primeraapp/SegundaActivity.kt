package com.example.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {
    var contador = 0
    lateinit var btnIncrementar:Button
    lateinit var btnDecrementar: Button
    lateinit var btnBack: Button
    lateinit var tvContador:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        //Incializacoin de los variables
        //explicacion git
        btnIncrementar = findViewById(R.id.btnIncrementar)
        btnDecrementar = findViewById(R.id.btnDecrementar)
        btnBack = findViewById(R.id.btnBack)
        tvContador = findViewById(R.id.tvNumero)


        btnIncrementar.setOnClickListener {
            if (contador<10){
                contador++
            }else{
                btnIncrementar.isEnabled = false
                btnIncrementar.isEnabled = true
            }
            tvContador.text = "$contador"
        }

        btnDecrementar.setOnClickListener {
            contador--
            tvContador.text = "$contador"
            Log.d("contador","$contador")
        }

        btnBack.setOnClickListener(View.OnClickListener {
            val miIntent = Intent(this,MainActivity::class.java)
            startActivity(miIntent)
        })



    }
}