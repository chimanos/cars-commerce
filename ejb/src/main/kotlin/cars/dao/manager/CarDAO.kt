package cars.dao.manager

import cars.entity.Car
import cars.entity.CarType
import javax.ejb.LocalBean

@LocalBean
interface CarDAO {
    fun getCars(): List<Car>
    fun getCarsByType(type: String): List<Car>
    fun getCarById(id: Int): Car
    fun getCarByName(name: String): Car
    fun addCar(car: Car)
}