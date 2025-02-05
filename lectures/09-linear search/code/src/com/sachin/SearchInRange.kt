package com.sachin

fun main(args: Array<String>) {
    val numArray = arrayOf(23, 45, 1, 2, 8, 19, -3, 16, -11, 28)
    val target = 19
    val startIndex = 1
    val endIndex = 7
    println(linearSearchInRangeReturnElementIndex(numArray, target, startIndex, endIndex))

}

fun linearSearchInRangeReturnElementIndex(numArray: Array<Int>, target: Int, startIndex: Int, endIndex: Int): Int{

    if(numArray.isEmpty()){
        return -1
    }

    numArray.forEachIndexed { index, element ->
        if((index== startIndex || index<= endIndex) && element == target){
            return index
        }
    }

    return -1
}

fun linearSearchInRangeReturnElement(numArray: Array<Int>, target: Int, startIndex: Int, endIndex: Int): Int{

    if(numArray.isEmpty()){
        return -1
    }

    numArray.forEachIndexed { index, element ->
        if((index== startIndex || index<= endIndex) && element == target){
            return element
        }
    }

    return Int.MAX_VALUE
}

fun linearSearchInRangeReturnBoolean(numArray: Array<Int>, target: Int, startIndex: Int, endIndex: Int): Boolean{

    if(numArray.isEmpty()){
        return false
    }

    numArray.forEachIndexed { index, element ->
        if((index== startIndex || index<= endIndex) && element == target){
            return true
        }
    }

    return false
}