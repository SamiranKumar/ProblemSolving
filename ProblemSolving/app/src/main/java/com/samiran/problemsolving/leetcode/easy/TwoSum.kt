package com.samiran.problemsolving.leetcode.easy

/**
 * @sample
 * 1. Two Sum
 *
 * */
fun main() {

    val nums = intArrayOf(3, 2, 4)
    val target = 6


    // val nums = intArrayOf(2,7,11,15)
    //val target = 9

    //  val nums = intArrayOf(3, 3)
    // val target = 6

    println("position: ${twoSum(nums, target).asList()}")

}


fun twoSum(nums: IntArray, target: Int): IntArray {


    var map = hashMapOf<Int, Int>()

    nums.forEachIndexed { index, value ->
        val different = target - value

        if (map.containsKey(different)) {
            return intArrayOf(map.getValue(different), index)
        } else {
            map[value] = index
        }
    }

    return intArrayOf()
}


fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {

    var a = IntArray(2)

    nums.forEachIndexed { index, value ->

        for (i in (index + 1) until nums.size) {
            if (nums[i] + value == target) {
                a[0] = index
                a[1] = i
            }
        }
    }


    return a
}