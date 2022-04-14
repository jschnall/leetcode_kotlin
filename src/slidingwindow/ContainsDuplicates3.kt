package slidingwindow

import kotlin.test.assertFalse
import kotlin.test.assertTrue

// 220. Contains Duplicate III
fun containsNearbyAlmostDuplicate(nums: IntArray, k: Int, t: Int): Boolean {
    // Sorted list of the last k items
    val sortedList = mutableListOf(nums[0])

    // Separate into 2 loops to avoid size check when removing oldest element
    for (i in 1 .. minOf(k, nums.size - 1)) {
        val result = sortedList.binarySearch(nums[i])

        if (result >= 0) {
            // Duplicate element found, works for all values of t, even 0
            return true
        }
        // Check the available elements immediately greater and less than the one we wish to insert
        val index = -result - 1

        if (index < sortedList.size && Math.abs(nums[i].toLong() - sortedList[index]) <= t ||
            (index > 0 && Math.abs(nums[i].toLong() - sortedList[index - 1]) <= t)) {
            return true
        }
        sortedList.add(index, nums[i])
    }

    for (i in k + 1 until nums.size) {
        sortedList.remove(nums[i - k - 1])

        val result = sortedList.binarySearch(nums[i])

        if (result >= 0) {
            return true
        }
        val index = -result - 1

        if (index < sortedList.size && Math.abs(nums[i].toLong() - sortedList[index]) <= t ||
            (index > 0 && Math.abs(nums[i].toLong() - sortedList[index - 1]) <= t)) {
            return true
        }
        sortedList.add(index, nums[i])
    }

    return false
}

fun main(args: Array<String>) {
    assertTrue(containsNearbyAlmostDuplicate(intArrayOf(1,2,3,1), 3, 0))
    assertTrue(containsNearbyAlmostDuplicate(intArrayOf(1,0,1,1), 1, 2))
    assertFalse(containsNearbyAlmostDuplicate(intArrayOf(1,5,9,1,5,9), 1, 2))
    assertFalse(containsNearbyAlmostDuplicate(intArrayOf(Integer.MIN_VALUE, Integer.MAX_VALUE), 1, 1))
    assertTrue(containsNearbyAlmostDuplicate(intArrayOf(Integer.MAX_VALUE, Integer.MAX_VALUE), 1, 0))
}