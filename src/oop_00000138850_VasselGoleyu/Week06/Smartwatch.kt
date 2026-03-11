package oop_00000138850_VasselGoleyu.Week06

class Smartwatch(
    override val brand: String
) : Watch(), HeartRateMonitor, StepCounter {

    override fun showTime() {
        println("Menampilkan waktu di smartwatch $brand")
    }

    override fun measureHeartRate() {
        println("Mengukur detak jantung...")
    }

    override fun countSteps() {
        println("Menghitung langkah kaki...")
    }

}