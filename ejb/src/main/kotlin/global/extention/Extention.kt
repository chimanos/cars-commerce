package global.extention

import basket.entity.Basket
import order.entity.Orders

fun Basket.toOrders(): Orders = Orders(null, this.userId, this.carId, this.stock)