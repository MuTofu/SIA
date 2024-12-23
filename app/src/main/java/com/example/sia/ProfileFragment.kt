package com.example.sia

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sia.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(layoutInflater)

        binding.cardBtnDetailProfile.setOnClickListener {

            val intent = Intent(activity, ProfileDetailActivity::class.java)
            startActivity(intent)
        }

        binding.layoutBtnUbahPassword.setOnClickListener {
            val intent = Intent(activity, GantiPasswordActivity::class.java)
            startActivity(intent)
        }

        return binding.root

    }
}