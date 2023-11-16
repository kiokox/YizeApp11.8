package com.example.yizeapp118.activity.tab

import android.os.Bundle
import com.example.yizeapp118.R
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.yizeapp118.entity.PicEntity
import com.google.android.material.tabs.TabLayout

/**
 * 这个样例展示了多少页
 */
private const val NUM_PAGES = 5

class TabActivity : FragmentActivity() {

    /**
     * 页的窗口，处理动画并允许横向滑动来接近最近和下一步
     */
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_slide)

        // Instantiate a ViewPager2 and a PagerAdapter.
        viewPager = findViewById(R.id.pager)
        // tabLayout = findViewById(R.id.tab_layout)

        // The pager adapter, which provides the pages to the view pager widget.
        val pagerAdapter = ScreenSlidePagerAdapter(this)
        viewPager.adapter = pagerAdapter

        /*val pagerAdapter = TabViewPagerAdapter(arrayList)
        viewPager.adapter = pagerAdapter*/
    }

    override fun onBackPressed() {
        if (viewPager.currentItem == 0) {
            // 如果用户此时正在看第一页，允许系统处理返回按钮。这个调用这个activity的finish()并弹出返回栈
            super.onBackPressed()
        } else {
            // 反之，则选择上一步
            viewPager.currentItem = viewPager.currentItem - 1
        }
    }

    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private inner class ScreenSlidePagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
        override fun getItemCount(): Int = NUM_PAGES

        override fun createFragment(position: Int): Fragment = TabFragment()
    }

/*    private inner class TabViewPagerAdapter(private val arrayList: ArrayList<PicEntity>):
        BaseQuickAdapter<PicEntity, BaseViewHolder>(R.layout.fragment_screen_slide_page, arrayList){
        override fun convert(holder: BaseViewHolder, item: PicEntity) {
            holder.setImageResource(R.id.iv_fragment_screen, item.imageResource)
        }

    }*/

    private var arrayList = ArrayList<PicEntity>()
        get() = arrayListOf(
            PicEntity("1",R.mipmap.ani01),
            PicEntity("2",R.mipmap.ani02),
            PicEntity("3",R.mipmap.ani03),
            PicEntity("4",R.mipmap.ani04),
        )
}