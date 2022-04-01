package string

import kotlin.test.assertEquals

// 344. Reverse String
fun reverseString(s: CharArray) {
    for (i in 0 until s.size / 2) {
        swap(s, i, s.size - 1 - i)
    }
}

fun swap(s: CharArray, first: Int, second: Int) {
    val tmp = s[first]
    s[first] = s[second]
    s[second] = tmp
}

// 541. Reverse String II
fun reverseStr(s: String, k: Int): String {
    val a = s.toCharArray()

    for (i in 0 until a.size step 2 * k) {
        val remaining = a.size - i

        if (remaining < k) {
            for (j in i until i + remaining / 2) {
                swap(a, j, (i + remaining) - 1 - (j - i))
            }
        } else {
            for (j in i until i + k / 2) {
                swap(a, j, (i + k) - 1 - (j - i))
            }
        }
    }

    return String(a)
}

fun main(args: Array<String>) {
    assertEquals("abcdefg", reverseStr("abcdefg",1))
    assertEquals("bacdfeg", reverseStr("abcdefg",2))
    assertEquals("cbadefg", reverseStr("abcdefg",3))
    assertEquals("gfedcba", reverseStr("abcdefg",10))

    val str = "abcdefg"
    val chars = str.toCharArray()
    reverseString(chars)
    reverseString(chars)
    assertEquals(str, String(chars))
}