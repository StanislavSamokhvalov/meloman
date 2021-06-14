const val DISCOUNT = 100 // Скидка для тех, у кого предыдущая сумма покупок более 1000 рублей
const val DISCOUNT_MAX_PERCENT = 5 // Скидка 5% для тех, у кого предыдущая сумма покупок более 10000 рублей
const val DISCOUNT_MIN_PERCENT = 1 // Дополнительная скидка 1% для постоянных покупателей
const val DISCOUNT_START = 1000
const val DISCOUNT_MAX = 10000
const val ITEM_PRICE = 100 // Стандартая стоимость одного альбома


fun main() {
    println("Сколько альбомов уже было куплено?")
    val itemCount = readLine()!!.toInt()
    println("Это постоянный покупатель? (true/false)")
    val regularCustomer = readLine()!!.toBoolean()

    val totalPrice = ITEM_PRICE * itemCount
    val finallyDiscount = if ((DISCOUNT_MAX > totalPrice) && (totalPrice > DISCOUNT_START) && regularCustomer) {
        DISCOUNT.toString() + " рублей, а также -$DISCOUNT_MIN_PERCENT% от суммы покупки"
    } else if ((DISCOUNT_MAX < totalPrice) && regularCustomer) {
        (DISCOUNT_MAX_PERCENT + DISCOUNT_MIN_PERCENT).toString() + "%"
    } else if ((DISCOUNT_MAX > totalPrice) && (totalPrice > DISCOUNT_START)) {
        DISCOUNT.toString() + " рублей"
    } else if (DISCOUNT_MAX < totalPrice) {
        (DISCOUNT_MAX_PERCENT.toString() + "%")
    } else {
        0.toString() + "%"
    }
    0
    println("Cкидка составит $finallyDiscount")


}

