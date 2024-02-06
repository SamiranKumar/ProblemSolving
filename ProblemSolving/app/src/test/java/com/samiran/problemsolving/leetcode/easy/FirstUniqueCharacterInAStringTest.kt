package com.samiran.problemsolving.leetcode.easy

import org.junit.Assert
import org.junit.Test

/**
 * @sample
 * 387. First Unique Character in a String
 *
 * */

class FirstUniqueCharacterInAStringTest {
    @Test
    fun testFirstUniqChar1() {
        val sample = "leetcode" // 0
        Assert.assertEquals(0, firstUniqChar(sample))
    }

    @Test
    fun testFirstUniqChar2() {
        val sample = "aabb" //-1
        Assert.assertEquals(-1, firstUniqChar(sample))
    }
}