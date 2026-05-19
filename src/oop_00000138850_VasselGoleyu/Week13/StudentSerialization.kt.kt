package oop_00000138850_VasselGoleyu.Week13

import java.io.File
import java.io.FileNotFoundException

data class Student(
    val nim: String,
    val name: String,
    val gpa: Double
)

fun Student.toCsv(): String {
    return "$nim,$name,$gpa"
}

fun fromCsv(line: String): Student {

    val parts = line.split(",")

    return Student(
        parts[0],
        parts[1],
        parts[2].toDouble()
    )
}

fun saveStudents(students: List<Student>, path: String) {

    File(path).printWriter().use { writer ->

        students.forEach {
            writer.println(it.toCsv())
        }
    }
}

fun loadStudents(path: String): List<Student> {

    return try {

        File(path).readLines().map {
            fromCsv(it)
        }

    } catch (e: FileNotFoundException) {

        emptyList()
    }
}

fun main() {

    val students = listOf(
        Student("0001", "Andi", 3.8),
        Student("0002", "Budi", 3.5),
        Student("0003", "Caca", 3.9)
    )

    saveStudents(students, "students.csv")

    val loaded = loadStudents("students.csv")

    loaded.forEach {
        println(it)
    }
}