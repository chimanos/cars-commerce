package user.dao.impl

import user.dao.manager.UserDAO
import user.entity.Users
import javax.ejb.Stateless
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.transaction.Transactional

@Stateless
@Transactional
open class UserDAOImpl : UserDAO {

    @PersistenceContext(unitName="persistenceUnit")
    private lateinit var entityManager: EntityManager

    override fun getUsers(): List<Users> {
        val query = entityManager.createQuery("SELECT user FROM Users user ORDER BY id")
        return query.getResultList() as List<Users>
    }

    override fun getUserById(id: Int) = entityManager.find(Users::class.java, id)

    override fun getUserByPseudo(pseudo: String) = entityManager.find(Users::class.java, pseudo)

    override fun addUser(users: Users) = entityManager.persist(users)
}