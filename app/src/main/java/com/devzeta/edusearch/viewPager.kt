package com.devzeta.edusearch

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter

class PagerViewAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment? {
        return when (position) {
            0 -> {
                googlesearch()
            }
            1 -> {
                wikipedia()
            }
            2 -> {
                youtube()
            }
            3 -> {
                googlescholor()
            }
            4 -> {
                khanacademy()
            }
            5 ->{
                quora()
            }

            else -> null
        }
    }

    override fun getCount(): Int {

        return 6
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "Google Search"
            1 -> return "Wikipedia"
            2 -> return "Youtube"
            3 -> return "Google Scholor"
            4 -> return "Khan Academy"
            5 -> return "Quora"

        }
        return null
    }

    operator fun invoke(supportFragmentManager: FragmentManager?): PagerAdapter? {
       return null
    }

}