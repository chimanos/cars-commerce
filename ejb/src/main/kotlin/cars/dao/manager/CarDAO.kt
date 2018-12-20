package cars.dao.manager

import cars.entity.Car
import cars.entity.CarType
import javax.ejb.LocalBean

@LocalBean
interface CarDAO {
    fun getCars(): ArrayList<Car>
    fun getCarsByType(type: String): ArrayList<Car>
    fun getCarById(id: Int): Car
    fun getCarByName(name: String): Car
    fun addCar(car: Car)
}