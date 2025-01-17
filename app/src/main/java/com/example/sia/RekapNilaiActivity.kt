package com.example.sia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintSet.Layout
import com.example.sia.databinding.ActivityHomeBinding
import com.example.sia.databinding.ActivityRekapNilaiBinding

class RekapNilaiActivity : AppCompatActivity() {
    private lateinit var binding : ActivityRekapNilaiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRekapNilaiBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.layoutBtnRekapNilai10.setOnClickListener{
            val intent = Intent(this, RekapNilaiDetailActivity::class.java)
            startActivity(intent)
        }

        binding.layoutBtnRekapNilai11.setOnClickListener{
            val intent = Intent(this, RekapNilaiDetailActivity::class.java)
            startActivity(intent)
        }

        binding.layoutBtnRekapNilai12.setOnClickListener{
            val intent = Intent(this, RekapNilaiDetailActivity::class.java)
            startActivity(intent)
        }
    }
}