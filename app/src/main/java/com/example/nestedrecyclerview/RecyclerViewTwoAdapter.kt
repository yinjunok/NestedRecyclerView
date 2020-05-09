package com.example.nestedrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewTwoAdapter: RecyclerView.Adapter<RecyclerViewTwoAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewTwoAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_2_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return 150
    }

    override fun onBindViewHolder(holder: RecyclerViewTwoAdapter.ViewHolder, position: Int) {
        holder.button.text = "$position"
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val button: Button = itemView.findViewById(R.id.button)
    }
}