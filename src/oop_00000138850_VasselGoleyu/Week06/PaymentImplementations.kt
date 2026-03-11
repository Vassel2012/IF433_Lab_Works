package oop_00000138850_VasselGoleyu.Week06

class Gopay : PaymentMethod {

    override fun pay(amount: Double) {
        println("Membayar Rp$amount menggunakan GoPay")
    }

}

class CreditCard : PaymentMethod {

    override fun pay(amount: Double) {
        println("Membayar Rp$amount menggunakan Credit Card")
    }

}