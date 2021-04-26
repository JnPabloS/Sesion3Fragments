package com.jnpablos.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jnpablos.bottomnavigation.databinding.FragmentWonderWomanBinding

class WonderWomanFragment : Fragment() {

    private lateinit var wonderWomanBinding : FragmentWonderWomanBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        wonderWomanBinding = FragmentWonderWomanBinding.inflate(inflater, container, false)

        /*wonderWomanBinding.nextButton.setOnClickListener {

            findNavController().navigate(R.id.action_wonderWomanFragment_to_flashFragment)
        }*/

        return wonderWomanBinding.root
    }
}