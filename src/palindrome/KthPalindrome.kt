package palindrome

import java.math.BigInteger

// 2217. Find Palindrome With Fixed Length
// Given an integer array queries and a positive integer intLength, return an array answer where answer[i] is either the
// queries[i]th smallest positive palindrome of length intLength or -1 if no such palindrome exists.
// A palindrome is a number that reads the same backwards and forwards. Palindromes cannot have leading zeros.
fun kthPalindrome(queries: IntArray, intLength: Int): LongArray {
    var result = LongArray(queries.size)
    var max = BigInteger.valueOf(10).pow((intLength + 1) / 2 - 1).toLong() * 9
    //println("${max}")

    for (i in queries.indices) {
        var query = queries[i]

        if (query > max) {
            result[i] = -1L
            continue
        }

        query -= 1

        var sb = StringBuilder()
        sb.append(1)
        for (i in 0 until (intLength - 1) / 2) {
            sb.append(0)
        }

        var index = 0
        val end = (intLength - 1) / 2
        while (query > 0) {
            val nextDigit = query % 10
            sb.setCharAt(end - index, Character.forDigit(Character.digit(sb[end - index], 10) + nextDigit, 10))
            query /= 10
            index++
        }

        if (intLength % 2 == 0) {
            for (i in sb.length - 1 downTo 0) {
                sb.append(sb[i])
            }
        } else {
            for (i in sb.length - 2 downTo 0) {
                sb.append(sb[i])
            }
        }

        result[i] = sb.toString().toLong()
    }

    return result
}

fun main(args: Array<String>) {
    println(kthPalindrome(intArrayOf(1,2,3,4,5,90,91),1).contentToString())
    println(kthPalindrome(intArrayOf(1,2,3,4,5,90,91),2).contentToString())
    println(kthPalindrome(intArrayOf(1,2,3,4,5,90,91),3).contentToString())
    println(kthPalindrome(intArrayOf(2,4,6),4).contentToString())
    println(kthPalindrome(intArrayOf(1,2,3,4,5,90,91),5).contentToString())
}