package com.example.hw46.view

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private var mCounter = 0
    private var listItem = ArrayList<String>()
    var list = MutableLiveData<ArrayList<String>>()
    val counter = MutableLiveData<Int>()
    fun onPlusClick(){
        mCounter++
        counter.value = mCounter
        listItem.add("+")
        list.value = listItem
    }
    fun onMinusClick(){
        mCounter--
        counter.value = mCounter
        listItem.add("-")
        list.value = listItem
    }
}