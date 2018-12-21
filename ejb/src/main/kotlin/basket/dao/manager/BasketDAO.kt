package basket.dao.manager

import basket.entity.Basket
import order.entity.Orders
import javax.ejb.LocalBean

@LocalBean
interface BasketDAO {
    fun addBasket(basket: Basket)
    fun getUserBasket(userId: Int): Basket?
    fun basketToOrder(basket: Basket): Orders
}