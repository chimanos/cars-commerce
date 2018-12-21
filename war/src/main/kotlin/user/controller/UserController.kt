package user.controller

import basket.dao.manager.BasketDAO
import cars.dao.manager.CarDAO
import order.dao.manager.OrderDAO
import order.entity.Orders
import user.dao.manager.UserDAO
import javax.enterprise.context.Dependent
import javax.enterprise.inject.Model
import javax.inject.Inject

@Model
@Dependent
class UserController {

    lateinit var pseudo: String
    lateinit var firstName: String
    lateinit var lastName: String
    lateinit var email: String
    lateinit var password: String

    @Inject
    private lateinit var userDAO: UserDAO

    @Inject
    private lateinit var orderDAO: OrderDAO

    @Inject
    private lateinit var basketDAO: BasketDAO

    @Inject
    private lateinit var carDAO: CarDAO

    init {
        resetValue()
    }

    private fun getOrdersHtml(userId: Int): String {
        var htmlResult = ""

        orderDAO.getOrdersOfUser(userId).forEach {
            htmlResult = htmlResult + getOrderHtml(it)
        }

        return htmlResult
    }

    private fun getOrderHtml(order: Orders): String {
        var car = carDAO.getCarById(order.carId)
        var price = car.price * order.stock

        return "<tr>" +
                "<td>${car.nameCar}</td>" +
                "<td>${order.stock}</td>" +
                "<td>${price}</td>" +
                "</tr>"
    }

    private fun getBasketHtml(userId: Int): String {
        var basket = basketDAO.getUserBasket(userId)
        var car = carDAO.getCarById(basket.carId)
        var price = basket.stock * car.price

        return "<tr>" +
                "<td>${car.nameCar}</td>" +
                "<td>${basket.stock}</td>" +
                "<td>${price}</td>" +
                "</tr>"

    }

    private fun resetValue() {
        pseudo = ""
        firstName = ""
        lastName = ""
        email = ""
        password = ""
    }
}