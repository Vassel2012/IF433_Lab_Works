package oop_00000138850_VasselGoleyu.Week07

enum class AppState {
    LOADING, SUCCESS, ERROR
}

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}