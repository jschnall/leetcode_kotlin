package string

import kotlin.test.assertEquals
import kotlin.test.assertTrue

fun main(args: Array<String>) {
    println(customSortString("cba", "abcd"))
    println(customSortString("cbafg", "abcd"))
    println(customSortString("cba", "aaabbcd"))
}

// 791. Custom Sort String
fun customSortString(order: String, s: String): String {
    val used = mutableSetOf<Int>()
    val result = StringBuilder()

    var counts = IntArray(26)
    s.forEach { c ->
        counts[c - 'a']++
    }

    order.forEach { c ->
        val index = c - 'a'
        for (i in 0 until counts[c - 'a']) {
            result.append(c)
        }
        used.add(index)
    }

    counts.forEachIndexed { index, count ->
        if (!used.contains(index)) {
            val c = ('a' + index).toChar()

            for (i in 0 until count) {
                result.append(c)
            }
        }
    }

    return result.toString()
}