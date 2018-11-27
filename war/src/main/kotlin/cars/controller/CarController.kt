package cars.controller

import cars.dao.impl.CarDAOImpl
import cars.dao.manager.CarDAO
import cars.entity.Car
import javax.ejb.EJB
import javax.enterprise.inject.Model
import javax.inject.Inject

@Model
class CarController {

    @Inject
    private lateinit var carDAO: CarDAO

    private lateinit var id: String
    private lateinit var name: String
    private lateinit var brand: String
    private lateinit var color: String
    private lateinit var nbPorte: String
    private lateinit var price: String

    fun addCar() {
        val car = Car(id, name, brand, color, nbPorte, price)
        carDAO.addCar(car)
        resetValue()
    }

    private fun resetValue() {
        id = ""
        name = ""
        brand = ""
        color = ""
        nbPorte = ""
        price = ""
    }
}