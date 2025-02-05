package com.sachin

fun main(args: Array<String>) {
    val numArray = arrayOf(23, 45, 1, 2, 8, 19, -3, 16, -11, 28)
    println(findMinimumNumber(numArray))
}

fun findMinimumNumber(numArray: Array<Int>): Int{

    if(numArray.isEmpty()){
        return Int.MIN_VALUE
    }

    var minNumber = numArray[0]
    numArray.forEachIndexed { _, element ->
        if(element<minNumber){
            minNumber = element
        }
    }

    return minNumber
}