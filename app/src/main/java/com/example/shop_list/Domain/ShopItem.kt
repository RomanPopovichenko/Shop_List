package com.example.shop_list.Domain

data class ShopItem(
    val id: Int,
    val name: String,
    val count: Int,
    val isActive: Boolean
)