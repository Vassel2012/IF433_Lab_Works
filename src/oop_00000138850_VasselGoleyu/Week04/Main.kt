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

    println("---------------")

    val electricCar = ElectricCar("Tesla", 4, 90)
    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()

    println("---------------")

    val manager = Manager("Andi", 10_000_000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println("---------------")

    val developer = Developer("Budi", 8_000_000, "Kotlin")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}

