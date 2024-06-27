package de.locke.ordering.system.de.locke.ordering.system.order.service.domain.valueobject

import de.locke.food.ordering.system.domain.valueobject.BaseId
import java.util.*

class TrackingId(
    trackingId: UUID
) : BaseId<UUID>(trackingId)
