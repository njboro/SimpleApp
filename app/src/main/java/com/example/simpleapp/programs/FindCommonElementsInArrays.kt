package com.example.simpleapp.programs

fun findCommonElements(arr1: Array<Int>, arr2: Array<Int>): Array<Int> {
    return arr1.intersect(arr2.toSet()).toTypedArray()
}

fun main() {
    val result = findCommonElements(arrayOf(1,2,3,4), arrayOf(1,5,4,6))
    println(result.joinToString())
}