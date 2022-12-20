package com.cacttuseducation.passingdatafragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.cacttuseducation.passingdatafragments.databinding.ActivityMainBinding
import com.cacttuseducation.passingdatafragments.fragments.ExploreFragment
import com.cacttuseducation.passingdatafragments.fragments.HomeFragment
import com.cacttuseducation.passingdatafragments.fragments.ProfileFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var homeFragment : HomeFragment
    private lateinit var exploreFragment : ExploreFragment
    private lateinit var profileFragment: ProfileFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initFragments()
        setDefaultFragment(homeFragment)
        onBottomNavigationClickHandler()
    }

    private fun initFragments() {
         homeFragment = HomeFragment()
         exploreFragment = ExploreFragment()
         profileFragment = ProfileFragment()
    }

    private fun onBottomNavigationClickHandler() {


        binding.bottomNavigation.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.homeMenuId -> setCurrentFragment(homeFragment)
                R.id.exploreMenuId -> setCurrentFragment(exploreFragment)
                R.id.profileMenuId -> setCurrentFragment(profileFragment)
            }
            true

        }
    }

    private fun setCurrentFragment(currentFragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, currentFragment)
            addToBackStack(null)
            commit()
        }
    }

    private fun setDefaultFragment(currentFragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, currentFragment)
            commit()
        }
    }
}