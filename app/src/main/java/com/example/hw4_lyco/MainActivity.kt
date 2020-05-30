package com.example.hw4_lyco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var personaje1 = personajes("Cersei", 4.1F,"Lanister y reina de los siete reinos, malvada, estratega y dealmada", R.drawable.cersielanister)
        var personaje2 = personajes("Aria Stark", 3.0F ,"Carga mucho odio haci los que le mataron a su familia, vengativa y misteriosa",R.drawable.ariastark)
        var personaje3 = personajes("Thereon", 5.0F ,"el menor de los Lanister, inteligente, sagaz con lo compensa su condición de enano",R.drawable.thereonlanister)
        var personaje4 = personajes("Daenerys", 4.2F ,"La madre de dragones y quebrantadora de cadenas",R.drawable.dayaneristargerian)

        val listaper = listOf(personaje1,personaje2, personaje3, personaje4)

        val adaptador = Adaptador(this, listaper)

            listado.adapter = adaptador
        listado.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, PesonajeActivity::class.java)
            intent.putExtra("persona", listaper[position])
            startActivity(intent)

            val dato = intent.getFloatExtra("valor",0F)

            val per = intent.getStringExtra("persona")
            if(per =="Cersei"){
                personaje1 == personajes("Cersei", dato,"Lanister y reina de los siete reinos, malvada, estratega y dealmada", R.drawable.cersielanister)
            }
            else if(per =="Aria Stark") {
                personaje2 = personajes("Aria Stark", dato ,"Carga mucho odio haci los que le mataron a su familia, vengativa y misteriosa",R.drawable.ariastark)

            }
            else if(per =="Thereon") {
                personaje3 = personajes("Thereon", dato ,"el menor de los Lanister, inteligente, sagaz con lo compensa su condición de enano",R.drawable.thereonlanister)

            }
            else if(per =="Daenerys") {
                personaje4 = personajes("Daenerys", dato ,"La madre de dragones y quebrantadora de cadenas",R.drawable.dayaneristargerian)
            }
        }
    }
}
