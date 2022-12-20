package com.cacttuseducation.passingdatafragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cacttuseducation.passingdatafragments.R
import com.cacttuseducation.passingdatafragments.databinding.FragmentHomeDetailsBinding


class HomeDetailsFragment : Fragment() {
    private lateinit var binding : FragmentHomeDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeDetailsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }


}