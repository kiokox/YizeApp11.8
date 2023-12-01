package com.example.yizeapp118.activity.tab

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.yizeapp118.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

const val ARG_OBJECT = "object"
class TabActivity : FragmentActivity() {
    // When requested, this adapter returns a DemoObjectFragment,
    // representing an object in the collection.
    private lateinit var tabCollectionAdapter: TabCollectionAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)

        tabCollectionAdapter = TabCollectionAdapter(this)
        var viewPager = findViewById<ViewPager2>(R.id.pager_tab)
        viewPager.adapter = tabCollectionAdapter

        val tabLayout = findViewById<TabLayout>(R.id.tab_tab)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = "第 ${(position + 1)} 页"
        }.attach()
    }

}

class TabCollectionAdapter(activity: TabActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 12

    override fun createFragment(position: Int): Fragment {
        // Return a NEW fragment instance in createFragment(int)
        val fragment = TabFragment()
        fragment.arguments = Bundle().apply {
            // Our object is just an integer :-P
            putInt(ARG_OBJECT, position + 1)
        }
        return fragment
    }

}
