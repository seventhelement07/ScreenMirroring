package com.seventhelement.screenmirroring.OnBoardingScreens

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import com.seventhelement.screenmirroring.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_home, container, false)
        val button=view.findViewById<ImageButton>(R.id.btn_settings)
        button.setOnClickListener{
            openCastSettings()
        }
        return view
    }
    private fun openCastSettings() {
        val intent = Intent(Settings.ACTION_CAST_SETTINGS)
        startActivity(intent)
    }
}