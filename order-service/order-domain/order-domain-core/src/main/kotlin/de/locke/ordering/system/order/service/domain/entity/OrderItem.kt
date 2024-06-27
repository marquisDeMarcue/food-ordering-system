package de.locke.ordering.system.de.locke.ordering.system.order.service.domain.entity

import de.locke.food.ordering.system.domain.entity.BaseEntity
import de.locke.food.ordering.system.domain.valueobject.Money
import de.locke.food.ordering.system.domain.valueobject.OrderId
import de.locke.ordering.system.de.locke.ordering.system.order.service.domain.valueobject.OrderItemId

class OrderItem(
    val orderId: OrderId,
    val product: Product,
    val quantity: Int,
    val price: Money,
    val subTotal: Money
) : BaseEntity<OrderItemId>(OrderItemId(0L)) {

}