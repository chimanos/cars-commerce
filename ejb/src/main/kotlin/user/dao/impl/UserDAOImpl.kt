package user.dao.impl

import user.dao.manager.UserDAO
import user.entity.User
import javax.ejb.Stateless
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.transaction.Transactional

@Stateless
@Transactional
open class UserDAOImpl : UserDAO {

    @PersistenceContext(unitName="persistenceUnit")
    private lateinit var entityManager: EntityManager

    override fun addUser(user: User) {
        entityManager.persist(user)
    }

//    override fun getUsers(): List<User> {
//
//    }
//
//    override fun getUser(id: String): User {
//
//    }
}