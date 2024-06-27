package de.locke.ordering.system.de.locke.ordering.system.order.service.domain.valueobject

import java.util.*

class StreetAddress(
    val id: UUID,
    val street: String,
    val postalCode: String,
    val city: String,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StreetAddress) return false

        if (street != other.street) return false
        if (postalCode != other.postalCode) return false
        if (city != other.city) return false

        return true
    }

    override fun hashCode(): Int {
        var result = street.hashCode()
        result = 31 * result + postalCode.hashCode()
        result = 31 * result + city.hashCode()
        return result
    }
}