package order

import order.dao.manager.OrderDAO
import user.dao.manager.UserDAO
import javax.enterprise.context.Dependent
import javax.enterprise.inject.Model
import javax.inject.Inject

@Model
@Dependent
class OrderController {

    @Inject
    private lateinit var orderDAO: OrderDAO
}