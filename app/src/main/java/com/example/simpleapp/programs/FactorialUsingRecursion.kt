package com.example.simpleapp.programs

fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n-1)
}

fun main() {
    val no = 5
    val result = factorial(no)
    println("Factorial of $no is $result")
}