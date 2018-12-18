package user.dao.manager

import user.entity.User
import javax.ejb.LocalBean

@LocalBean
interface UserDAO {
    fun getUsers(): List<User>
    fun getUserById(id: Int): User
    fun getUserByPseudo(pseudo: String): User
    fun addUser(user: User)
}