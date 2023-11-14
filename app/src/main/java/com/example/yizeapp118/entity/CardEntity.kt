package com.example.yizeapp118.entity

import com.chad.library.adapter.base.entity.MultiItemEntity

/**
 * @Author : Quzx
 * @Time : 2023/11/10 13:19
 */
class CardEntity (
    val title: String,
    val imageResource: Int = 0,
    val width: Int,
    val height: Int, override val itemType: Int
) : MultiItemEntity