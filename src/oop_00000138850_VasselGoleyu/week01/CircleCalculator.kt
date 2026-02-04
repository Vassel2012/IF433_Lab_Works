package oop_00000138850_VasselGoleyu.week01

fun checkSize(area: Double) = if (area > 100) "Besar" else "Kecil"

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius
    println("Luas lingkaran dengan radius $radius adalah $area")
    println("Kategori: ${checkSize(area)}")
}