package cars.dao.impl

import cars.dao.manager.CarDAO
import cars.entity.Car
import cars.entity.CarType
import javax.ejb.Stateless
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.transaction.Transactional

@Stateless
@Transactional
open class CarDAOImpl : CarDAO {

    @PersistenceContext(unitName="persistenceUnit")
    private lateinit var entityManager: EntityManager

    override fun getCars(): List<Car> {
        val query = entityManager.createQuery("SELECT car FROM Car car ORDER BY id")
        return query.resultList as List<Car>
    }

    override fun getCarsByType(type: String): List<Car> {
        val query = entityManager.createQuery("SELECT car FROM Car car WHERE carType = '${type}' ORDER BY id")
        return query.resultList as List<Car>
    }

    override fun getCarById(id: Int) = entityManager.find(Car::class.java, id)

    override fun getCarByName(name: String) = entityManager.find(Car::class.java, name)

    override fun addCar(car: Car) = entityManager.persist(car)
}