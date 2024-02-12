package com.samiran.problemsolving.leetcode.easy


/**
 * @sample
 * 509. Fibonacci Number
 *
 * */


val cacheFibonacciNumber = hashMapOf<Int, Int>()
fun fib(number: Int): Int {

    // Base cases return itself 0 and 1
    if (number == 0) {
        return 0
    } else if (number == 1) {
        return 1
    }

    if (cacheFibonacciNumber.containsKey(number)) {
        return cacheFibonacciNumber.getValue(number)
    }

    val nThFibonacciNumber =
        fib(number - 1) + fib(number - 2)
    cacheFibonacciNumber[number] = nThFibonacciNumber

    return nThFibonacciNumber
}

fun main() {
    print(fib(1))
}