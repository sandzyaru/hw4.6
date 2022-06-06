package com.example.hw46

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hw46.databinding.ActivityMainBinding
import com.example.hw46.fragments.FirstFragment
import com.example.hw46.fragments.SecondFragment
import com.example.hw46.fragments.ThirdFragment
import com.example.hw46.fragments.adapter.ViewPagerAdapter
import com.example.hw46.fragments.model.FragmentModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var fragments:ArrayList<FragmentModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fragments = ArrayList()
        val viewPager = binding.viewPager2
        val adapter = ViewPagerAdapter(this)
        fragments.add(FragmentModel(FirstFragment()))
        fragments.add(FragmentModel(SecondFragment()))
        fragments.add(FragmentModel(ThirdFragment()))
        adapter.setFragments(fragments)
        viewPager.adapter =adapter


    }
}