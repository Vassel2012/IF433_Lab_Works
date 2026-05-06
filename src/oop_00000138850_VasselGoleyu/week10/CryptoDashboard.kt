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
}