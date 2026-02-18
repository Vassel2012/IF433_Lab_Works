package oop_00000138850_VasselGoleyu.week03

fun main() {

    println("===== TESTING WEAPON =====")

    val sword = Weapon("Excalibur")

    sword.damage = -50        // invalid
    sword.damage = 300        // rare
    sword.printWeaponInfo()

    sword.damage = 900        // legendary
    sword.printWeaponInfo()

    sword.damage = 5000       // auto clamp to 1000
    sword.printWeaponInfo()


    println("\n===== TESTING PLAYER =====")

    val player = Player("Vassel")

    player.printPlayerInfo()

    player.addXp(50)
    player.printPlayerInfo()

    player.addXp(70)
    player.printPlayerInfo()

    player.addXp(300)
    player.printPlayerInfo()

    player.addXp(-10)  // invalid
}
