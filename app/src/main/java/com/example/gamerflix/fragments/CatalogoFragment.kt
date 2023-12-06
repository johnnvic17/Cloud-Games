package com.example.gamerflix.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gamerflix.R
import com.example.gamerflix.adapter.CatalogoAdapter
import com.example.gamerflix.model.CatalogoModel

class CatalogoFragment: Fragment() {

    lateinit var listaCatalogo: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_catalogo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listaCatalogo = view.findViewById(R.id.rv_catalogo)

        listCatalogo()
        listAdapter()
    }

    fun listCatalogo(){

        listaCatalogo.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        listaCatalogo.setHasFixedSize(true)
    }


    fun listAdapter(){


        //adapter
        val itensCatalogo: MutableList<CatalogoModel> = mutableListOf()
        val adapter = CatalogoAdapter(this, itensCatalogo)
        listaCatalogo.adapter = adapter


        //itens da lista
        val itemLista1 = CatalogoModel(

            R.drawable.lies_of_p,
            "Souslike - Ação - Fantasia - Sombrio - RPG  Mundo Aberto - Exploração - Um jogador"
        )
        itensCatalogo.add(itemLista1)

        val itemLista2 = CatalogoModel(

            R.drawable.mk_1,
            "Luta - Ação - Violência - PvP - Arcade   Sangue - Artes Marciais - Competitivo"
        )
        itensCatalogo.add(itemLista2)

        val itemLista3 = CatalogoModel(

            R.drawable.omiranha,
            "Aventura - Mundo Aberto - Super-Heróis   Terceira Pessoa - Combate - Quadrinhos"
        )
        itensCatalogo.add(itemLista3)

        val itemLista4 = CatalogoModel(

            R.drawable.resident4,
            "Terror - Zumbis - Ação - Sobrevivência   Sombrio - Remake - Violento - Tiro"
        )
        itensCatalogo.add(itemLista4)

        val itemLista5 = CatalogoModel(

            R.drawable.sifu,
            "Artes Marciais - Ação - Souslike - Indie   Arcade - Um jogador - Difícil"
        )
        itensCatalogo.add(itemLista5)

        val itemLista6 = CatalogoModel(

            R.drawable.elden_ring,
            "Soulslike - Mundo Aberto - RPG - Difícil   Fantasia - Ação - Exploração -Atmosférico"
        )
        itensCatalogo.add(itemLista6)

        val itemLista7 = CatalogoModel(

            R.drawable.naruto,
            "Anime - Luta - Ação - Ninja - Aventura - PvP   Modo história - Multiplayer"
        )
        itensCatalogo.add(itemLista7)

        val itemLista8 = CatalogoModel(

            R.drawable.pay_day_3,
            "Tiro em primeira pessoa (FPS) - Assalto   Tático - Ação - Cooperativo - Realístico"
        )
        itensCatalogo.add(itemLista8)
    }
}