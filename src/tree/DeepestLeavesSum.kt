package tree

import TreeNode


/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
// 1302. Deepest Leaves Sum
class DeepestLeavesSum {
    var maxDepth = 0
    var sum = 0

    fun deepestLeavesSum(root: TreeNode?): Int {
        root?.let {
            traverse(it, 0)
        }

        return sum
    }

    private fun traverse(root: TreeNode, depth: Int) {
        if (root.left == null && root.right == null) {
            if (depth > maxDepth) {
                maxDepth = depth
                sum = root.`val`
            } else if (depth == maxDepth) {
                sum += root.`val`
            }
            return
        }

        root.left?.let {
            traverse(it, depth + 1)
        }
        root.right?.let {
            traverse(it, depth + 1)
        }
    }
}