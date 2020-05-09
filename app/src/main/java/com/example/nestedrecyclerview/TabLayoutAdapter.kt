package com.example.testapp

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.RecyclerViewOneAdapter
import com.example.nestedrecyclerview.RecyclerViewTwoAdapter

class TabLayoutAdapter(val context: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        const val ONE_TYPE = 0
        const val TWO_TYPE = 1
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == ONE_TYPE) {
            val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_1, parent, false)
            ViewOneHolder(v)
        } else {
            val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_2, parent, false)
            ViewTwoHolder(v)
        }
    }

    override fun getItemViewType(position: Int): Int {
        super.getItemViewType(position)
        return position
    }

    override fun getItemCount(): Int {
        return 2
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(position) {
            ONE_TYPE -> {
                holder as ViewOneHolder
                val adapter = RecyclerViewOneAdapter()
                holder.recyclerView.adapter = adapter
                holder.recyclerView.layoutManager = LinearLayoutManager(context)
            }
            TWO_TYPE -> {
                holder as ViewTwoHolder
                val adapter = RecyclerViewTwoAdapter()
                holder.recyclerView.adapter = adapter
                holder.recyclerView.layoutManager = LinearLayoutManager(context)
            }
        }
    }

    inner class ViewOneHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val recyclerView: RecyclerView = itemView.findViewById(R.id.recycler_view_1)
    }

    inner class ViewTwoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val recyclerView: RecyclerView = itemView.findViewById(R.id.recycler_view_2)
    }
}