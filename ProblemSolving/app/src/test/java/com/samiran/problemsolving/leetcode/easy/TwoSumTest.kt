package com.samiran.problemsolving.leetcode.easy

import org.junit.Assert
import org.junit.Test

/**
 * @sample
 * 1. Two Sum
 *
 * */

class TwoSumTest {
    @Test
    fun case1() {

        val nums = intArrayOf(3, 2, 4)
        val target = 6
        Assert.assertEquals(intArrayOf(1, 2).asList(), twoSum(nums, target).asList())
    }


    @Test
    fun case2() {

        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9

        Assert.assertEquals(intArrayOf(0, 1).asList(), twoSum(nums, target).asList())
    }


    @Test
    fun case3() {

        val nums = intArrayOf(3, 3)
        val target = 6
        Assert.assertEquals(intArrayOf(0, 1).asList(), twoSum(nums, target).asList())
    }


}