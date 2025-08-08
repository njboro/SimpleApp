package com.example.simpleapp.programs

fun findMissingCharacter(input: String): Char? {
    val fullAlphabet = "abcdefghijklmnopqrstuvwxyz"

    for (char in fullAlphabet) {
        if (char !in input) return char
    }

    return null
}

fun main() {
    val result = findMissingCharacter("thequickbrownfoxjumpsoverlazyog")
    println("Missing character: $result")
}