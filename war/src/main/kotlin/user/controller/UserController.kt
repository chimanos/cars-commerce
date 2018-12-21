package user.controller

import basket.dao.manager.BasketDAO
import order.dao.manager.OrderDAO
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

    init {
        resetValue()
    }

    private fun resetValue() {
        pseudo = ""
        firstName = ""
        lastName = ""
        email = ""
        password = ""
    }
}