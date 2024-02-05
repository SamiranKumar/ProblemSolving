package com.samiran.problemsolving.leetcode.easy

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test


/**
 * @sample
 * 121. Best Time to Buy and Sell Stock
 *
 * */

class BestTimeToBuyAndSellStockTest {

   /* @Before
    fun init() {
        // Log.i("hk", "startup")
        testMaxProfit1()
        testMaxProfit2()
        testMaxProfit3()
        testMaxProfit4()
        testMaxProfit5()

    }*/


    @Test
    fun testMaxProfit1() {
        val array = intArrayOf(7, 1, 5, 3, 6, 4)
        assertEquals(5, maxProfit(array))
    }

    @Test
    fun testMaxProfit2() {
        val array = intArrayOf(7, 4, 5, 3, 6, 1)
        assertEquals(3, maxProfit(array))
    }

    @Test
    fun testMaxProfit3() {
        val array = intArrayOf(7, 6, 4, 3, 1)
        assertEquals(0, maxProfit(array))
    }


    @Test
    fun testMaxProfit4() {
        val array = intArrayOf(7)

        assertEquals(0, maxProfit(array))
    }

    @Test
    fun testMaxProfit5() {
        val array = intArrayOf(1)
        assertEquals(0, maxProfit(array))
    }

   /* @After
    fun teardown() {

    }*/
}