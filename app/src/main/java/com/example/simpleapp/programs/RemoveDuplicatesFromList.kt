package com.example.simpleapp.programs

fun removeDuplicates(numbers: List<Int>): List<Int> {
    return numbers.distinct()
}

fun main() {
    val result = removeDuplicates(listOf(1,2,3,4,5,5,4,3,2,1))
    println(result)
}