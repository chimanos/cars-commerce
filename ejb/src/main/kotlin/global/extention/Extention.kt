package global.extention

import basket.entity.Basket
import order.entity.Order

fun Basket.toOrder(): Order = Order(null, this.userId, this.carId, this.stock)