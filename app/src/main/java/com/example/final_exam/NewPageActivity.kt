package com.example.final_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import androidx.fragment.app.Fragment

import androidx.viewpager.widget.ViewPager
import com.example.final_exam.Adapter.ViewPagerAdapter
import com.example.final_exam.Fragments.FirstFragment
import com.example.final_exam.Fragments.SecondFragment
import com.example.final_exam.Fragments.ThirdFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


import kotlin.collections.ArrayList

class NewPageActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager







    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_page)
        viewPager = findViewById(R.id.viewpager)

        val botom : BottomNavigationView = findViewById(R.id.navigationview)

        botom.setOnNavigationItemSelectedListener(bottomnavview)






        val menuadapter = ViewPagerAdapter(initfragments(),supportFragmentManager)
        viewPager.adapter = menuadapter












                    }



    val bottomnavview = BottomNavigationView.OnNavigationItemSelectedListener {
        when(it.itemId){
            R.id.home -> {
                viewPager.currentItem = 0
            }
            R.id.history -> {
                viewPager.currentItem = 1
            }
            R.id.contacts -> {
                viewPager.currentItem = 2
            }
        }





        true


    }





}









    private fun initfragments():ArrayList<Fragment>{
        return arrayListOf(
            FirstFragment.newinstance(),
            SecondFragment.newinstance(),
            ThirdFragment.newinstance()



        )
    }







