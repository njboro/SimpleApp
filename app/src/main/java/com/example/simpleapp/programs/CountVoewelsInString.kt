package com.example.simpleapp.programs

fun main() {
    val count = countVowels("I love you")
    println("Vowels count : $count")
}

fun countVowels(input: String): Int {
    return input.count {
        it in "aeiouAEIOU"
    }
}