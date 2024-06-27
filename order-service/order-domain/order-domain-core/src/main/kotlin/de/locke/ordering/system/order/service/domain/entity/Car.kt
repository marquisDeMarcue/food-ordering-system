package de.locke.ordering.system.de.locke.ordering.system.order.service.domain.entity

import java.util.*


//abstract class BaseEntity<ID>(
//    val id: ID
//) {
//
////    override fun equals(other: Any?) ...
////    override fun hashCode() ...return Objects.hash(id)
//
//}
//
//abstract class AggregateRoot<ID>(
//    id: ID
//) : BaseEntity<ID>(id) {
//
//    val rootId = super.id
//}
//
//abstract class BaseId<T> protected constructor(
//    val value: T
//) {
////    override fun equals(other: Any?)...
////    override fun hashCode() ....
//}
//
//class CarId(
//    value: UUID
//) : BaseId<UUID>(value)
//
//class Car(
//    private val typ: String,
//) : AggregateRoot<CarId>(CarId(UUID.randomUUID())) {
//
//    val carID: CarId = super.rootId
//
//    fun getTyp(): String {
//        return "Model: $typ"
//    }
//
//}
//
//fun main() {
//
//    val car = Car("BMW")
//    println(car.getTyp())
//    println(car.carID.value)
//
//}

abstract class BaseEntity<ID>(
    val id: ID
) {
    //    override fun equals(other: Any?)...
    //    override fun hashCode() ...
}

abstract class AggregateRoot<ID>(
    id: ID
) : BaseEntity<ID>(id)

abstract class BaseId<T> protected constructor(
    val value: T
) {
    //    override fun equals(other: Any?)...
    //    override fun hashCode() ....
}

class CarId(
    value: UUID
) : BaseId<UUID>(value)

class Car(
    id: CarId = CarId(UUID.randomUUID()),
    private val typ: String,
    private var km: Int,
) : AggregateRoot<CarId>(id) {


    fun drive(km: Int){
         this.km = this.km + km
    }

    val model: String
        get() = "Model: $typ"
}

fun main() {
    val car = Car("BMW", 0



    println(car.model)
    println(car.id.value)
}
