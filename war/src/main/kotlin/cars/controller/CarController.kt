package cars.controller

import cars.dao.manager.CarDAO
import cars.entity.Car
import money.service.manager.MoneyConverterService
import javax.enterprise.context.Dependent
import javax.enterprise.inject.Model
import javax.inject.Inject

@Model
@Dependent
class CarController {

    @Inject
    private lateinit var carDAO: CarDAO

    @Inject
    private lateinit var moneyConverterService: MoneyConverterService

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

    fun getCarsHtml(type: String): String {
        var htmlResult = ""

        carDAO.getCarsByType(type).forEach {
            htmlResult = htmlResult + getCarHtml(it)
        }

        return htmlResult
    }

    private fun getCarHtml(car: Car): String {
        return "<article id=\"${car.id}\" style=\"background-image: url('${car.pictureUrl}'); background-size: cover;\">" +
                "<div class=\"overlay\">" +
                "<h3 class=\"nomVoiture\"><span class=\"orange\">${car.brand}</span> ${car.nameCar}</h3>" +
                "<p class=\"descriptionVoiture\">${car.description}</p>" +
                "</div>" +
                "<div id=\"posBoutonInfos\">" +
                "<a href=\"#\" class=\"buttonInfos\">Acheter ${car.price}€ / ${moneyConverterService.convertEuroToDollars(car.price)}$</a>" +
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

