package oop_00000138850_VasselGoleyu.week02

class Hero(
    val name: String,
    var hp: Int,
    val baseDamage: Int
) {

    init {
        println("Hero $name telah diciptakan dengan HP: $hp dan Damage: $baseDamage")
    }

    fun attack(targetName: String) {
        println("\n⚔️ $name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        println("💥 $name menerima $damage damage!")

        if (hp <= 0) {
            hp = 0
            println("☠️ $name telah gugur dalam pertempuran!")
        } else {
            println("❤️ Sisa HP $name: $hp")
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }

    fun displayStatus() {
        println("\n=== Status Hero ===")
        println("Nama: $name")
        println("HP: $hp")
        println("Damage: $baseDamage")
        println("Status: ${if (isAlive()) "HIDUP" else "MATI"}")
        println("===================")
    }
}
