package com.example.simpleapp.programs

fun flatten(list: List<List<Int>>): List<Int> {
    return list.flatten()
}

fun main() {
    val result = flatten(listOf(listOf(1,2), listOf(4,3), listOf(7,6)))
    println("Result: $result")
}