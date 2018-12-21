package basket.dao.manager

import basket.entity.Basket
import cars.entity.Car
import order.entity.Orders
import user.entity.Users
import javax.ejb.LocalBean

@LocalBean
interface BasketDAO {
    fun addBasket(basket: Basket)
    fun getUserBasket(userId: Int): Basket?
    fun basketToOrder(basket: Basket): Orders
    fun addToBasket(car: Car, user: Users, qtt: Int)
}