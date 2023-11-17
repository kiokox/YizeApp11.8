package com.example.yizeapp118.activity.multiItem

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yizeapp118.R
import com.example.yizeapp118.entity.CardEntity

class MultiItemActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiitem)

        val mRecyclerView : RecyclerView = findViewById(R.id.recycler_multiItem)
        mRecyclerView.layoutManager = LinearLayoutManager(this)

        val multipleItemAdapter = MultipleItemAdapter(cardItemData)
        mRecyclerView.adapter = multipleItemAdapter
//        multipleItemAdapter.setList(cardItemData)

    }
    private val cardItemData: ArrayList<CardEntity>
        get() = arrayListOf(
            CardEntity("蝙蝠",R.mipmap.icon_bat,200,200,1),
            CardEntity("熊",R.mipmap.icon_bear,200,200,2),
            CardEntity("海豹",R.mipmap.icon_seal,170,60,0),
            CardEntity("蜜蜂",R.mipmap.icon_bee,200,200,1),
            CardEntity("鸟",R.mipmap.icon_bird,200,200,2),
            CardEntity("鹦鹉",R.mipmap.icon_parrot,200,200,0),
            CardEntity("长颈鹿",R.mipmap.icon_giraffe,200,200,1),
            CardEntity("猫",R.mipmap.icon_cat,200,200,2),
            CardEntity("猫头鹰",R.mipmap.icon_owl,200,200,0),
            CardEntity("浣熊",R.mipmap.icon_raccoon,200,200,1),
        )

}