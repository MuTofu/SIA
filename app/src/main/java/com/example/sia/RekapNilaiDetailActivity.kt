package com.example.sia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sia.databinding.ActivityRekapNilaiBinding
import com.example.sia.databinding.ActivityRekapNilaiDetailBinding

class RekapNilaiDetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityRekapNilaiDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRekapNilaiDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var data = arrayOf("W","W","W","W","W",)

        val adapter = RekapNilaiAdapter(data)
        binding.RecyclerNilai.layoutManager = LinearLayoutManager(this)
        binding.RecyclerNilai.adapter = adapter
        binding.RecyclerNilai.isNestedScrollingEnabled = false



    }
}