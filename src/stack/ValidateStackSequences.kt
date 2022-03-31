package stack

import java.util.*

// 946. Validate Stack Sequences
fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
    var pushedIndex = 0
    var poppedIndex = 0

    val stack = Stack<Int>()

    while (pushedIndex < pushed.size) {
        //println("$pushedIndex, $poppedIndex, $stack")
        if (pushed[pushedIndex] == popped[poppedIndex]) {
            pushedIndex++
            poppedIndex++
        } else if(stack.isNotEmpty() && stack.peek() == popped[poppedIndex]) {
            stack.pop()
            poppedIndex++
        } else {
            stack.push(pushed[pushedIndex])
            pushedIndex++
        }
    }
    while (stack.isNotEmpty()) {
        if (stack.pop() == popped[poppedIndex]) {
            poppedIndex++
        } else {
            return false
        }
    }

    return true
}

fun main(args: Array<String>) {
    println(validateStackSequences(intArrayOf(1,2,3,4,5), intArrayOf(4,5,3,2,1)))
    println(validateStackSequences(intArrayOf(1,2,3,4,5), intArrayOf(4,3,5,1,2)))
    println(validateStackSequences(intArrayOf(2,1,0), intArrayOf(1,2,0)))
    println(validateStackSequences(intArrayOf(1,2,3,0), intArrayOf(2,1,3,0)))
}

