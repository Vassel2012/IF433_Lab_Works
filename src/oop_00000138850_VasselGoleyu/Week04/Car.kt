package oop_00000138850_VasselGoleyu.week04

open class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    override fun honk() {
        println("$brand membunyikan klakson: Beep! Beep!")
    }

    override fun accelerate() {
        super.accelerate()
        println("$brand meningkatkan kecepatan dengan performa mesin mobil.")
    }

    fun openTrunk() {
        println("Bagasi mobil $brand dibuka.")
    }
}