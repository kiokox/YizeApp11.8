package com.example.yizeapp118

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

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

        val mRecyclerView : RecyclerView = findViewById(R.id.recycler_view)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.setAdapter(demoAdapter)

    }
}
