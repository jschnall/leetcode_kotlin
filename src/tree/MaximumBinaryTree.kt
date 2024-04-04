package tree

import TreeNode

// 654. Maximum Binary Tree
fun constructMaximumBinaryTree(nums: IntArray): TreeNode? {
    return buildMBT(nums, 0, nums.size - 1)
}

fun buildMBT(nums: IntArray, start: Int, end: Int): TreeNode? {
    if (start > end) {
        return null
    }

    var maxValue = nums[start]
    var maxIndex = start

    for (i in start + 1 .. end) {
        if (nums[i] > maxValue) {
            maxValue = nums[i]
            maxIndex = i
        }
    }

    val root = TreeNode(maxValue)

    root.left = buildMBT(nums, start, maxIndex - 1)
    root.right = buildMBT(nums, maxIndex + 1, end)

    return root
}

fun junk() {
    
}