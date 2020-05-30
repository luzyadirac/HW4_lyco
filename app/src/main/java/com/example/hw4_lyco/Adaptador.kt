package com.example.hw4_lyco

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_layout.view.*

class Adaptador (private val mContext: Context, private val listapersonajes:List<personajes>) : ArrayAdapter<personajes>(mContext, 0, listapersonajes) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false)

        val personaje = listapersonajes[position]

        layout.nombre_personaje.text = personaje.nombre
        layout.resumen.text = personaje.descr
        layout.ratingBar.rating = personaje.calificacion
       layout.imageView.setImageResource(personaje.imagen)
       return layout
    }
}