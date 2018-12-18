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

    override fun getUsers(): List<User> {
        val query = entityManager.createQuery("SELECT * FROM Users ORDER BY id")
        return query.getResultList() as List<User>
    }

    override fun getUserById(id: Int) = entityManager.find(User::class.java, id)

    override fun getUserByPseudo(pseudo: String) = entityManager.find(User::class.java, pseudo)

    override fun addUser(user: User) = entityManager.persist(user)
}