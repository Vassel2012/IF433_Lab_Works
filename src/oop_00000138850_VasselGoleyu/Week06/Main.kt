package oop_00000138850_VasselGoleyu.Week06

fun processCheckout(paymentMethod: PaymentMethod) {

    paymentMethod.pay(100000.0)

}

fun main() {

    val gopay = Gopay()
    val creditCard = CreditCard()

    processCheckout(gopay)
    processCheckout(creditCard)

}