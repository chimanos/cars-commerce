package order.dao.manager

import order.entity.Order
import javax.ejb.LocalBean

@LocalBean
interface OrderDAO {
    fun addOrder(order: Order)
    fun getOrdersOfUser(userId: Int): List<Order>
}