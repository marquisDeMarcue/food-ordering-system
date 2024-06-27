package de.locke.ordering.system.de.locke.ordering.system.order.service.domain.entity

import de.locke.food.ordering.system.domain.entity.AggregateRoot
import de.locke.food.ordering.system.domain.valueobject.*
import de.locke.food.ordering.system.domain.valueobject.OrderStatus.PRENDING
import de.locke.ordering.system.de.locke.ordering.system.order.service.domain.valueobject.StreetAddress
import de.locke.ordering.system.de.locke.ordering.system.order.service.domain.valueobject.TrackingId
import java.util.*


class Order(
    val customerId: CustomerId,
    val restaurantId: RestaurantId,
    val streetAddress: StreetAddress,
    val price: Money,
    val items: List<OrderItem>,
) : AggregateRoot<OrderId>(OrderId(UUID.randomUUID())) {

    val orderId: OrderId
        get() = super.id

    private var orderStatus: OrderStatus = PRENDING
    private var trackingId: TrackingId? = null
    private val failureMessages: MutableList<String> = mutableListOf()


//    companion object {
//        fun create(
//            customerId: CustomerId,
//            restaurantId: RestaurantId,
//            streetAddress: StreetAddress,
//            price: Money,
//            items: List<OrderItem>
//        ): Order {
//            return Order(
//                customerId = customerId,
//                restaurantId = restaurantId,
//                streetAddress = streetAddress,
//                price = price,
//                items = items
//
//            )
//        }
//    }


}

fun main() {
    println("Hello World!")


    val o = Order(
        CustomerId(UUID.randomUUID()),
        RestaurantId(UUID.randomUUID()),
        StreetAddress(UUID.randomUUID(), "city", "zip", "country"),
        Money(0.0.toBigDecimal()),
        listOf()
    )

    println(o.orderId)


}