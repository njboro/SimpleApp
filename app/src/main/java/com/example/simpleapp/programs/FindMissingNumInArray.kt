package com.example.simpleapp.programs

fun findMissingNumberInArray(arr: Array<Int>, n: Int): Int {
    val totalSum = (n * (n+1))/2
    val arrSum = arr.sum()
    return totalSum - arrSum
}

fun main() {
    val result = findMissingNumberInArray(arrayOf(1,2,4,5), 5)
    println("Missing number is $result")
}