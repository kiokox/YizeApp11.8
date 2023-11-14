package com.example.yizeapp118.activity.multiItem

import android.media.Image
import android.widget.ImageView
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.yizeapp118.R
import com.example.yizeapp118.entity.CardEntity

enum class ItemType(var num: Int){
    TEXT(0),
    IMG(1),
    IMG_TEXT(2)
}
/**
 * @Author : Quzx
 * @Time : 2023/11/13 13:55
 */
class MultipleItemAdapter(cardItemData: ArrayList<CardEntity>) : BaseMultiItemQuickAdapter<CardEntity, BaseViewHolder>(cardItemData) {

    init {
        addItemType(ItemType.TEXT.num, R.layout.item_text_view)
        addItemType(ItemType.IMG.num, R.layout.item_img_view)
        addItemType(ItemType.IMG_TEXT.num, R.layout.item_img_text_view)
    }


    override fun convert(helper: BaseViewHolder, item: CardEntity ) {
        when(helper.itemViewType){
            0 -> helper.setText(R.id.txt_text,"“" + item.title + "”" + "图片正在审核中")

            1 -> { helper.setImageResource(R.id.img_image,item.imageResource)
                val imageView_img = helper.getView<ImageView>(R.id.img_image)
                imageView_img.layoutParams = imageView_img.layoutParams.apply {
                    height = 1000 * item.height / item.width
                }
            }

            2 -> { helper.setText(R.id.txt_imgText,item.title)
                .setImageResource(R.id.img_imgText,item.imageResource)
                val imageView = helper.getView<ImageView>(R.id.img_imgText)
                imageView.layoutParams = imageView.layoutParams.apply {
                    height = 1000 * item.height / item.width
                }}

        }

    }


}