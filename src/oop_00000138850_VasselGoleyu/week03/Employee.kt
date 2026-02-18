package oop_00000138850_VasselGoleyu.week03

class Employee {

    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("Salary tidak boleh negatif")
            } else {
                field = value
            }
        }

    private var performanceRating: Int = 0

    fun updatePerformance(rating: Int) {
        if (rating in 1..5) {
            performanceRating = rating
            println("Performance updated to $performanceRating")
        } else {
            println("Rating harus antara 1 sampai 5")
        }
    }
}
