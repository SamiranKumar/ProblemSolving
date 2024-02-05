package com.samiran.problemsolving.leetcode.easy


/**
 * @sample
 * 121. Best Time to Buy and Sell Stock
 *
 * */
fun main() {
    var array = intArrayOf(7, 1, 5, 3, 6, 4)
    array = intArrayOf(7, 4, 5, 3, 6, 1)
    array = intArrayOf(7, 6, 4, 3, 1)
    array = intArrayOf(7)
    array = intArrayOf(1)

    println(maxProfit(array))

}


fun maxProfit(prices: IntArray): Int {

    var maxProfit = 0
    var buyPrice = Int.MAX_VALUE

    prices.forEach { price ->
        if (buyPrice > price) {
            buyPrice = price
        } else {
            val currentProfit = price - buyPrice
            maxProfit = maxOf(maxProfit, currentProfit)
        }
    }

    return maxProfit
}
