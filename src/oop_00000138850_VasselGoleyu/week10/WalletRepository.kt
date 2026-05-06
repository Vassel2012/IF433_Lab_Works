package oop_00000138850_VasselGoleyu.Week10

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items.toList()
    }

    fun getCount(): Int {
        return items.size
    }

    fun search(keyword: String): List<T> {
        return items.filter { item ->
            item.toString().contains(keyword, ignoreCase = true)
        }
    }
}