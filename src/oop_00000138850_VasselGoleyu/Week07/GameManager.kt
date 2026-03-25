package oop_00000138850_VasselGoleyu.Week07

object GameManager {
    var isGameRunning = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        } else {
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }
}