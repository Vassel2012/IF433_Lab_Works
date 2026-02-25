package oop_00000138850_VasselGoleyu.Week01

fun main() {
    val radius = 7.0
    val circle = Circle(radius)

    println("Luas lingkaran dengan radius ${circle.radius} adalah ${circle.calculateArea()}")
    println("Kategori: ${circle.checkSize()}")
}

class Circle(val radius: Double) {

    private val pi = 3.14

    fun calculateArea(): Double {
        return pi * radius * radius
    }

    fun checkSize(): String {
        val area = calculateArea()
        return if (area > 100) {
            "Besar"
        } else {
            "Kecil"
        }
    }
}
