package binsearch

import kotlin.test.assertEquals

// 81. Search in Rotated Sorted Array II
fun search(nums: IntArray, target: Int): Boolean {
    if (nums.size == 1) {
        return nums[0] == target
    }
    
    val start = maxOf(findStart(nums, 0, nums.size - 1), 0)

    return nums.binarySearch(target, start, nums.size) >= 0 ||
            nums.binarySearch(target, 0, start) >= 0
}

fun findStart(nums: IntArray, start: Int, end: Int): Int {
    // bin search for rotation point
    if (start <= end) {
        var mid = start + (end - start + 1) / 2

        if (mid == 0) {
            // first element of the array, not rotated unless there were duplicates
            return 0
        } else if (nums[mid - 1] > nums[mid]) {
            return mid
        }
        if (nums[mid] > nums[nums.size - 1]) {
            // before rotated start
            return findStart(nums, mid + 1, end)
        } else if (nums[mid] < nums[nums.size - 1]) {
            // after rotated start
            return findStart(nums, start, mid - 1)
        } else if (nums[mid] == nums[nums.size - 1]) {
            // Unknown search to either side
            return maxOf(findStart(nums, start, mid - 1),
                findStart(nums, mid + 1, end))
        }
    }

    // Not found
    return -1
}

fun main(args: Array<String>) {
    assertEquals(true, search(intArrayOf(1,2,3,4,5), 1))
    assertEquals(true, search(intArrayOf(1,2,3,4,5), 5))
    assertEquals(true, search(intArrayOf(0,1,0,0,0), 1))
    assertEquals(false, search(intArrayOf(0,1,0,0,0), 3))
    assertEquals(true, search(intArrayOf(1,1,1,1,1,2,1,1,1), 2))
}