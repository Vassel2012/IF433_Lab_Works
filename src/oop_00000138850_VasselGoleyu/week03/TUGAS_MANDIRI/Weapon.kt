package oop_00000138850_VasselGoleyu.week03

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            when {
                value < 0 -> {
                    println("Damage tidak boleh negatif!")
                }

                value > 1000 -> {
                    println("Damage terlalu besar, otomatis di-set ke 1000.")
                    field = 1000
                }

                else -> {
                    field = value
                }
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            damage > 200 -> "Rare"
            else -> "Common"
        }

    fun printWeaponInfo() {
        println("=== Weapon Info ===")
        println("Name   : $name")
        println("Damage : $damage")
        println("Tier   : $tier")
        println("===================")
    }
}
