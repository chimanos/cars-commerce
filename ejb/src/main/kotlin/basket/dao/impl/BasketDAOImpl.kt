package basket.dao.impl

import basket.dao.manager.BasketDAO
import basket.entity.Basket
import cars.entity.Car
import global.extention.toOrders
import user.entity.Users
import javax.ejb.Stateless
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.transaction.Transactional

@Stateless
@Transactional
open class BasketDAOImpl: BasketDAO {

    @PersistenceContext(unitName="persistenceUnit")
    private lateinit var entityManager: EntityManager

    override fun addBasket(basket: Basket) {
        entityManager.persist(basket)
    }

    override fun getUserBasket(userId: Int): Basket? {
        val query = entityManager.createQuery("SELECT basket FROM Basket basket WHERE userId = $userId")

        if(query.resultList.size == 1) {
            return query.resultList[0] as Basket
        }
        return null
    }

    override fun basketToOrder(basket: Basket) = basket.toOrders()

    override fun addToBasket(car: Car, user: Users, qtt: Int) {
        val basket = Basket(user.id, user.id, car.id, qtt)
        entityManager.persist(basket)
    }
}