package com.example.shop_list.Domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItemList(): LiveData<List<ShopItem>>

    fun getShopItem(shopItemId: Int): ShopItem

    fun insertShopItem(shopItem: ShopItem)

}