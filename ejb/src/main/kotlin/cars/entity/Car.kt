package cars.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="Car")
class Car {
    @Id
    @GeneratedValue(generator = "uuid")
    var id: Int? = null
    var nameCar: String = ""
    var description: String = ""
    var brand: String = ""
    var color: String = ""
    var nbPorte: String = ""
    var carType: String = ""
    var pictureUrl: String = ""
    var price: String = ""

    constructor()

    constructor(id: Int?, nameCar: String, description: String, brand: String, color: String, nbPorte: String, carType: String, pictureUrl: String, price: String) {
        this.id = id
        this.nameCar = nameCar
        this.description = description
        this.brand = brand
        this.color = color
        this.nbPorte = nbPorte
        this.carType = carType
        this.pictureUrl = pictureUrl
        this.price = price
    }

    override fun toString(): String {
        return "Car(id=$id, nameCar='$nameCar', description='$description', brand='$brand', color='$color', nbPorte='$nbPorte', carType='$carType', pictureUrl='$pictureUrl', price='$price')"
    }
}
