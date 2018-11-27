package cars.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Car(
        @Id
        @GeneratedValue(generator = "uuid")
        val id: String,
        val name: String,
        val brand: String,
        val color: String,
        val nbPorte: String,
        val price: String)