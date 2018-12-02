package cars.dao.manager

import cars.entity.Car
import javax.ejb.Local
import javax.ejb.LocalBean
import javax.ejb.Remote
import javax.ejb.Stateless

@LocalBean
interface CarDAO {
    //fun getCars(): List<Car>
    //fun getCar(id: String)
    fun addCar(car: Car)
}