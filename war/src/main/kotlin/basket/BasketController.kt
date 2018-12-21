package basket

import basket.dao.manager.BasketDAO
import user.dao.manager.UserDAO
import javax.enterprise.context.Dependent
import javax.enterprise.inject.Model
import javax.inject.Inject

@Model
@Dependent
class BasketController {

    @Inject
    private lateinit var basketDAO: BasketDAO
}