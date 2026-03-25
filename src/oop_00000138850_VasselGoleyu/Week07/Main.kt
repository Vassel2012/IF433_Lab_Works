package oop_00000138850_VasselGoleyu.Week07

fun main() {
    val response: ApiResponse = ApiResponse.Success("OK")

    val result = when (response) {
        is ApiResponse.Success -> "Success"
        is ApiResponse.Error -> "Error"
    }
}