package com.example.viewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(var list: List<ItemList>):
    RecyclerView.Adapter<ViewPagerAdapter.PageViewHolder>() {

    class PageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var img: ImageView = itemView.findViewById(R.id.img)
        var text: TextView = itemView.findViewById(R.id.tv)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageViewHolder {
        return PageViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.splash_screens, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PageViewHolder, position: Int) {
        var item = list[position]
        holder.img.setImageResource(item.photo)
        holder.text.text = item.text
    }
}