package com.sachin


fun main(args: Array<String>) {
    val numArray = arrayOf(23, 45, 1, 2, 8, 19, -3, 16, -11, 28)
    val target = 19
    println(
        linearSearch3(numArray, target)
    )
}

// search the target and return true or false
fun linearSearch3(numArray: Array<Int>, target: Int): Boolean{
    if(numArray.isEmpty()){
        return false
    }

    numArray.forEachIndexed { _, element ->
        if(element == target){
            return true
        }
    }

    return false
}

// search the target and return the element
fun linearSearch2(numArray: Array<Int>, target: Int): Int{

    if(numArray.isEmpty()){
        return -1
    }

    numArray.forEachIndexed { _, element ->
        if(element == target){
            return element
        }
    }

    return Int.MAX_VALUE
}

// search in the array: return the index if item found
// otherwise if item not found return -1
fun linearSearch(numArray: Array<Int>, target: Int): Int {
    if(numArray.isEmpty()){
        return -1
    }

    numArray.forEachIndexed { index, element ->
        if(element == target){
            return index
        }
    }

    return -1
}