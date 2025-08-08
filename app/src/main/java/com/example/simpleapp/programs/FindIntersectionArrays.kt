package com.example.simpleapp.programs

fun intersectArrays(arr1: Array<Int>, arr2: Array<Int>): Array<Int> {
    return arr1.filter { it in arr2 }.toTypedArray()
}

fun main() {
    val result = intersectArrays(arrayOf(1,2,3,4), arrayOf(4,5,6,7))
    println("Intersected arrays are: ${result.joinToString()}")
}