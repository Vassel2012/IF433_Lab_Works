package oop_00000138850_VasselGoleyu.week01

fun printReceipt(title: String, finalPrice: Int) {
    println("=== STRUK PEMBELIAN ===")
    println("Judul: $title")
    println("Harga Akhir: Rp $finalPrice")
    println("=======================")
}

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 600000
    val finalPrice = calculateDiscount(price)
    printReceipt(title = gameTitle, finalPrice = finalPrice)
}