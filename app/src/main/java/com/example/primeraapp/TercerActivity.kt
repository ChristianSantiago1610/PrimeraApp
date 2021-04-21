package com.example.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class TercerActivity : AppCompatActivity() {
    lateinit var imagenUdg: ImageView
    lateinit var txtNombre: TextView
    lateinit var txtCarrera: TextView
    lateinit var txtSemes: TextView
    lateinit var txtMateria: TextView
    lateinit var btnBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercer)

        btnBack = findViewById(R.id.btnBack)

        btnBack.setOnClickListener(View.OnClickListener {
            val miIntent = Intent(this,MainActivity::class.java)
            startActivity(miIntent)
        })
    }
}