package dp

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(6, deleteAndEarn(intArrayOf(3,4,2)))
    assertEquals(9, deleteAndEarn(intArrayOf(2,2,3,3,3,4)))
    assertEquals(61, deleteAndEarn(intArrayOf(8,3,4,7,6,6,9,2,5,8,2,4,9,5,9,1,5,7,1,4)))
    //println(deleteAndEarnDp(intArrayOf(12,32,93,17,100,72,40,71,37,92,58,34,29,78,11,84,77,90,92,35,12,5,27,92,91,23,65,91,85,14,42,28,80,85,38,71,62,82,66,3,33,33,55,60,48,78,63,11,20,51,78,42,37,21,100,13,60,57,91,53,49,15,45,19,51,2,96,22,32,2,46,62,58,11,29,6,74,38,70,97,4,22,76,19,1,90,63,55,64,44,90,51,36,16,65,95,64,59,53,93)))
}

// 740. DeleteAndEarn
fun deleteAndEarn(nums: IntArray): Int {
    val map = nums.asList().groupingBy { it }.reduce { _, acc, n -> acc + n }

    return inner(map, 0)
}

fun inner(map: Map<Int, Int>, tot: Int): Int {
    if (map.isEmpty()) {
        return tot
    }

    var max = 0

    for (key in map.keys) {
        max = maxOf(max, inner(map.minus(setOf(key, key - 1, key + 1)), tot + map.getOrDefault(key, 0)))
    }

    return max
}


// TODO
//val table = mutableMapOf<Set<Int>, Int>()
//fun deleteAndEarnDp(nums: IntArray): Int {
//    table.clear()
//    val map = nums.asList().groupingBy { it }.reduce { _, acc, n -> acc + n }
//    val result = innerDp(map, 0)
//
//    println("map: $map")
//    println("table: $table")
//    println("")
//
//    return result
//}
//
//fun innerDp(map: Map<Int, Int>, tot: Int): Int {
//    if (map.isEmpty()) {
//        return tot
//    }
//
//    val keys = map.keys
//
//    table[keys]?.let {
//        return tot + it
//    }
//
//    var max = 0
//
//    for (key in map.keys) {
//        max = maxOf(max, innerDp(map.minus(setOf(key, key - 1, key + 1)), map.getOrDefault(key, 0)))
//    }
//    table[keys] = max
//
//    return tot + max
//}