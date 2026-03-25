package oop_00000138850_VasselGoleyu.Week07

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            val item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(item, 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = GameItem("Pedang Naga", 50, ItemRarity.EPIC)
            return Weapon(item, 100)
        }
    }
}