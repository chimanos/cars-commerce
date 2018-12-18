package cars.dao.impl

import cars.dao.manager.CarDAO
import cars.entity.Car
import javax.ejb.Stateless
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.transaction.Transactional

@Stateless
@Transactional
open class CarDAOImpl : CarDAO {

    @PersistenceContext(unitName="persistenceUnit")
    private lateinit var entityManager: EntityManager

    override fun addCar(car: Car) {
        entityManager.persist(car)
    }

//    override fun getCars(): List<Car> {
//
//    }
//
//    override fun getCar(id: String): Car {
//
//    }
}