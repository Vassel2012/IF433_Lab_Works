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

    println("\n=== KONFIGURASI AC & KABEL ===")
    val ac = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(ac)
    println("AC ditambahkan: ${ac.name}")

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))
    println("Pet feeder ditambahkan.")

    println("\n=== PENCARIAN PERANGKAT ===")
    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }
}