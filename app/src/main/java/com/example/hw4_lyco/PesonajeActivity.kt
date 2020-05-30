package com.example.hw4_lyco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pesonaje.*

class PesonajeActivity : AppCompatActivity() {
var numero = 0.0F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesonaje)

        val personaje = intent.getSerializableExtra("persona") as personajes

        textView3.text = personaje.descr
        imageView2.setImageResource(personaje.imagen)
        ratingBar2.rating = personaje.calificacion
        textView4.text = personaje.nombre


        ratingBar2.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            numero = rating
        }

        button.setOnClickListener { view->
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("valor", numero)
            intent.putExtra("persona",personaje.nombre)
            startActivity(intent)
        }




    }
}
