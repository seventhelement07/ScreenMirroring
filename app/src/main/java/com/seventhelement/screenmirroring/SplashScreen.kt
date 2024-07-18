package com.seventhelement.screenmirroring

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController

class SplashScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler().postDelayed({
        if(onBoardingFinished()){
            findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
        }else{
            findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)
        }
    }, 3000)

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_splash_screen, container, false)
    }

    private fun onBoardingFinished(): Boolean{
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished", false)
    }

}