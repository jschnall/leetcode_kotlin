package array

import kotlin.test.assertEquals

// 80. Remove Duplicates from Sorted Array II
fun removeDuplicates(nums: IntArray): Int {
    var insertIndex = 0
    var prev = nums[0]
    var count = 0

    nums.forEach { current ->
        if (current == prev) {
            count++
        } else {
            count = 1
            prev = current
        }

        if (count <= 2) {
            nums[insertIndex] = current
            insertIndex++
        }
    }

    return insertIndex
}

fun main(args: Array<String>) {
    assertEquals(5, removeDuplicates(intArrayOf(1,1,1,2,2,3)))
    assertEquals(7, removeDuplicates(intArrayOf(0,0,1,1,1,1,2,3,3)))
}