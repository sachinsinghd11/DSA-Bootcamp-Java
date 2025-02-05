package com.sachin

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
fun main(args: Array<String>) {

    val nums = intArrayOf(12, 345, 2, 6, 7896)
    println(findNumbers(nums))

}

fun findNumbers(nums: IntArray): Int {
    var count = 0
    nums.forEach { element ->
        if (element.toString().length % 2 == 0) {
            count++
        }
    }
    return count
}