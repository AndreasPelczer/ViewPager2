package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //adapter,newpager initalisieren und daten erstellen

        initViewPager2()
    }

    private fun initViewPager2() {

        //viewpager initalisieren
        val viewPager: ViewPager2 = findViewById(R.id.viewpager)
        var adapter = ViewPagerViewAdapter()
        viewPager.adapter = adapter
        adapter.setNewUsers(createExampleUserList() as List<User>)

        var  tabLayout: TabLayout = findViewById(R.id.tablayout)
        TabLayoutMediator(tabLayout,viewPager){
            tab,position ->
            tab.text = createExampleUserList()[position].name
        }.attach()

    }

    private fun createExampleUserList(): ArrayList<User> {

        var export:ArrayList<User> = ArrayList()
        export.add(User("Andi","Pelczer"))
        export.add(User("Andi","Pelczer"))
        export.add(User("Andi","Pelczer"))
        export.add(User("Andi","Pelczer"))
        export.add(User("Andi","Pelczer"))
        export.add(User("Andi","Pelczer"))
        export.add(User("Andi","Pelczer"))




        return export
    }





}

