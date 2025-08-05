package com.example.simpleapp.programs

fun findFirstNonRepeatedCharInString(input: String): Char? {
    val charCount = mutableMapOf<Char, Int>()
    input.forEach { char ->
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }
    return input.find { char ->
        charCount[char] == 1
    }
}

fun main() {
    val result = findFirstNonRepeatedCharInString("swiss")
    println("First non repeated char : $result")
}