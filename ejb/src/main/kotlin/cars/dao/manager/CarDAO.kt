package cars.dao.manager

import cars.entity.Car
import javax.ejb.LocalBean


@LocalBean
interface CarDAO {
    fun getCars(): List<Car>
    fun getCar(id: String): Car
    fun addCar(car: Car)
}