package com.seventhelement.screenmirroring.OnBoardingScreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.seventhelement.screenmirroring.R



class FirstScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.first_screen_layout, container, false)

        val viewPager =  requireActivity().findViewById<ViewPager2>(R.id.viewPager)
           val next: TextView? =view.findViewById(R.id.next)
        next?.setOnClickListener {
            viewPager?.currentItem = 1
        }

        return view
    }

}