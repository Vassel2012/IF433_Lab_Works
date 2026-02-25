package oop_00000138850_VasselGoleyu.Week04

open class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dibuka.")
    }
}