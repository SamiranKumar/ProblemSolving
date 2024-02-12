package com.samiran.problemsolving.math.fibonacciSeries


/**
 *
 * Fibonacci
 * f(n) = f(n-1) + f(n-2)
f(5) = f(4) + f(3)
f(4) = f(3) + f(2)
f(3) = f(2) + f(1)

 *Base case
f(2) = 1 (2-1)
f(1) = 1 (1-0)
f(0) = 0

 *
 * */

fun main() {
    //fibonacciSeries()
    // fibonacciSeries_1()

    // print(fibonacciRecursive(70))

    print(fibonacciRecursiveFirst(176))
}


//========================================================================
fun fibonacciSeries() {
    var number = 10

    println("Fibonacci Series till $number terms:")

    for (n in 1..number) {

        var value = (n - 1) + (n - 2)

        if (value < 0) {
            value = 0
        }

        print("$value ")
    }
}

//========================================================================
fun fibonacciSeries_1() {
    var number = 9


    var n1 = 0 // 1st
    var n2 = 1 //2nd

    var n3 = 0

    println("Fibonacci Series till $number terms:")
    for (n in 0..number) {


        // Base cases return itself 0 and 1
        if (n == 0 || n == 1) {
            print("$n ")
        } else {
            n3 = n1 + n2

            print("$n3 ")

            n1 = n2
            n2 = n3
        }

    }

}


//========================================================================

///recursive
fun fibonacciRecursive(number: Long): Long {

    // Base cases return itself 0 and 1
    if (number == 0L) {
        return 0L
    } else if (number == 1L) {
        return 1L
    }

    return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2)
}


//========================================================================
var cacheFibonacciNumber = hashMapOf<Long, Long>() // Limit 176
fun fibonacciRecursiveFirst(number: Long): Long {

    // Base cases return itself 0 and 1
    if (number == 0L) {
        return 0L
    } else if (number == 1L) {
        return 1L
    }

    if (cacheFibonacciNumber.containsKey(number)) {
        return cacheFibonacciNumber.getValue(number)
    }

    val nThFibonacciNumber =
        fibonacciRecursiveFirst(number - 1) + fibonacciRecursiveFirst(number - 2)
    cacheFibonacciNumber[number] = nThFibonacciNumber

    return nThFibonacciNumber
}



