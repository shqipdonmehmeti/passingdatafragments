package com.cacttuseducation.passingdatafragments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cacttuseducation.passingdatafragments.R
import com.cacttuseducation.passingdatafragments.databinding.FragmentExploreBinding

class ExploreFragment : Fragment() {

    private lateinit var binding : FragmentExploreBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentExploreBinding.inflate(inflater,container,false)
        return binding.root
    }

}