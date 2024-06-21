package de.locke.food.ordering.system.domain.valueobject

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

class Money(
    private val amount: BigDecimal
) {
    val isGreaterThanZero: Boolean
        get() = amount > BigDecimal.ZERO

    fun isGreaterThan(money: Money): Boolean {
        return amount > money.amount
    }

    fun add(money: Money): Money {
        return Money(setScale(amount.add(money.amount)))
    }

    fun subtract(money: Money): Money {
        return Money(setScale(amount.subtract(money.amount)))
    }

    fun multiply(multiplier: Int): Money {
        return Money(setScale(amount.multiply(BigDecimal(multiplier))))
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val money = other as Money
        return amount == money.amount
    }

    override fun hashCode(): Int {
        return Objects.hash(amount)
    }

    private fun setScale(input: BigDecimal): BigDecimal {
        return input.setScale(2, RoundingMode.HALF_EVEN)
    }

    companion object {
        val ZERO: Money = Money(BigDecimal.ZERO)
    }
}
