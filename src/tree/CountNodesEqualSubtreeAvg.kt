package tree

import TreeNode
import java.math.BigInteger

// 2265. Count Nodes Equal to Average of Subtree
class CountNodesEqualSubtreeAvg {
    // Do post order traversal, passing up the path, and the count for each node in the subtree
    fun averageOfSubtree(root: TreeNode?): Int {
        root?.let {
            return traverse(it).count
        }
        return 0
    }

    private fun traverse(root: TreeNode): Result {
        var sum = 0
        var divisor = 0
        var count = 0

        root.left?.let {
            val result = traverse(it)
            sum += result.sum
            divisor += result.divisor
            count += result.count
        }

        root.right?.let {
            val result = traverse(it)
            sum += result.sum
            divisor += result.divisor
            count += result.count
        }

        sum += root.`val`
        divisor += 1
        if (sum / divisor == root.`val`) {
            count++
        }

        return Result(sum, divisor, count)
    }
}

class Result(val sum: Int, val divisor: Int, val count: Int)