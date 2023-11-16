package com.example.yizeapp118.activity.tab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yizeapp118.R

class TabFragment : Fragment() {

/*    override fun onStart() {
        super.onStart()
        var label = arguments?.getString("lable")
        var text = view?.findViewById<TextView>(R.id.tv_bg)
        text?.text = label
        text?.setBackgroundColor(0x4796cf)
    }*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_screen_slide_page, container, false)
    }

/*    internal object Util {
        fun newInstance(lable: String) {
            var args = Bundle()
            args.putString("lable", lable)
            var fragment: Fragment = ScreenSlidePageFragment()
            fragment.arguments = args

        }
    }*/

}