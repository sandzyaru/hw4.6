package com.example.hw46.fragments.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hw46.MainActivity
import com.example.hw46.fragments.model.FragmentModel

class ViewPagerAdapter(activity: MainActivity):FragmentStateAdapter(activity) {
    private var fragments = ArrayList<FragmentModel>()
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position].fragment
    }
    fun setFragments(fragments: ArrayList<FragmentModel>){
        this.fragments=fragments
    }
}