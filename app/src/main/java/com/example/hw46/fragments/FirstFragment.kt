package com.example.hw46.fragments


import androidx.lifecycle.ViewModelProvider
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.hw46.R
import com.example.hw46.base.BaseFragment
import com.example.hw46.databinding.FragmentFirstBinding
import com.example.hw46.view.MainViewModel


class FirstFragment: BaseFragment<FragmentFirstBinding>
    (R.layout.fragment_first) {
    override val binding by viewBinding(FragmentFirstBinding::bind)
    private lateinit var viewModel:MainViewModel

    override fun initView() {
        viewModel.counter.observe(requireActivity()){
            binding.tvNumber.text =  it.toString()
        }
    }

    override fun initListener() {
        binding.btnPlus.setOnClickListener{
            viewModel.onPlusClick()
        }
        binding.btnMinus.setOnClickListener{
            viewModel.onMinusClick()
        }

    }

    override fun initViewModel() {
        viewModel=ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun checkInternet() {
    }


}