package com.example.shop_list.Domain

interface ShopListRepository {

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItemList(): List<ShopItem>

    fun getShopItem(shopItemId: Int): ShopItem

    fun insertShopItem(shopItem: ShopItem)

}