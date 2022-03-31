package mergeintervals

import kotlin.test.assertTrue

fun main(args: Array<String>) {
    assertTrue {
        arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18)) contentDeepEquals
                merge(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)))
    }

    assertTrue {
        arrayOf(intArrayOf(1, 4)) contentDeepEquals
            merge(arrayOf(intArrayOf(1, 4), intArrayOf(2, 3)))
    }
}

// 56. Merge Intervals
fun merge(intervals: Array<IntArray>): Array<IntArray> {
    intervals.sortBy { it.first() }

    val result = mutableListOf<IntArray>()
    var start = intervals[0].first()
    var end = intervals[0].last()

    for (i in 1 until intervals.size) {
        val interval = intervals[i]

        if (interval.first() <= end) {
            end = end.coerceAtLeast(interval.last())
        } else {
            result.add(intArrayOf(start, end))
            start = interval.first()
            end = interval.last()
        }
    }
    result.add(intArrayOf(start, end))

    return result.toTypedArray()
}

// 57. Insert Interval
fun insertEasy(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
    return merge(arrayOf(*intervals, newInterval))
}

