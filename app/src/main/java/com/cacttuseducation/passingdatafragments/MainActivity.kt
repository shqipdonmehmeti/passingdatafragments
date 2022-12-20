package com.cacttuseducation.passingdatafragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.cacttuseducation.passingdatafragments.databinding.ActivityMainBinding
import com.cacttuseducation.passingdatafragments.fragments.ExploreFragment
import com.cacttuseducation.passingdatafragments.fragments.HomeFragment
import com.cacttuseducation.passingdatafragments.fragments.ProfileFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun onBottomNavigationClickHandler() {
        val homeFragment = HomeFragment()
        val exploreFragment = ExploreFragment()
        val profileFragment = ProfileFragment()

        binding.bottomNavigation.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId) {
                R.id.homeMenuId -> setCurrentFragment(homeFragment)
                R.id.exploreMenuId -> setCurrentFragment(exploreFragment)
                R.id.profileMenuId -> setCurrentFragment(profileFragment)
            }
            true

        }
    }

    private fun setCurrentFragment(currentFragment : Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer,currentFragment)
            addToBackStack(null)
            commit()
        }
    }
}