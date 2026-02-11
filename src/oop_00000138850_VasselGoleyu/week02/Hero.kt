package oop_00000138850_VasselGoleyu.week02

package oop_001_johnthor.week02

class Hero(
    val name: String,
    var hp: Int,
    val baseDamage: Int
) {

    init {
        println("Hero $name telah diciptakan dengan HP: $hp dan Damage: $baseDamage")
    }

    // Method untuk menyerang
    fun attack(targetName: String) {
        println("\n⚔️ $name menebas $targetName!")
    }

    // Method untuk menerima damage
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

    // Method untuk mengecek apakah hero masih hidup
    fun isAlive(): Boolean {
        return hp > 0
    }

    // Method untuk menampilkan status
    fun displayStatus() {
        println("\n=== Status Hero ===")
        println("Nama: $name")
        println("HP: $hp")
        println("Damage: $baseDamage")
        println("Status: ${if (isAlive()) "HIDUP" else "MATI"}")
        println("===================")
    }
}