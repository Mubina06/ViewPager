package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    lateinit var item: MutableList<ItemList>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager2: ViewPager2 = findViewById(R.id.vp)


        item = mutableListOf<ItemList>()
        item.add(ItemList(R.drawable.img, "Thousands of the best real estate at affordable prices"))
        item.add(ItemList(R.drawable.img_1, "Book a real estate quickly and easily with one click"))
        item.add(ItemList(R.drawable.img_2, "Let's find the real estate that suits you right now!"))

        viewPager2.adapter = ViewPagerAdapter(item)
    }
}