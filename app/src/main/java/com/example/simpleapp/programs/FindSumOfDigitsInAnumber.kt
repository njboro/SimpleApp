package com.example.simpleapp.programs

fun sumOfDigits(n: Int): Int{
    return n.toString().map {
        it.toString().toInt()
    }.sum()
}

fun main() {
    val result = sumOfDigits(1212)
    println("Sum of digits: $result")
}