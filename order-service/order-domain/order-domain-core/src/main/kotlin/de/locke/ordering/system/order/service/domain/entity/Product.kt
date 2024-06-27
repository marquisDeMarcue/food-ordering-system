package de.locke.ordering.system.de.locke.ordering.system.order.service.domain.entity

import de.locke.food.ordering.system.domain.entity.BaseEntity
import de.locke.food.ordering.system.domain.valueobject.Money
import de.locke.food.ordering.system.domain.valueobject.ProductId

class Product(
    productId: ProductId,
    private var name: String,
    private var price: Money,
) : BaseEntity<ProductId>(productId) {

    fun updateWithConfirmedNameAndPrice(name: String, price: Money) {
        this.name = name
        this.price = price
    }
}