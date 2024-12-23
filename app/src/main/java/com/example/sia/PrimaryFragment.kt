package com.example.sia

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sia.databinding.FragmentPrimaryBinding

class PrimaryFragment : Fragment() {

    private lateinit var binding : FragmentPrimaryBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPrimaryBinding.inflate(inflater,container,false)
        val view = binding.root

        binding.cardBtnRekap.setOnClickListener{
            val intent = Intent(activity, RekapNilaiActivity::class.java)
            startActivity(intent)
        }

        return view

    }
}