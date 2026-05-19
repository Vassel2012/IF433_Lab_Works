package oop_00000138850_VasselGoleyu.Week13

import java.io.File

fun main() {

    val writer = File("manual.txt").printWriter()

    writer.println("Manual close stream")

    writer.close()

    println("Writer ditutup manual")

    File("safe.txt").printWriter().use { writer2 ->

        writer2.println("Menggunakan use block")
        writer2.println("Auto close stream")
    }

    println("use block selesai")

    println("=== Buffered Reader ===")

    File("safe.txt").bufferedReader().use { reader ->

        reader.forEachLine {
            println(it)
        }
    }
}