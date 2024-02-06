package com.samiran.problemsolving.leetcode.easy

/**
 * @sample
 * 13. Roman to Integer
 *
 * */

fun romanToInt(s: String): Int {

    val map = hashMapOf<String, Int>()
    map["I"] = 1
    map["V"] = 5
    map["X"] = 10
    map["L"] = 50
    map["C"] = 100
    map["D"] = 500
    map["M"] = 1000


    var sum = 0
    var beforeValue = 0

    s.toCharArray().forEach { char ->


        val currentValue = map.getValue(char.toString())

        if (beforeValue < currentValue) {

            sum -= beforeValue

            sum += (currentValue - beforeValue)

        } else {
            sum += currentValue
        }

        beforeValue = currentValue
    }

    return sum
}


fun main() {
    val s = "IVI"
    //val s = "MCMXCIV"

    println(romanToInt(s))
}