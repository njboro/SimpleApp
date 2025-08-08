package com.example.simpleapp.programs

fun sortByLength(strings: List<String>): List<String> {
    return strings.sortedBy {
        it.length
    }
}

fun main() {
    val result = sortByLength(listOf(
        "apple",
        "pineapple",
        "banana",
        "cherry",
        "kiwi"
    ))
    println(result.joinToString())
}