package subarray

import kotlin.test.assertEquals

// 152. Maximum Product Subarray
fun maxProduct(nums: IntArray): Int {
    var result = nums[0]
    var currentMin = nums[0]
    var currentMax = nums[0]

    for (i in 1 until nums.size) {
        val newMin = minOf(currentMin * nums[i], minOf(currentMax * nums[i], nums[i]))
        val newMax = maxOf(currentMax * nums[i], maxOf(currentMin * nums[i], nums[i]))

        currentMin = newMin
        currentMax = newMax
        result = maxOf(result, currentMax)
    }

    return result
}

fun main(args: Array<String>) {
    val counts = args.asList().groupingBy { it }.eachCount()
    counts.values.toList()
    assertEquals(6, maxProduct(intArrayOf(2,3,-2,4)))
    assertEquals(0, maxProduct(intArrayOf(-2,0,1)))
    assertEquals(24, maxProduct(intArrayOf(-2,3,-4)))
}