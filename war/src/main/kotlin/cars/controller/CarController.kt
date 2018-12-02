package cars.controller

import cars.dao.impl.CarDAOImpl
import cars.dao.manager.CarDAO
import cars.entity.Car
import javax.ejb.EJB
import javax.enterprise.context.Dependent
import javax.enterprise.inject.Model
import javax.inject.Inject

@Model
@Dependent
class CarController {

    @Inject
    private lateinit var carDAO: CarDAO

    lateinit var name: String
    lateinit var brand: String
    lateinit var color: String
    lateinit var nbPorte: String
    lateinit var price: String

    init {
        //resetValue()
    }

    fun addCar() {
        val car = Car(null, name, brand, color, nbPorte, price)
        carDAO.addCar(car)
        resetValue()
    }

    private fun resetValue() {
        name = ""
        brand = ""
        color = ""
        nbPorte = ""
        price = ""
    }
}