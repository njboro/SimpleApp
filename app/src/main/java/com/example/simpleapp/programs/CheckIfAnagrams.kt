package com.example.simpleapp.programs

fun areAnagrams(str1: String, str2: String): Boolean {
    return str1.toCharArray().sorted() == str2.toCharArray().sorted()
}

fun main() {
    val result = areAnagrams("listen", "silent")
    println("Is Anagram : $result")
}