package com.example.gamerflix.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gamerflix.model.CatalogoModel
import com.example.gamerflix.R
import com.example.gamerflix.fragments.CatalogoFragment

class CatalogoAdapter(private val context: CatalogoFragment, private val itens: MutableList<CatalogoModel>): RecyclerView.Adapter<CatalogoAdapter.CatalogoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatalogoViewHolder {

        val itemLista = LayoutInflater.from(parent.context).inflate(R.layout.catalogo_item, parent, false)
        val holder = CatalogoViewHolder(itemLista)
        return holder
    }

    override fun getItemCount(): Int = itens.size

    override fun onBindViewHolder(holder: CatalogoViewHolder, position: Int) {

        holder.img.setImageResource(itens[position].img)
        holder.desc.text = itens[position].desc
    }

    inner class CatalogoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val img = itemView.findViewById<ImageView>(R.id.iv_img)
        val desc = itemView.findViewById<TextView>(R.id.tv_descricao)
    }
}