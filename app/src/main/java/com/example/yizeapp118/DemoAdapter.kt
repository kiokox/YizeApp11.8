package com.example.yizeapp118

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
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
            "This is an Item, pos: " + (helper.adapterPosition - headerLayoutCount)
        )
    }

    /**
    * 提供对正在使用的视图类型的引用
    *（自定义 ViewHolder）。
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            // 给ViewHolder's 的View定义点击监听器
            textView = view.findViewById(R.id.text_view)
        }

    }

    // 创建新的view(调用layout管理器)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): BaseViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.home_item_view, viewGroup, false)

        return BaseViewHolder(view)
    }

/*    // 替代view的内容（调用layout管理器）
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        // 从你的数据集中获取这个位置的元素，并用这个元素取代view的内容
        viewHolder.textView.text = arrayList[position]
    }*/

    // 返回你的数据集的大小（调用layoutmanager）
    override fun getItemCount() = arrayList.size
}