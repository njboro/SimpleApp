package com.example.simpleapp.programs

fun findMaxProduct(arr: Array<Int>): Int {
    val sortedArray = arr.sorted()
    return sortedArray[sortedArray.size - 1] * sortedArray[sortedArray.size - 2]
}

fun main() {
    val result = findMaxProduct(arrayOf(1, 3, 5, 7, 9))
    println(result)
}