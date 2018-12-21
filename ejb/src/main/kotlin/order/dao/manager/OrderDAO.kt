package order.dao.manager

import order.entity.Orders
import javax.ejb.LocalBean

@LocalBean
interface OrderDAO {
    fun addOrder(order: Orders)
    fun getOrdersOfUser(userId: Int): List<Orders>
}