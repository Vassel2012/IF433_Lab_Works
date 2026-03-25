package oop_00000138850_VasselGoleyu.Week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Bertemu monster: ${event.monsterName}")
        }
        is BattleState.LootDropped -> {
            println("Mendapat loot: ${event.item.name} (${event.item.rarity})")
        }
        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Berada di zona aman")
        }
    }
}