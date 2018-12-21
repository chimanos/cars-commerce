package user.dao.manager

import user.entity.Users
import javax.ejb.LocalBean

@LocalBean
interface UserDAO {
    fun getUsers(): List<Users>
    fun getUserById(id: Int): Users
    fun getUserByPseudo(pseudo: String): Users?
    fun addUser(users: Users)
}