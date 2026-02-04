package oop_00000138850_VasselGoleyu.week01

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 600000
    val finalPrice = calculateDiscount(price)
}