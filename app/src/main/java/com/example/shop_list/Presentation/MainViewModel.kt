package com.example.shop_list.Presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shop_list.Data.ShopListImpl
import com.example.shop_list.Domain.DeleteShopItemUseCase
import com.example.shop_list.Domain.EditShopItemUseCase
import com.example.shop_list.Domain.GetShopItemListUseCase
import com.example.shop_list.Domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository = ShopListImpl

    private val getShopList = GetShopItemListUseCase(repository)
    private val deleteShopItem = DeleteShopItemUseCase(repository)
    private val editShopItem = EditShopItemUseCase(repository)

    val shopList = getShopList.getShopItemList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItem.deleteShopItem(shopItem)
    }

    fun editShopItem(shopItem: ShopItem) {
        val newItem = shopItem.copy(isActive = !shopItem.isActive)
        editShopItem.editShopItem(newItem)
    }

}