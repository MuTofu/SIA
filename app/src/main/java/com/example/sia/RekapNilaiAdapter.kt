package com.example.sia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RekapNilaiAdapter(private val data : Array<String>) : RecyclerView.Adapter<RekapNilaiAdapter.ViewHolder>() {

    class ViewHolder(v : View) : RecyclerView.ViewHolder(v) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fetch_nilai, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        var dataku = data.size
        return dataku
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

}