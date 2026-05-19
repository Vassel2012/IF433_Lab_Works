package oop_00000138850_VasselGoleyu.Week13

import java.io.File

fun main() {

    val file = File("notes.txt")

    file.writeText("Belajar File I/O Kotlin\n")

    println("Berhasil menulis file")
}