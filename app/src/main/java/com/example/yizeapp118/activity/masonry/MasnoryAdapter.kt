package com.example.yizeapp118.activity.masonry

import android.widget.ImageView
import android.widget.LinearLayout
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.yizeapp118.R
import com.example.yizeapp118.entity.CardEntity

class MasonryAdapter(private val arrayList: ArrayList<CardEntity>) : BaseQuickAdapter<CardEntity, BaseViewHolder>(
    R.layout.masonry_item_view,arrayList) {
    /**
     * 如果后期设置数据，不需要传入初始List，直接调用 super(layoutResId)即可
     */

    /**
     * 在此方法中设置item数据
     */
    override fun convert(helper: BaseViewHolder, item: CardEntity) {
        helper.setText(R.id.card_title, item.title)
            .setImageResource(R.id.card_image, item.imageResource)

        val imageView = helper.getView<ImageView>(R.id.card_image)
        imageView.layoutParams = imageView.layoutParams.apply {
//            height = 200 * (helper.layoutPosition %4 +1)
            height = 500 * item.height / item.width
        }

//        val llContainer = helper.getView<LinearLayout>(R.id.ll_container)
//        llContainer.layoutParams = llContainer.layoutParams.apply {
//            height = item.height * 1024 / item.width
//        }


    }



    override fun getItemCount() = arrayList.size
}