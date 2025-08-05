package com.example.simpleapp.programs

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {

    val time = measureTimeMillis {
        val result1 = async { task1() }
        val result2 = async { task2() }

        // Wait for both to finish
        println("Result1: ${result1.await()}")
        println("Result2: ${result2.await()}")
    }

    println("Completed in $time")
}

suspend fun task1(): Int {
    delay(1000)
    println("Task1 done")
    return 10
}

suspend fun task2(): Int {
    delay(1000)
    println("Task2 done")
    return 20
}