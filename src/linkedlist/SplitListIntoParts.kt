package linkedlist

import ListNode
import array.removeDuplicates
import kotlin.math.ceil
import kotlin.test.assertEquals

// 725. Split Linked List in Parts
fun splitListToParts(head: ListNode?, k: Int): Array<ListNode?> {
    var ptr = head
    var size = 0.0
    var count = k

    while (ptr != null) {
        size++
        ptr = ptr.next
    }

    val result = Array<ListNode?>(k) { null }
    ptr = head
    for (i in 0 until k) {
        if (ptr != null) {
            result[i] = ptr
            var dec = 1
            for (j in 0 until ceil(size / count).toInt() - 1) {
                if (ptr == null) {
                    break
                }
                ptr = ptr.next
                dec++
            }
            val tmp = ptr?.next
            ptr?.next = null
            ptr = tmp
            size -= dec
            count--
        }
    }

    return result
}