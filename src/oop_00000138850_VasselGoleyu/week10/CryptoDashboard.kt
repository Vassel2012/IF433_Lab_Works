package oop_00000138850_VasselGoleyu.week10

fun main() {
    println("╔══════════════════════════════════════════╗")
    println("║     CRYPTO WALLET DASHBOARD v1.0         ║")
    println("╚══════════════════════════════════════════╝")

    val coinRepo = WalletRepository<Coin>()

    println("\n=== MENGISI DATA KOIN ===")
    coinRepo.add(Coin("BTC",  0.85))
    coinRepo.add(Coin("ETH",  4.20))
    coinRepo.add(Coin("USDT", 1500.0))
    coinRepo.add(Coin("BNB",  3.75))
    coinRepo.add(Coin("SOL",  12.50))
    println("Total koin tersimpan: ${coinRepo.getCount()} jenis")

    println("\n=== MEMBUAT API RESPONSE ===")
    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Status HTTP : ${response.status}")
    println("Jumlah data : ${response.data.size} koin diterima dari server")

    println("\n=== DAFTAR PORTOFOLIO KOIN ===")
    println("┌────────────┬──────────────────────┐")
    println("│ Nama Koin  │ Balance              │")
    println("├────────────┼──────────────────────┤")
    response.data.forEach { coin ->
        println("│ %-10s │ %-20.4f │".format(coin.name, coin.balance))
    }
    println("└────────────┴──────────────────────┘")

    println("\n=== DEMO FITUR SEARCH ===")
    val searchResult = coinRepo.search("BTC")
    println("Hasil pencarian 'BTC': $searchResult")

    println("\n=== MENGISI DATA TRANSAKSI ===")
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-001", 2500.00))
    txRepo.add(Transaction("TX-002",  800.50))
    txRepo.add(Transaction("TX-003",  150.00))
    txRepo.add(Transaction("TX-004", 3200.75))
    txRepo.add(Transaction("TX-005",  420.00))
    println("Total transaksi tersimpan: ${txRepo.getCount()} transaksi")

    val txResponse = ApiResponse("200 OK", txRepo.getAll())

    println("\n=== RIWAYAT TRANSAKSI ===")
    println("Status HTTP : ${txResponse.status}")
    println("┌─────────────┬──────────────────────┐")
    println("│ ID Transaksi│ Amount (USD)          │")
    println("├─────────────┼──────────────────────┤")
    txResponse.data.forEach { tx ->
        println("│ %-11s │ $%-20.2f│".format(tx.id, tx.amount))
    }
    println("└─────────────┴──────────────────────┘")

    println("\n=== PENGUJIAN AKHIR ===")
    val hargaSimulasi = mapOf(
        "BTC"  to 67000.0,
        "ETH"  to  3200.0,
        "USDT" to     1.0,
        "BNB"  to   580.0,
        "SOL"  to   175.0
    )

    var totalPortofolio = 0.0
    response.data.forEach { coin ->
        val harga    = hargaSimulasi[coin.name] ?: 0.0
        val nilaiUSD = coin.balance * harga
        totalPortofolio += nilaiUSD
        println("${coin.name}: ${coin.balance} koin x \$${harga} = \$${"%.2f".format(nilaiUSD)}")
    }

    val totalVolumeTx = txResponse.data.sumOf { it.amount }

    println("\n💰 Total Nilai Portofolio : \$${"%.2f".format(totalPortofolio)}")
    println("📊 Total Volume Transaksi : \$${"%.2f".format(totalVolumeTx)}")
    println("\n✅ Semua sistem berjalan tanpa error tipe!")
    println("[System exit, and keep your logic immutable!]")
}