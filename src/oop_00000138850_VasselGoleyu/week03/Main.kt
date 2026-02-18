package oop_00000138850_VasselGoleyu.week03

class Employee {

    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("Gaji tidak boleh negatif")
            } else {
                field = value
            }
        }

    private var performanceRating: Int = 0

    fun updatePerformance(rating: Int) {
        if (rating in 1..5) {
            performanceRating = rating
        } else {
            println("Rating harus 1 - 5")
        }
    }
}
