package oop_00000138850_VasselGoleyu.Week01

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 600000
    val userName: String? = null

    val finalPrice = calculateDiscount(price)
    val userNote = userName ?: "Tidak ada catatan"

    println("=== STRUK PEMBELIAN ===")
    println("Judul: $gameTitle")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan Pengguna: $userNote")
    println("=======================")
}

fun calculateDiscount(price: Int): Int {
    val discount = 50000
    return price - discount
}