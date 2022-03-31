import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(3, numberOfArithmeticSlices(intArrayOf(1,2,3,4)))
    assertEquals(0, numberOfArithmeticSlices(intArrayOf(1)))
    assertEquals(4, numberOfArithmeticSlices(intArrayOf(1,2,3,4,6,8)))
}

// 413. Arithmetic Slices
fun numberOfArithmeticSlices(nums: IntArray): Int {
    if (nums.size < 3) {
        return 0
    }

    val diffs = IntArray(nums.size - 1)
    for (i in 1 until nums.size) {
        diffs[i - 1] = nums[i - 1] - nums[i]
    }

    var result = 0
    var current = diffs[0]
    var count = 1

    for (i in 1 until diffs.size) {
        if (diffs[i] == current) {
            count++
        } else {
            result += (count - 1) * count / 2
            current = diffs[i]
            count = 1
        }
    }
    result += (count - 1) * count / 2

    return result
}