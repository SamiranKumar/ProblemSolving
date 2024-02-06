package com.samiran.problemsolving.leetcode.easy

/**
 * @sample
 * 387. First Unique Character in a String
 *
 * */
fun main() {

    val sample = "leetcode" // 0
    //val sample = "aabb" //-1

    println("position: ${firstUniqChar(sample)}")

}


fun firstUniqChar(sample: String): Int {

    val map = linkedMapOf<Char, Int>()

    sample.forEach { char ->
        map[char] = if (map.containsKey(char)) map.getValue(char).inc() else 1
    }

    sample.forEachIndexed { index, c ->
        if (map[c] == 1) return index
    }

    return -1
}