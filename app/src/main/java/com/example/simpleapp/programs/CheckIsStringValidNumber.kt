package com.example.simpleapp.programs

fun isValidNumber(input: String): Boolean {
    return input.toDoubleOrNull() != null
}

fun main() {
    val result = isValidNumber("123.45")
    println("Is string a valid number: $result")
}