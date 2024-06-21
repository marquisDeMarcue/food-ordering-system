package de.locke.food.ordering.system.domain.valueobject

import java.util.*


abstract class BaseId<T> protected constructor(
    private val value: T
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val baseId: BaseId<*> =
            other as BaseId<*>
        return value == baseId.value
    }

    override fun hashCode(): Int {
        return Objects.hash(value)
    }
}