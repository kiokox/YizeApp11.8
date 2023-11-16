package com.example.yizeapp118

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yizeapp118.activity.masonry.MasonryActivity
import com.example.yizeapp118.activity.multiItem.MultiItemActivity
import com.example.yizeapp118.activity.swipe.ScreenSlidePagerActivity
import com.example.yizeapp118.databinding.ActivityDemoBinding
import com.example.yizeapp118.entity.LayoutEntity

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityDemoBinding

    // RV适配器
    private val mainAdapter by lazy(LazyThreadSafetyMode.NONE) {
        MainAdapter(layoutItemData)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mRecyclerView : RecyclerView = findViewById(R.id.recycler_view)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = mainAdapter

        // item 点击事件
        mainAdapter.setOnItemClickListener { adapter, _, position ->
            val item = adapter.getItem(position) as LayoutEntity
            startActivity(Intent(this@MainActivity, item.activity))
        }
    }

    private val layoutItemData: ArrayList<LayoutEntity>
        get() = arrayListOf(
            LayoutEntity("瀑布流",MasonryActivity::class.java,R.mipmap.icon_masonry),
            LayoutEntity("多布局", MultiItemActivity::class.java,R.mipmap.icon_multi),
            LayoutEntity("联动", ScreenSlidePagerActivity::class.java,R.mipmap.icon_array)
        )
}
