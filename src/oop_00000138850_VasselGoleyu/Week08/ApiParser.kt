package oop_00000138850_VasselGoleyu.Week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // requireNotNull: jika null, langsung throw IllegalArgumentException
        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }
        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name"
        }
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                // as? Int dengan fallback 12 jika warranty tidak ada / bukan Int
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                // as? String dengan fallback "All Size"
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null // Tipe tidak dikenal → return null
        }
    }
}