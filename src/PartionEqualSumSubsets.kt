import kotlin.test.assertEquals

// 698. Partition to K Equal Sum Subsets
fun canPartitionKSubsets(nums: IntArray, k: Int): Boolean {
    val tot = nums.sum()
    if (tot % k != 0) {
        return false
    }
    val target = tot / k
    val subsets = List<MutableList<Int>>(k) { mutableListOf() }

    // TODO

    return false
}

fun main(args: Array<String>) {
    assertEquals(true, canPartitionKSubsets(intArrayOf(4,3,2,3,5,2,1), 4))
    assertEquals(false, canPartitionKSubsets(intArrayOf(1,2,3,4), 3))
}
