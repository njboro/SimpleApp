package com.example.simpleapp.programs

fun secondLargest(arr: Array<Int>): Int? {
    val sortedArr = arr.distinct().sorted()
    return if (sortedArr.size>1) {
        sortedArr[sortedArr.size - 2]
    } else {
        null
    }
}

fun main() {
    val result = secondLargest(arrayOf(1,5,3,4,2,6))
    println("Second largest number is $result")
}