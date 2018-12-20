package money.entity

class MoneyBody(val base: String, val target: String) {

    enum class MoneyType {
        USD,
        EUR
    }
}