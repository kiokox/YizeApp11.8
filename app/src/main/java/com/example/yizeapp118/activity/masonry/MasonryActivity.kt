package com.example.yizeapp118.activity.masonry

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yizeapp118.DemoAdapter
import com.example.yizeapp118.R

/**
 * @Author : Quzx
 * @Time : 2023/11/9 13:46
 */
class MasonryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masonry)

        val dataset = ArrayList<String>()
        dataset.add("1")
        dataset.add("2")
        dataset.add("3")
        dataset.add("4")
        dataset.add("5")
        dataset.add("6")
        dataset.add("7")
        dataset.add("8")
        dataset.add("9")
        dataset.add("0")
        val demoAdapter = DemoAdapter(dataset)

        val mRecyclerView : RecyclerView = findViewById(R.id.recycler_masonry)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.setAdapter(demoAdapter)
    }
}