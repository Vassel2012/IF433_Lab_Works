package oop_00000138850_VasselGoleyu.week11

fun main() {
    println("╔══════════════════════════════════════════╗")
    println("║     SMART HOME DASHBOARD v1.0            ║")
    println("╚══════════════════════════════════════════╝")

    val homeDevices = mutableListOf<SmartDevice>()

    println("\n=== KONFIGURASI PENCAHAYAAN ===")
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
        println("Lampu ditambahkan: ${it.name}")
    }

    println("\n=== KONFIGURASI KEAMANAN ===")
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
}