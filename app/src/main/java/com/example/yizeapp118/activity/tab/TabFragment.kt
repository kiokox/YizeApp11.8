package com.example.yizeapp118.activity.tab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.yizeapp118.R

// Instances of this class are fragments representing a single
// object in our collection.
class TabFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_tab, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            val imageView: ImageView = view.findViewById(R.id.img_ani)
            imageView.setImageResource(arrayList[getInt(ARG_OBJECT) - 1 ])
        }
    }

    private var arrayList : ArrayList<Int> = arrayListOf(
        R.mipmap.ani01,
        R.mipmap.ani02,
        R.mipmap.ani03,
        R.mipmap.ani04,
        R.mipmap.ani05,
        R.mipmap.ani06,
        R.mipmap.ani07,
        R.mipmap.ani08,
        R.mipmap.ani09,
        R.mipmap.ani10,
        R.mipmap.ani11,
        R.mipmap.ani12
    )
}