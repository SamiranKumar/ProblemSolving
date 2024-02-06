package com.samiran.problemsolving.leetcode.easy

import org.junit.Assert
import org.junit.Test

/**
 * @sample
 * 13. Roman to Integer
 *
 * */

class RomanToIntegerTest {
    @Test
    fun case1() {
        val s = "MCMXCIV"
        Assert.assertEquals(1994, romanToInt(s))
    }

    @Test
    fun case2() {
        val s = "MC"
        Assert.assertEquals(1100, romanToInt(s))
    }


    @Test
    fun case3() {
        val s = "IV"
        Assert.assertEquals(4, romanToInt(s))
    }

    @Test
    fun case4() {
        val s = "MV"
        Assert.assertEquals(1005, romanToInt(s))
    }
}