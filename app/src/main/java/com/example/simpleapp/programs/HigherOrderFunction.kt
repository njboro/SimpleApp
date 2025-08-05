package com.example.simpleapp.programs

fun main() {
    //Multiply
    myHigherOrderFunction(3, 4) {
        aa, bb -> aa*bb
    }

    //Addition
    myHigherOrderFunction(3, 4) {
            a, b -> a+b
    }
}

fun myHigherOrderFunction(a: Int, b: Int, sum: (Int,Int) -> Int) {
    println(sum(a, b))
}