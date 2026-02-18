package oop_00000138850_VasselGoleyu.week03

class Employee {

    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("Salary tidak boleh negatif")
            } else {
                field = value   // ✅ gunakan backing field
            }
        }
}