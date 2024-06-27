package de.locke.food.ordering.system.domain.entity

abstract class AggregateRoot<ID>(
    id: ID
) : BaseEntity<ID>(id){

    val id: ID
        get() = super.baseId
}
