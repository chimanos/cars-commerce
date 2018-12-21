package order.dao.impl

import basket.entity.Basket
import order.dao.manager.OrderDAO
import order.entity.Orders
import javax.ejb.Stateless
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.transaction.Transactional

@Stateless
@Transactional
open class OrderDAOImpl : OrderDAO {

    @PersistenceContext(unitName="persistenceUnit")
    private lateinit var entityManager: EntityManager

    override fun addOrder(order: Orders) {
        entityManager.persist(order)
    }

    override fun getOrdersOfUser(userId: Int): List<Orders> {
        val query = entityManager.createQuery("SELECT orders FROM Orders orders WHERE userId = $userId")

        return query.resultList as List<Orders>
    }
}