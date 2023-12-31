package com.example.yizeapp118.activity.masonry

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.yizeapp118.R
import com.example.yizeapp118.entity.CardEntity

/**
 * @Author : Quzx
 * @Time : 2023/11/9 13:46
 */
class MasonryActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masonry)

        val mRecyclerView : RecyclerView = findViewById(R.id.recycler_masonry)
        // 创建了一个StaggerGridLayoutManager实例，接收两个参数(一个指定布局的列数，一个指定布局的排列方向)
        // 创建好的LayoutManager实例设置到recyclerView中
        mRecyclerView.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        // 创建一个adapter实例，创建好的Adapter实例设置到recyclerView中
        val masonryAdapter = MasonryAdapter(cardItemData)
        mRecyclerView.adapter = masonryAdapter
    }

    private val cardItemData: ArrayList<CardEntity>
        get() = arrayListOf(
            CardEntity("蝙蝠",R.mipmap.icon_bat,1,1,1),
            CardEntity("熊",R.mipmap.icon_bear,1,1,2),
            CardEntity("海豹",R.mipmap.icon_seal,16,9,0),
            CardEntity("蜜蜂",R.mipmap.icon_bee,1,1,1),
            CardEntity("鸟",R.mipmap.icon_bird,1,1,2),
            CardEntity("鹦鹉",R.mipmap.icon_parrot,1,1,0),
            CardEntity("长颈鹿",R.mipmap.icon_giraffe,1,1,1),
            CardEntity("猫",R.mipmap.icon_cat,1,1,2),
            CardEntity("猫头鹰",R.mipmap.icon_owl,1,1,0),
            CardEntity("浣熊",R.mipmap.icon_raccoon,1,1,1),
        )
}