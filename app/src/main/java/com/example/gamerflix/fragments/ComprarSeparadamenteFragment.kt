package com.example.gamerflix.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gamerflix.R
import com.example.gamerflix.adapter.ComprarSeparadamenteAdapter
import com.example.gamerflix.model.ComprarSeparadamenteModel

class ComprarSeparadamenteFragment: Fragment() {

    lateinit var listaComprar: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_comprar_separadamente, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listaComprar = view.findViewById(R.id.rv_comprar_separadamente)

        listComprarSeparadamente()
        listAdapter()
    }

    //config. do recyclerView
    fun listComprarSeparadamente(){

        listaComprar.layoutManager = LinearLayoutManager(context)
        listaComprar.setHasFixedSize(true)
    }

    fun listAdapter(){

        //config. Adapter
        val listComprar: MutableList<ComprarSeparadamenteModel> = mutableListOf()
        val adapterComprar = ComprarSeparadamenteAdapter(listComprar)

        listaComprar.adapter = adapterComprar

        //itens adapter
        val itemComprar1 = ComprarSeparadamenteModel(

            R.drawable.elden_ring,
            "Elden Ring",
            "Levante-se, Maculado, e seja guiado pela graça para portar  o poder do Anel Prístino.",
            "R$ 189,90"
        )
        listComprar.add(itemComprar1)

        val itemComprar2 = ComprarSeparadamenteModel(

            R.drawable.mk_1,
            "Mortal Kombat 1",
            "Descubra um Universo renascido de Mortal Kombat criado pelo Deus do Fogo Liu Kang.",
            "R$ 179,90"
        )
        listComprar.add(itemComprar2)

        val itemComprar3 = ComprarSeparadamenteModel(

            R.drawable.sifu,
            "Sifu",
            "Sifu é um jogo de luta realista em terceira pessoa, trazendo combates de kung fu.",
            "R$ 49,90"
        )
        listComprar.add(itemComprar3)

        val itemComprar4 = ComprarSeparadamenteModel(

            R.drawable.resident4,
            "Resident Evil 4",
            "Leon S. Kennedy, segue o rastro da raptada filha do presidente até uma vila europeia isolada.",
            "R$ 179,90"
        )
        listComprar.add(itemComprar4)

        val itemComprar5 = ComprarSeparadamenteModel(

            R.drawable.omiranha,
            "Spider-Man: Miles Morales",
            "Miles Morales começa a se adaptar a um novo lar enquanto segue os passos do seu mentor, Peter Parker.",
            "R$ 119,90"
        )
        listComprar.add(itemComprar5)

        val itemComprar6 = ComprarSeparadamenteModel(

            R.drawable.lies_of_p,
            "Lies of P",
            "Lies of P é um emocionante souslike que pega a história de Pinóquio, e coloca-a num cenário sombrio.",
            "R$ 199,90"
        )
        listComprar.add(itemComprar6)

        val itemComprar7 = ComprarSeparadamenteModel(

            R.drawable.naruto,
            "Naruto Storm Connections",
            "Naruto Storm CONNECTIONS é um jogo de luta com batalhas ninja frenéticas e dois modos história diferentes.",
            "R$ 184,90"
        )
        listComprar.add(itemComprar7)

        val itemComprar8 = ComprarSeparadamenteModel(

            R.drawable.pay_day_3,
            "Pay Day 3",
            "PAYDAY 3 é a esperada sequência de um dos jogos de tiro cooperativos mais populares de todos os tempos.",
            "R$ 149,90"
        )
        listComprar.add(itemComprar8)
    }
}