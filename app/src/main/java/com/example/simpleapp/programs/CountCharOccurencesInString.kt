package com.example.simpleapp.programs

fun countCharacterOccurrences(input: String): Map<Char, Int> {
    return input.groupingBy {
        it
    }.eachCount()
}

fun main() {
    val result = countCharacterOccurrences("Hello")
    println(result)
}