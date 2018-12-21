package order.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="Order")
class Order {
    @Id
    @GeneratedValue(generator = "uuid")
    var id: Int? = null
    var userId: Int? = -1
    var carId: Int? = -1
    var stock: Int? = -1

    constructor()

    constructor(id: Int?, userId: Int?, carId: Int?, stock: Int?) {
        this.id = id
        this.userId = userId
        this.carId = carId
        this.stock = stock
    }

    override fun toString(): String {
        return "Order(id=$id, userId=$userId, carId=$carId, stock=$stock)"
    }
}