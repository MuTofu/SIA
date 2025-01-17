package com.example.sia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class JadwalAdapter(private val data : Array<String>) : RecyclerView.Adapter<JadwalAdapter.ViewHolder>() {

    class ViewHolder(v : View) : RecyclerView.ViewHolder(v) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JadwalAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fetch_jadwal, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: JadwalAdapter.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        var dataku = data.size
        return dataku
    }
}