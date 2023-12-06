package com.example.gamerflix

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.gamerflix.adapter.CatalogoAdapter
import com.example.gamerflix.adapter.TabsAdapter
import com.example.gamerflix.model.CatalogoModel
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var tabLay: TabLayout
    lateinit var viewpg: ViewPager2

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLay =  findViewById(R.id.tabLay)
        viewpg = findViewById(R.id.vp_viewpg)

        tabs()
        clickTabs()
    }

    //Adapter do TabsLayout
    fun tabs(){

        val tabAdapter = TabsAdapter(this)
        viewpg.adapter = tabAdapter
    }

    //config. click da TabsLayout com o viewpager
    fun clickTabs(){

        tabLay.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {

                tab?.let {

                    viewpg.currentItem = it.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}

        })

    //fragment seguir o tabLayout
        viewpg.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                tabLay.getTabAt(position)?.select()
            }
        })
    }
}