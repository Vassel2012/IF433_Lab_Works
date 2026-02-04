package oop_00000138850_VasselGoleyu.week01

fun main() {
    val name = "John Thor"
    val score = 80

    val grade = when {
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        score >= 60 -> "D"
        else -> "E"
    }

    println("Nama: $name, Nilai: $score, Grade: $grade")
}

