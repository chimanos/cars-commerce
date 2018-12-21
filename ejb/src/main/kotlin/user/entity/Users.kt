package user.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="Users")
class Users {
    @Id
    @GeneratedValue(generator = "uuid")
    var id: Int? = null
    var pseudo: String = ""
    var firstname: String = ""
    var lastname: String = ""
    var email: String = ""
    var password: String = ""

    constructor()

    constructor(id: Int?, pseudo: String, firstname: String, lastname: String, email: String, password: String) {
        this.id = id
        this.pseudo = pseudo
        this.firstname = firstname
        this.lastname = lastname
        this.email = email
        this.password = password
    }

    override fun toString(): String {
        return "Users(id=$id, pseudo='$pseudo', firstname='$firstname', lastname='$lastname', email='$email', password='$password')"
    }
}
