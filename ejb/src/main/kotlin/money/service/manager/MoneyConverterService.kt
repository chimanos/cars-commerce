package money.service.manager

import javax.ejb.LocalBean

@LocalBean
interface MoneyConverterService {
    fun convertEuroToDollars(euro: String): String
}