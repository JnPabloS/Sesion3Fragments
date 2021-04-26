package com.jnpablos.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jnpablos.bottomnavigation.databinding.FragmentFlashBinding

class FlashFragment : Fragment() {

    private lateinit var flashBinding: FragmentFlashBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        flashBinding = FragmentFlashBinding.inflate(inflater, container, false)

        /*flashBinding.nextButton.setOnClickListener {

            findNavController().navigate(R.id.action_flashFragment_to_batmanFragment)
        }*/

        return flashBinding.root
    }
}