package com.example.yizeapp118

import android.view.LayoutInflater
import android.view.ViewGroup
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder

class DemoAdapter(private val arrayList: ArrayList<String>) : BaseQuickAdapter<String, BaseViewHolder>(R.layout.home_item_view,arrayList) {
    /**
     * 如果后期设置数据，不需要传入初始List，直接调用 super(layoutResId)即可
     */

    /**
     * 在此方法中设置item数据
     */
    override fun convert(helper: BaseViewHolder, item: String) {
        helper.setText(
            R.id.text_view,
            // (helper.adapterPosition - headerLayoutCount)
            item
        )
    }

    // 创建新的view(调用layout管理器)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): BaseViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.home_item_view, viewGroup, false)

        return BaseViewHolder(view)
    }

    override fun getItemCount() = arrayList.size
}