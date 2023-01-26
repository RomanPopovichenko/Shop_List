package com.example.shop_list.Domain

class InsertShopItemUseCase(private val shopListRepository: ShopListRepository)  {

    fun insertShopItem(shopItem: ShopItem) {
        shopListRepository.insertShopItem(shopItem)
    }

}