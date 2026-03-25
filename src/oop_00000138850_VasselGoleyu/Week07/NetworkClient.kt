package oop_00000138850_VasselGoleyu.Week07

class NetworkClient private constructor(val baseUrl: String) {

    companion object {
        fun create(baseUrl: String): NetworkClient {
            return NetworkClient(baseUrl)
        }
    }
}