package oop_00000138850_VasselGoleyu.week01

fun main() {
    val name = "John Thor"
    val score = 80
    val studentId: String? = null

    val idLength = studentId?.length ?: 0

    println("Nama: $name, Nilai: $score")
    println("Panjang ID: $idLength")
}

