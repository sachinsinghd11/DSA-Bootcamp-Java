package com.sachin

fun main() {
    val str = "Sachin"
    val target = 'c'
    println(str.toList())
    println(linearSearchInString(str, target))
}

fun linearSearchInString(str: String, target: Char): Boolean {

    if (str.isEmpty()) {
        return false
    }

    str.forEachIndexed { _, character ->
        if (character == target) {
            return true
        }
    }

    return false
}

