package oop_00000138850_vasselgoleyu.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}