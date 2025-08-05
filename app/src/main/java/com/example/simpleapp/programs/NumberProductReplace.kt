package com.example.simpleapp.programs

import kotlinx.coroutines.runBlocking

fun productExceptSelf(nums: List<Int>): List<Int> {
    val n = nums.size
    val result = MutableList(n) { 1 }

    var left = 1
    for (i in 0 until n) {
        result[i] = left
        left *= nums[i]
    }

    var right = 1
    for (i in n - 1 downTo 0) {
        result[i] *= right
        right *= nums[i]
    }

    return result
}

fun main() = runBlocking {
    val list1 = listOf(1, 2, 3, 4) //[24,12,8,6]
    val list2 = listOf(1, 5, 2, 6) //[60,12,30,10]
    println(productExceptSelf(list1))
    println(productOfOthers(list2))
}

//Print product of other elements from an array
fun productOfOthers(nums: List<Int>) : List<Int> {
    return nums.withIndex().map {
        (index, _) ->
        nums.filterIndexed { i, _ -> i != index }
            .reduce { acc, num -> acc * num }
    }
}