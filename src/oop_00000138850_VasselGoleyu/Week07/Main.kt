package oop_00000138850_VasselGoleyu.Week07

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println(ItemRarity.LEGENDARY.dropChance)

    val weapon = Weapon.forgeStarterSword()
    println("${weapon.item.name} - ${weapon.item.damage}")

    val upgradedItem = weapon.item.copy(damage = 25)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}