package com.example.simpleapp.programs

sealed class NetworkResult<out T> {
    data class Success<out T> (val data: T) : NetworkResult<T>()
    data class Error(val exception: Throwable) : NetworkResult<Nothing>()
    object Loading : NetworkResult<Nothing> ()
}

fun handleResponse(result: NetworkResult<String>) {
    when(result) {
        is NetworkResult.Success<*> -> {
            println("Data received: ${result.data}")
        }

        is NetworkResult.Error -> {
            println("Error occurred: ${result.exception.message}")
        }

        is NetworkResult.Loading -> {
            println("Still loading... grab a coffee")
        }
    }
}

fun main() {
    handleResponse(NetworkResult.Success("Success"))
    handleResponse(NetworkResult.Error(Exception("Error")))
    handleResponse(NetworkResult.Loading)
}