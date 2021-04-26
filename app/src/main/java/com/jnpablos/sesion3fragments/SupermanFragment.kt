package com.jnpablos.sesion3fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jnpablos.sesion3fragments.databinding.FragmentSupermanBinding

class SupermanFragment : Fragment() {

    private lateinit var supermanBinding: FragmentSupermanBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        supermanBinding = FragmentSupermanBinding.inflate(inflater, container, false)

        supermanBinding.nextButton.setOnClickListener {

            findNavController().navigate(R.id.action_supermanFragment_to_wonderWomanFragment)
        }
        return supermanBinding.root
    }
}