package com.example.yizeapp118

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.yizeapp118.entity.LayoutEntity

class MainAdapter(private val arrayList: ArrayList<LayoutEntity>) : BaseQuickAdapter<LayoutEntity, BaseViewHolder>(R.layout.home_item_view,arrayList) {
    /**
     * 如果后期设置数据，不需要传入初始List，直接调用 super(layoutResId)即可
     */

    /**
     * 在此方法中设置item数据
     */
   override fun convert(helper: BaseViewHolder, item: LayoutEntity) {
        helper.setText(
            R.id.text_view,
            item.name
        )
       helper.setImageResource(
           R.id.icon,
           item.imageResource
       )
    }

}