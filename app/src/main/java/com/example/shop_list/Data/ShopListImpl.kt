package com.example.shop_list.Data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.shop_list.Domain.ShopItem
import com.example.shop_list.Domain.ShopListRepository
import java.util.TreeSet

object ShopListImpl : ShopListRepository {

    private val shopListLD = MutableLiveData<List<ShopItem>>()

    private val shopList = TreeSet<ShopItem> { p0, p1 -> p0.id.compareTo(p1.id) }
    private var autoIncrementId = 0

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
        update()
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldElement = getShopItem(shopItem.id)
        shopList.remove(oldElement)
        insertShopItem(shopItem)
    }

    override fun getShopItemList(): LiveData<List<ShopItem>> {
        return shopListLD
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
       return shopList.find {it.id == shopItemId} ?: throw RuntimeException("Element was not found")
    }

    override fun insertShopItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
        update()
    }

    fun update() {
        shopListLD.value = shopList.toList()
    }

}