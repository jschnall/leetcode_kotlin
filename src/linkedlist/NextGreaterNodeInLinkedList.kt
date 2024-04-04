package linkedlist

import ListNode
import java.util.*

// 1019. Next Greater Node In Linked List
fun nextLargerNodes(head: ListNode?): IntArray {
    val result = mutableListOf<Int>()
    val stack = Stack<Pair<Int, Int>>() // (num, index) monotonic decreasing by num

    var ptr = head
    while (ptr != null) {
        while (stack.isNotEmpty() && stack.peek().first < ptr.`val`) {
            val index = stack.pop().second
            result[index] = ptr.`val`
        }
        stack.push(Pair(ptr.`val`, result.size))
        result.add(0)
        ptr = ptr.next
    }

    return result.toIntArray()
}