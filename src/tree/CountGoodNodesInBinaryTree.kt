package tree

import TreeNode

// 1448. Count Good Nodes in Binary Tree
fun goodNodes(root: TreeNode?): Int {
    return gn(root, Integer.MIN_VALUE)
}

fun gn(root: TreeNode?, max: Int): Int {
    if (root == null)
        return 0

    if (root.`val` >= max) {
        return gn(root.left, root.`val`) + gn(root.right, root.`val`) + 1
    }
    return gn(root.left, max) + gn(root.right, max)
}