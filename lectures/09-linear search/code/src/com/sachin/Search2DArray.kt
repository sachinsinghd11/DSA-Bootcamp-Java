package com.sachin

/**
 * Linear Search in 2D Array
 */

fun main(args: Array<String>) {
    val twoDArray = arrayOf(
        arrayOf(23,4,1),
        arrayOf(18,12,3,9),
        arrayOf(78,99,34,56),
        arrayOf(18,12)
    )
    val target = 56
    println(linearSearchIn2DArrayToFindIndexOfElement(twoDArray, target).toList())
}



fun linearSearchIn2DArrayToFindIndexOfElement(twoDArray: Array<Array<Int>>, target: Int): Array<Int>{

    if(twoDArray.isEmpty()){
        return arrayOf(-1,-1)
    }

    twoDArray.forEachIndexed { outerIndex, subArray ->
        subArray.forEachIndexed { innerIndex, element ->
            if(element == target){
                return arrayOf(outerIndex, innerIndex)
            }
        }
    }

    return arrayOf(-1,-1)
}


//Find the element in 2DArray
fun linearSearchIn2DArrayToFindElement(twoDArray: Array<Array<Int>>, target: Int): Int{

    if(twoDArray.isEmpty()){
        return -1
    }

    twoDArray.forEachIndexed { _, subArray ->
        subArray.forEachIndexed { _, element ->
         if(element == target){
             return element
         }
        }
    }

    return Int.MAX_VALUE
}