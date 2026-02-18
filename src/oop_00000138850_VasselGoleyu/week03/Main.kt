package oop_00000138850_VasselGoleyu.week03

fun main() {
    val employee = Employee()

    employee.salary = 8000
    employee.updatePerformance(5)

    println("Salary: ${employee.salary}")
    println("Bonus: ${employee.bonus}")
}
