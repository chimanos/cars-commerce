package cars.controller

import cars.dao.impl.CarDAOImpl
import cars.dao.manager.CarDAO
import cars.entity.Car
import cars.entity.CarType
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
    lateinit var description: String
    lateinit var brand: String
    lateinit var color: String
    lateinit var nbPorte: String
    lateinit var carType: String
    lateinit var pictureUrl: String
    lateinit var price: String

    init {
        resetValue()
    }

    fun addCar() {
        val car = Car(null, name, description, brand, color, nbPorte, carType, pictureUrl, price)
        carDAO.addCar(car)
        resetValue()
    }

    fun getBerlines(): String {
        var htmlResult = ""

        carDAO.getCarsByType(CarType.BERLINE).forEach {
            htmlResult = htmlResult + getBerlinesStatic(it)
        }

        return htmlResult
    }

    private fun getBerlinesStatic(berlin: Car): String {
        return "<article id=\"${berlin.id}\">" +
                "<div class=\"overlay\">" +
                "<h3 class=\"nomVoiture\"><span class=\"orange\">${berlin.brand}</span> ${berlin.nameCar}</h3>" +
                "<p class=\"descriptionVoiture\">${berlin.description}</p>" +
                "</div>" +
                "<div id=\"posBoutonInfos\">" +
                "<a href=\"#\" class=\"buttonInfos\">Acheter</a>" +
                "</div>" +
                "</article>"
    }

    private fun resetValue() {
        name = ""
        description = ""
        brand = ""
        color = ""
        nbPorte = ""
        carType = ""
        pictureUrl = ""
        price = ""
    }
}

