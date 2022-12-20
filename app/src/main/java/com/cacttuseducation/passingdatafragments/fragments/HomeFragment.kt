package com.cacttuseducation.passingdatafragments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cacttuseducation.passingdatafragments.R
import com.cacttuseducation.passingdatafragments.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding
    private lateinit var homeDetailsFragment : HomeDetailsFragment
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initFragments()
        onClickListener()
    }

    private fun initFragments() {
        homeDetailsFragment = HomeDetailsFragment()
    }

    private fun onClickListener() {
        binding.btnNextFragment.setOnClickListener {
            createAndSendData()
            replaceFragment()

        }
    }

    private fun replaceFragment() {
        parentFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer,homeDetailsFragment)
            addToBackStack(null)
            commit()
        }
    }

    private fun createAndSendData() {
        val bundle = Bundle()
        bundle.putString("name","Bill Gates")
        bundle.putInt("age",70)
        homeDetailsFragment.arguments = bundle
    }







}