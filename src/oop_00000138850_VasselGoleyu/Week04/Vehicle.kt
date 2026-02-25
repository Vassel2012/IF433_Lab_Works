package oop_00000138850_VasselGoleyu.Week04

open class Vehicle(
    val brand: String
) {

    open fun accelerate() {
        println("$brand sedang berakselerasi.")
    }

    open fun honk() {
        println("$brand membunyikan klakson: Tin! Tin!")
    }
}