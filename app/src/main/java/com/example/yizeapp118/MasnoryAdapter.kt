package com.example.yizeapp118

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.yizeapp118.entity.CardEntity

class MasonryAdapter(private val arrayList: ArrayList<CardEntity>) : BaseQuickAdapter<CardEntity, BaseViewHolder>(R.layout.masonry_item_view,arrayList) {
    /**
     * 如果后期设置数据，不需要传入初始List，直接调用 super(layoutResId)即可
     */

    /**
     * 在此方法中设置item数据
     */
    override fun convert(helper: BaseViewHolder, item: CardEntity) {
        helper.setText(
            R.id.card_title,
            item.title
        )

        helper.setImageResource(
            R.id.card_image,
            item.imageResource
        )
    }



    override fun getItemCount() = arrayList.size
}