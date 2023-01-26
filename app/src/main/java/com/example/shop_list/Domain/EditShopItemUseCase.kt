package com.example.shop_list.Domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository)  {

    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }

}