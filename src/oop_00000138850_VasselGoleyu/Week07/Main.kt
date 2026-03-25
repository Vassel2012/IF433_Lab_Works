package oop_00000138850_VasselGoleyu.Week07

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println(ItemRarity.LEGENDARY.dropChance)

    val weapon = Weapon.forgeStarterSword()
    println("${weapon.item.name} - ${weapon.item.damage}")
}