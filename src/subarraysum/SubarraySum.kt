package subarraysum

import kotlin.test.assertEquals

// 560. Subarray Sum Equals K
fun subarraySum(nums: IntArray, k: Int): Int {
    val prefixSums = mutableMapOf<Int, Int>() // Maps prefix sum to a count of how many times it occurs
    var sum = 0
    var result = 0

    nums.forEach { num ->
        sum += num
        if (sum == k) {
            result++
        }
        prefixSums[sum - k]?.let { count ->
            result += count
        }
        // handle negative numbers, and prevent over count for zeros
        if (k != 0 && sum == 0) {
            prefixSums[k - sum]?.let { count ->
                result += count
            }
        }
        prefixSums[sum] = prefixSums.getOrDefault(sum, 0) + 1
    }
    //println(prefixSums)

    return result
}

fun main(args: Array<String>) {
    assertEquals(1, subarraySum(intArrayOf(1), 1))
    assertEquals(2, subarraySum(intArrayOf(1, 1, 1), 2))
    assertEquals(2, subarraySum(intArrayOf(1, 2, 3), 3))
    assertEquals(3, subarraySum(intArrayOf(1, 1, 1), 1))
    assertEquals(1, subarraySum(intArrayOf(-5, 5, -5), 5))
    assertEquals(2, subarraySum(intArrayOf(-5, 5, -5), 0))
    assertEquals(4, subarraySum(intArrayOf(1, 2, 1, 2, 1), 3))
    assertEquals(3, subarraySum(intArrayOf(1, -1, 0), 0))
    assertEquals(5, subarraySum(intArrayOf(1,2,3,4,5,6,7,1,23,21,3,1,2,1,1,1,1,1,12,2,3,2,3,2,2), 22))
}
