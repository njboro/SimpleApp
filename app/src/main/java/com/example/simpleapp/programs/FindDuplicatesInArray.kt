package com.example.simpleapp.programs

fun findDuplicates(arr: Array<Int>): List<Int> {
    val seen = mutableSetOf<Int>()
    val duplicates = mutableListOf<Int>()

    for (num in arr) {
        if (num in seen) {
            duplicates.add(num)
        } else {
            seen.add(num)
        }
    }

    return duplicates
}

fun main() {
    val result = findDuplicates(arrayOf(1,2,3,1,3,5,6,7))
    println("Duplicates are: $result")
}
