package array

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