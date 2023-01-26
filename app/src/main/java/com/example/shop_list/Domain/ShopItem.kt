package com.example.shop_list.Domain

data class ShopItem(
    val name: String,
    val count: Int,
    val isActive: Boolean,
    var id: Int = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = -1
    }
}