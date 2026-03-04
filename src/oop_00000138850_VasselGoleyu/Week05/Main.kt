package oop_00000138850_vasselgoleyu.week05

fun main() {

    println("===== POLYMORPHISM PEGAWAI =====")

    val daftarPegawai: List<Pegawai> = listOf(
        Dosen("Alexander"),
        Admin("Budi")
    )

    for (pegawai in daftarPegawai) {

        pegawai.info()
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> pegawai.mengajar()
            is Admin -> pegawai.mengelolaData()
        }

        println("--------------------")
    }

    println("\n===== OVERLOADING =====")

    val math = MathHelper()

    println("Luas Persegi: ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang: ${math.hitungLuas(4, 5)}")
    println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

    println("\n===== PAYMENT SYSTEM =====")

    val wallet = EWallet("Vassel", 50000.0)
    val card = CreditCard("Vassel", 100000.0)

    val payments: List<PaymentMethod> = listOf(wallet, card)

    for (payment in payments) {

        payment.processPayment(75000.0)

        if (payment is EWallet) {
            payment.topUp(50000.0)
            payment.processPayment(75000.0)
        }

        println("--------------------")
    }
}