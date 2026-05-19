package oop_00000138850_VasselGoleyu.Week13

import java.io.File

fun main() {

    val writer = File("manual.txt").printWriter()

    writer.println("Manual close stream")

    writer.close()

    println("Writer ditutup manual")
}