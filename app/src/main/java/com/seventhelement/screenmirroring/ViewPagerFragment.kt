package com.seventhelement.screenmirroring

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.seventhelement.screenmirroring.Adapter.ViewPagerAdapter
import com.seventhelement.screenmirroring.OnBoardingScreens.FirstScreen
import com.seventhelement.screenmirroring.OnBoardingScreens.Secondcreen
import com.seventhelement.screenmirroring.OnBoardingScreens.ThirdScreen



/**
 * A simple [Fragment] subclass.
 * Use the [ViewPagerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ViewPagerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_view_pager,container,false)
        Toast.makeText(requireContext(),"Hello",Toast.LENGTH_SHORT).show()
        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            Secondcreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

    val viewpager: androidx.viewpager2.widget.ViewPager2? =view.findViewById(R.id.viewPager)
        viewpager?.adapter = adapter

        return view
    }

}