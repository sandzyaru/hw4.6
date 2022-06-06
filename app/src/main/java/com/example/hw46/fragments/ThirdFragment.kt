package com.example.hw46.fragments


import androidx.lifecycle.ViewModelProvider
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.hw46.R
import com.example.hw46.base.BaseFragment
import com.example.hw46.databinding.FragmentThirdBinding
import com.example.hw46.view.MainViewModel


class ThirdFragment : BaseFragment<FragmentThirdBinding>(R.layout.fragment_third) {
    override val binding by viewBinding(FragmentThirdBinding::bind)
    private lateinit var viewModel: MainViewModel

    override fun initView() {
        viewModel.list.observe(viewLifecycleOwner){
            binding.tvActions.text = it.toString()
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