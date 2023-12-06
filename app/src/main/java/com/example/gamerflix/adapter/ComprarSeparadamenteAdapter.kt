package com.example.gamerflix.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gamerflix.model.ComprarSeparadamenteModel
import com.example.gamerflix.R

class ComprarSeparadamenteAdapter(private val itens: MutableList<ComprarSeparadamenteModel>): RecyclerView.Adapter<ComprarSeparadamenteAdapter.ComprarSeparadamenteViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComprarSeparadamenteViewHolder {

       val itemComprar = LayoutInflater.from(parent.context).inflate(R.layout.comprar_separadamente_item, parent, false)
       val holder = ComprarSeparadamenteViewHolder(itemComprar)
       return holder
    }

    override fun getItemCount(): Int = itens.size

    override fun onBindViewHolder(holder: ComprarSeparadamenteViewHolder, position: Int) {

        holder.imgComprar.setImageResource(itens[position].imgComprar)
        holder.tituloComprar.text = itens[position].tituloComprar
        holder.descricaoComprar.text = itens[position].descricaoComprar
        holder.precoComprar.text = itens[position].precoComprar
    }

    inner class ComprarSeparadamenteViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val imgComprar = itemView.findViewById<ImageView>(R.id.iv_img_comprar)
        val tituloComprar = itemView.findViewById<TextView>(R.id.tv_title_comprar)
        val descricaoComprar = itemView.findViewById<TextView>(R.id.tv_descricao_comprar)
        val precoComprar = itemView.findViewById<TextView>(R.id.tv_preco_comprar)
    }
}