package com.sachin

import kotlin.math.max

//https://leetcode.com/problems/richest-customer-wealth/
fun main(args: Array<String>) {
    val accounts = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(3, 2, 1),
    )
    println(maximumWealth2(accounts))
}

fun maximumWealth2(accounts: Array<IntArray>): Int {
    var maxWealth = 0
    for (customer in accounts) {

        var wealth = 0
        for (balance in customer) {
            wealth += balance
        }

        if (wealth > maxWealth) {
            maxWealth = wealth
        }
    }

    return maxWealth
}

fun maximumWealth(accounts: Array<IntArray>): Int {
    var maxWealth = Int.MIN_VALUE
    accounts.forEachIndexed { index, innerArray ->
        var wealth = 0
        innerArray.forEach { element ->
            wealth += element
        }

        if (wealth > maxWealth) {
            maxWealth = wealth
        }
    }

    return maxWealth
}