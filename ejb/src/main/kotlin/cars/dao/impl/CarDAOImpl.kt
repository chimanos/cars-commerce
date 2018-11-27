package cars.dao.impl

import cars.dao.manager.CarDAO
import cars.entity.Car
import javax.ejb.LocalBean
import javax.ejb.Stateless
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Stateless
class CarDAOImpl : CarDAO {

    @PersistenceContext(unitName = "mongo-ogm")
    private lateinit var entityManager: EntityManager

    override fun addCar(car: Car) {
        entityManager.persist(car)
    }

    /*override fun getCars(): List<Car> {
        return ArrayList
    }

    override fun getCar(id: String) {

    }*/
}