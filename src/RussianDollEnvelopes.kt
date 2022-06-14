import kotlin.Comparator
import kotlin.test.assertEquals

// 354. Russian Doll Envelopes
fun maxEnvelopes(envelopes: Array<IntArray>): Int {
    var result = 1
    val counts = Array(envelopes.size) { 1 }
    envelopes.sortWith(compareBy<IntArray> { it[0] }.thenBy { it[1] })

    for (i in 1 until envelopes.size) {
        val envelope = envelopes[envelopes.size - 1 - i]

        var index = envelopes.binarySearch(
            element = envelope,
            comparator = object: Comparator<IntArray> {
                override fun compare(i1: IntArray, i2: IntArray): Int {
                    if (i1[0] - i2[0] + 1 == 0) {
                        return (i1[1] - i2[1] + 1)
                    }
                    return i1[0] - i2[0] + 1
                }
            },
            fromIndex = envelopes.size - 1 - i,
            toIndex = envelopes.size)

        if (index < 0) {
            index = -index - 1
        }

        var max = 0
        for (j in index until envelopes.size) {
            if (envelopes[j][0] > envelope[0] && envelopes[j][1] > envelope[1]) {
                max = maxOf(max, counts[j])
            }
        }

        counts[envelopes.size - 1 - i] = max + 1
        result = maxOf(result, counts[envelopes.size - 1 - i])
    }
    return result
}

fun main(args: Array<String>) {
    assertEquals(3, maxEnvelopes(arrayOf(intArrayOf(5,4), intArrayOf(6,4), intArrayOf(6,7), intArrayOf(2,3))))
    assertEquals(1, maxEnvelopes(arrayOf(intArrayOf(1,1), intArrayOf(1,1), intArrayOf(1,1))))
    assertEquals(1, maxEnvelopes(arrayOf(intArrayOf(1,1))))
    assertEquals(4, maxEnvelopes(arrayOf(intArrayOf(4,5), intArrayOf(4,6), intArrayOf(6,7), intArrayOf(2,3), intArrayOf(1,1))))
    assertEquals(7, maxEnvelopes(arrayOf(intArrayOf(1,2), intArrayOf(2,3), intArrayOf(3,4), intArrayOf(4,5), intArrayOf(5,5),intArrayOf(5,6),intArrayOf(6,7),intArrayOf(7,8))))
}