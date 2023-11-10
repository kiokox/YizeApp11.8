package com.example.yizeapp118

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.yizeapp118.databinding.HomeItemViewBinding
import com.example.yizeapp118.entity.LayoutEntity

class MainAdapter(private val arrayList: ArrayList<LayoutEntity>) : BaseQuickAdapter<LayoutEntity, BaseViewHolder>(R.layout.home_item_view,arrayList) {
    /**
     * 如果后期设置数据，不需要传入初始List，直接调用 super(layoutResId)即可
     */

    /**
     * 在此方法中设置item数据
     */
    class ItemVH(val viewBinding: HomeItemViewBinding) : RecyclerView.ViewHolder(viewBinding.root)

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

    // 创建新的view(调用layout管理器)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): BaseViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.home_item_view, viewGroup, false)

        return BaseViewHolder(view)
    }

    override fun getItemCount() = arrayList.size
}