package com.example.sia

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sia.databinding.FragmentQRMenuBinding


class QRMenuFragment : Fragment() {

    private lateinit var binding : FragmentQRMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentQRMenuBinding.inflate(inflater,container,false)

        binding.btnInputPresensi.setOnClickListener {
            val intent = Intent(activity, InputPresensiActivity::class.java)
            startActivity(intent)
        }

        return binding.root



    }

}