import wordladder2.findLadders
import kotlin.test.assertEquals

fun main(args: Array<String>) {
}

fun kthSmallest(root: TreeNode?, k: Int): Int {
    root?.let {
        return traverseInOrder(it, k, mutableListOf(1))
    }
    return -1
}

fun traverseInOrder(root: TreeNode, target: Int, current: MutableList<Int>): Int {
    root.left?.let {
        traverseInOrder(it, target, current)
    }
    println("${root.`val`}, ${current[0]}")
    if (target == current[0]) {
        return root.`val`
    }
    current[0]++
    root.right?.let {
        traverseInOrder(it, target, current)
    }
    return -1
}