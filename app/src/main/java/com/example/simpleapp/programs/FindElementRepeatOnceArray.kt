package com.example.simpleapp.programs

fun findSingleElement(arr: Array<Int>): Int {
    return arr.reduce { acc, num -> acc xor num }
}

fun main() {
    val result = findSingleElement(arrayOf(2,4,3,1,4,3,1))
    println("Single element in an Array: $result")
}