package com.example.hw46.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding>(@LayoutRes layoutId: Int) :
    Fragment(
        layoutId
    ) {
    protected abstract val binding : VB



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        checkInternet()
        initViewModel()
        initView()
        initListener()
    }


    abstract fun initView() // инициализировать вьюшки

        abstract fun initListener() //Логика кликов

        abstract fun initViewModel() //обработка обзерверов

        abstract fun checkInternet()
}