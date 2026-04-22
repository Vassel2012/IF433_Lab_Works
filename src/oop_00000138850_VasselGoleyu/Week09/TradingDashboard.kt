package oop_00000138850_VasselGoleyu.Week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG",  20,  15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10,  -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 25,   8.3, "CLOSED"),
        TradeLog("SOLUSDT", "LONG",  15, -12.7, "CLOSED"),
        TradeLog("ETHUSDT", "LONG",  10,  22.4, "CLOSED"),
        TradeLog("BTCUSDT", "LONG",  20,   6.1, "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 15,   3.8, "OPEN"),
        TradeLog("ETHUSDT", "LONG",  10,  -9.0, "OPEN")
    )

    val closedTrades  = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades  = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()
}