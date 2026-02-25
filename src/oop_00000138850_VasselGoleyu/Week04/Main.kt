package oop_00000138850_VasselGoleyu.week04

fun main() {

    val vehicle = Vehicle("Generic Brand")
    vehicle.accelerate()
    vehicle.honk()

    println("---------------")

    val car = Car("Toyota", 4)
    car.accelerate()
    car.honk()
    car.openTrunk()
}