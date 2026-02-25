package oop_00000138850_VasselGoleyu.Week03

class Player(val username: String) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("XP harus bernilai positif!")
            return
        }

        val oldLevel = level
        xp += amount

        println("$username mendapatkan $amount XP")
        println("Total XP sekarang: $xp")

        if (level > oldLevel) {
            println("🎉 Level Up! $username sekarang level $level 🎉")
        }
    }

    fun printPlayerInfo() {
        println("=== Player Info ===")
        println("Username : $username")
        println("XP       : $xp")
        println("Level    : $level")
        println("===================")
    }
}
