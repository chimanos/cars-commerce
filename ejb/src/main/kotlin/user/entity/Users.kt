package user.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="Users")
class Users(@Id
            @GeneratedValue(generator = "uuid")
            var id: Int?,
            var pseudo: String,
            var firstname: String,
            var lastname: String,
            var email: String,
            var password: String)