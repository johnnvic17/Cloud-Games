package com.example.gamerflix.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.gamerflix.fragments.CatalogoFragment
import com.example.gamerflix.fragments.ComprarSeparadamenteFragment

class TabsAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {

        return when(position) {

            0 -> CatalogoFragment()
            1 -> ComprarSeparadamenteFragment()
            else -> CatalogoFragment()
        }
    }
}