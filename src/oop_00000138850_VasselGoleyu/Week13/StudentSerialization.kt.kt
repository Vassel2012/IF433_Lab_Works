package oop_00000138850_VasselGoleyu.Week13

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