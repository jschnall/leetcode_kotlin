//962. Maximum Width Ramp
fun maxWidthRamp(nums: IntArray): Int {
    var max = 0
    val list = mutableListOf<Pair<Int, Int>>()

    list.add(Pair(nums[0], 0))
    for (i in 1 until nums.size) {
        val result = list.binarySearchBy(nums[i]) { it.first }
        if (result == -1) {
            // Note must be sorted ascending in order to binSearch, so add items to front
            list.add(0, Pair(nums[i], i))
        } else if (result >= 0) {
            max = maxOf(max, i - list[result].second)
        } else if (result < 0) {
            max = maxOf(max, i - list[-result - 2].second)
        }
    }

    return max
}

fun main(args: Array<String>) {
    println(maxWidthRamp(intArrayOf(6,0,8,2,1,5)))
    println(maxWidthRamp(intArrayOf(9,8,1,0,1,9,4,0,4,1)))
    println(maxWidthRamp(intArrayOf(1,1)))
    println(maxWidthRamp(intArrayOf(2,1)))
}