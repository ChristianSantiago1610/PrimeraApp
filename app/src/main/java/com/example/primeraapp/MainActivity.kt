package com.example.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit var primerBoton:Button
    lateinit var segundoBonton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("mi_app", "Estoy en el metodo onCreate")

        primerBoton = findViewById(R.id.primer_boton)
        segundoBonton = findViewById(R.id.segundo_boton)

        primerBoton.setOnClickListener(View.OnClickListener {
            val miIntent = Intent(this,SegundaActivity::class.java)
            startActivity(miIntent)
        })

        segundoBonton.setOnClickListener {
            val otroIntent = Intent(this, TercerActivity::class.java)
            startActivity(otroIntent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("mi_app", "Estoy en el metodo onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("mi_app", "Estoy en el metodo onPause")
    }

}