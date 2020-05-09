package com.example.nestedrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewOneAdapter: RecyclerView.Adapter<RecyclerViewOneAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_1_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return 200
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = "$position"
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}