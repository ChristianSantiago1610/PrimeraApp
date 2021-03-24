package com.example.primeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {
    var contador = 0
    lateinit var btnIncrementar:Button
    lateinit var btnDecrementar: Button
    lateinit var tvContador:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        //Incializacoin de los variables
        btnIncrementar = findViewById(R.id.btnIncrementar)
        btnDecrementar = findViewById(R.id.btnDecrementar)
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


    }
}