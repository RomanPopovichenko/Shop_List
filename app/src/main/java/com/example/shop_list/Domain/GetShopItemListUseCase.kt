package com.example.shop_list.Domain

class GetShopItemListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItemList(): List<ShopItem> {
        return shopListRepository.getShopItemList()
    }

}