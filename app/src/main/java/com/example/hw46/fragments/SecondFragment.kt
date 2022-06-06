package com.example.hw46.fragments


import androidx.lifecycle.ViewModelProvider
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.hw46.R
import com.example.hw46.base.BaseFragment
import com.example.hw46.databinding.FragmentSecondBinding
import com.example.hw46.view.MainViewModel


class SecondFragment : BaseFragment<FragmentSecondBinding>(R.layout.fragment_second) {
    override val binding by viewBinding(FragmentSecondBinding::bind)
    private lateinit var viewModel: MainViewModel
    override fun initView() {
        viewModel.onPlusClick()
        viewModel.onMinusClick()
        viewModel.counter.observe(requireActivity()){
            binding.tvCount.text =  it.toString()
        }
    }

    override fun initListener() {
    }

    override fun initViewModel() {
        viewModel= ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun checkInternet() {
    }


}