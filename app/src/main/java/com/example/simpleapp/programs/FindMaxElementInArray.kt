package com.example.simpleapp.programs

fun main() {
    val result = findMaxElement(arrayOf(1, 3, 55, 8, 10))
    println("The largest number is $result")
}

fun findMaxElement(array: Array<Int>): Int? {
    return array.maxOrNull()
}