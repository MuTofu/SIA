package com.example.sia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.sia.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        gantiFragment(PrimaryFragment())
        binding.navbarBottom.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.btn_home -> gantiFragment(PrimaryFragment())
                R.id.btn_qr -> gantiFragment(QRMenuFragment())
                R.id.btn_profile -> gantiFragment(ProfileFragment())
                else -> {
                }
            }
            true
        }









    }

    private fun gantiFragment(fragment: Fragment) {
        supportFragmentManager.commit {
            replace(R.id.Home_fragment, fragment, "myFragment")
        }
    }



}