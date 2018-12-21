package user.controller

import basket.dao.manager.BasketDAO
import cars.dao.manager.CarDAO
import order.dao.manager.OrderDAO
import order.entity.Orders
import user.dao.manager.UserDAO
import user.entity.Users
import javax.enterprise.context.Dependent
import javax.enterprise.inject.Model
import javax.inject.Inject

@Model
@Dependent
class UserController {

    @Inject
    private lateinit var userDAO: UserDAO

    @Inject
    private lateinit var orderDAO: OrderDAO

    @Inject
    private lateinit var basketDAO: BasketDAO

    @Inject
    private lateinit var carDAO: CarDAO


    lateinit var pseudo: String
    lateinit var password: String

    lateinit var firstName: String
    lateinit var lastName: String
    lateinit var email: String

    var user: Users

    init {
        resetValue()
        user = Users()
    }

    fun connexion() {
        if(!"".equals(pseudo) && !"".equals(password)) {
            val getUser = userDAO.getUserByPseudo(pseudo)!!
            if(getUser.password.equals(password)) {
                user = getUser
            }
        }
    }

    fun inscription() {
        val newUser = Users(null, pseudo, firstName, lastName, email, password)
        userDAO.addUser(newUser)
        resetValue()
        user = newUser
    }
    
    fun getUserUIHtml(): String {

        //Connexion temporaire
        user = userDAO.getUserByPseudo("test")!!

        if(!"".equals(user.pseudo)) {
            return "<div id=\"userInfo\">" +
                    "<article id=\"info\">" +
                    "<h3 class=\"userDiv\"><span class=\"orange\">I</span>nformations</h3>" +
                    "<p>Pseudo: <span id=\"userPseudo\">${user.pseudo}</span></p>" +
                    "<p>Email: <span id=\"userEmail\">${user.email}</span></p>" +
                    "<p>Nom: <span id=\"userLastname\">${user.lastname}</span></p>" +
                    "<p>Prénom: <span id=\"userFirstname\">${user.firstname}</span></p><br>" +
                    "<p>Historique des commandes:</p>" +
                    "<table id=\"orderHistory\" style=\"width:100%\">" +
                    "<tr>" +
                    "<th>Modèle</th>" +
                    "<th>Quantité</th>" +
                    "<th>Prix</th>" +
                    "</tr>" +
                    getOrdersHtml(user.id!!) +
                    "</table><br>" +
                    "<p>Panier:</p>" +
                    "<table id=\"cartTable\" style=\"width:100%\">" +
                    "<tr>" +
                    "<th>Modèle</th>" +
                    "<th>Quantité</th>" +
                    "<th>Prix</th>" +
                    "</tr>" +
                    getBasketHtml(user.id!!) +
                    "<tr class=\"table-footer\">" +
                    "<td></td>" +
                    "<td>Total</td>" +
                    "<td id=\"cartTotal\">100</td>" +
                    "</tr>" +
                    "</table>" +
                    "</article>" +
                    "</div>"
        } else {
            return "<div id=\"userAction\">" +
                    "<article id=\"connexion\">" +
                    "<h3 class=\"userDiv\"><span class=\"orange\">C</span>onnexion</h3>" +
                    "<form class=\"userP\">" +
                    "<p>Pseudo:</p>" +
                    "<input type=\"text\" name=\"pseudo\"><br>" +
                    "<p>Mot de Passe:</p>" +
                    "<input type=\"password\" name=\"password\"><br>" +
                    "<div id=\"posUserButton\">" +
                    "<input class=\"userButton\" type=\"submit\" value=\"Connexion\">" +
                    "</div>" +
                    "</form>" +
                    "</article>" +
                    "<article id=\"inscription\">" +
                    "<h3 class=\"userDiv\"><span class=\"orange\">I</span>nscription</h3>" +
                    "<form class=\"userP\" action=\"/action_page.php\">" +
                    "<p>Pseudo:</p>" +
                    "<input type=\"text\" name=\"pseudo\"><br>" +
                    "<p>Email:</p>" +
                    "<input type=\"text\" name=\"email\"><br>" +
                    "<p>Nom:</p>" +
                    "<input type=\"text\" name=\"name\"><br>" +
                    "<p>Prénom:</p>" +
                    "<input type=\"text\" name=\"firstname\"><br>" +
                    "<p>Mot de Passe:</p>" +
                    "<input type=\"password\" name=\"password\"><br>" +
                    "<div id=\"posUserButton\">" +
                    "<input class=\"userButton\" type=\"submit\" value=\"Inscription\">" +
                    "</div>" +
                    "</form>" +
                    "</article>" +
                    "</div>"
        }
    }

    private fun getOrdersHtml(userId: Int): String {
        var htmlResult = ""

        orderDAO.getOrdersOfUser(userId).forEach {
            htmlResult = htmlResult + getOrderHtml(it)
        }

        return htmlResult
    }

    private fun getOrderHtml(order: Orders): String {
        var car = carDAO.getCarById(order.carId!!)
        var price = car.price.toInt() * order.stock!!

        return "<tr>" +
                "<td>${car.nameCar}</td>" +
                "<td>${order.stock}</td>" +
                "<td>${price}</td>" +
                "</tr>"
    }

    private fun getBasketHtml(userId: Int): String {
        var basket = basketDAO.getUserBasket(userId)
        var car = carDAO.getCarById(basket!!.carId!!)
        var price = basket.stock!! * car.price.toInt()

        return "<tr>" +
                "<td>${car.nameCar}</td>" +
                "<td>${basket.stock}</td>" +
                "<td>${price}</td>" +
                "</tr>"

    }

    private fun resetValue() {
        pseudo = ""
        firstName = ""
        lastName = ""
        email = ""
        password = ""
    }
}