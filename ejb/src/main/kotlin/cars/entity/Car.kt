package cars.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="Car")
class Car(
        @Id
        @GeneratedValue(generator = "uuid")
        var id: Int?,
        var name: String,
        var brand: String,
        var color: String,
        var nbPorte: String,
        var price: String)