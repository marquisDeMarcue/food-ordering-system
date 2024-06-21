package de.locke.food.ordering.system.domain.entity

import java.util.*


abstract class BaseEntity<ID>() {
    private var id: ID? = null

    fun getId(): ID? {
        return id
    }

    fun setId(id: ID) {
        this.id = id
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val that = other as BaseEntity<*>
        return id == that.id
    }

    override fun hashCode(): Int {
        return Objects.hash(id)
    }
}