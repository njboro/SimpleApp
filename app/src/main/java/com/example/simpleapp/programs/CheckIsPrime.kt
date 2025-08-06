package com.example.simpleapp.programs

import kotlin.math.sqrt

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    println(sqrt(n.toDouble()).toInt())
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    val result = isPrime(11)
    println("Is number prime: $result")
}