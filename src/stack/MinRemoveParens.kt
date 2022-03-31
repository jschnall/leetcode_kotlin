package stack

import java.util.*

// 1249. Minimum Remove to Make Valid Parentheses
fun minRemoveToMakeValid(s: String): String {
    val stack = Stack<Pair<Char, Int>>()
    val indicesToRemove = mutableSetOf<Int>()

    s.forEachIndexed { index, c ->
        if (c == '(') {
            stack.push(Pair(c, index))
        } else if (c == ')') {
            if (stack.isEmpty()) {
                indicesToRemove.add(index)
            } else {
                stack.pop()
            }
        }
    }
    while (stack.isNotEmpty()) {
        indicesToRemove.add(stack.pop().second)
    }

    val builder = StringBuilder()

    s.forEachIndexed { index, c ->
        if (!indicesToRemove.contains(index)) {
            builder.append(c)
        }
    }

    return builder.toString()
}

fun main(args: Array<String>) {
    println(minRemoveToMakeValid("lee(t(c)o)de)"))
    println(minRemoveToMakeValid("a)b(c)d"))
    println(minRemoveToMakeValid("))(("))
}

