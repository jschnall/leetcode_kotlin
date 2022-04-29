package pathfinding

import java.util.*
import kotlin.test.assertEquals

class PathWithMinimumEffort {
    fun minimumEffortPath(heights: Array<IntArray>): Int {
        var max = Integer.MIN_VALUE
        var min = Integer.MAX_VALUE
        heights.forEach { row ->
            row.forEach {
                max = maxOf(max, it)
                min = minOf(min, it)
            }
        }

        var minEffort = Integer.MAX_VALUE
        var start = 0
        var end = max - min

        while (start <= end) {
            val mid = start + (end - start) / 2

            val result = dfs(heights, Pair(0,0), Pair(heights.size - 1, heights[0].size - 1), mid)
            if (result < 0) {
                start = mid + 1
            } else {
                minEffort = minOf(minEffort, result)
                end = mid - 1
            }
        }

        return minEffort
    }

    private fun dfs(heights: Array<IntArray>, start: Pair<Int, Int>, end: Pair<Int, Int>, threshold: Int): Int {
        val visited = mutableSetOf<Pair<Int, Int>>()
        val stack = Stack<Pair<Int, Int>>()
        stack.push(start)
        visited.add(start)

        while (stack.isNotEmpty()) {
            val cell = stack.pop()
            if (cell == end) {
                return threshold
            }

            val neighbors = getNeighbors(cell, heights)
            neighbors.forEach {
                if (!visited.contains(it) && Math.abs(heights[it.first][it.second] - heights[cell.first][cell.second]) <= threshold) {
                    stack.push(it)
                    visited.add(it)
                }
            }
        }

        return -1
    }

    private fun getNeighbors(cell: Pair<Int, Int>, heights: Array<IntArray>): List<Pair<Int, Int>> {
        val result = mutableListOf<Pair<Int, Int>>()

        if (cell.first > 0 ) {
            result.add(Pair(cell.first - 1, cell.second))
        }
        if (cell.first < heights.size - 1) {
            result.add(Pair(cell.first + 1, cell.second))
        }
        if (cell.second > 0) {
            result.add(Pair(cell.first, cell.second - 1))
        }
        if (cell.second < heights[0].size - 1) {
            result.add(Pair(cell.first, cell.second + 1))
        }

        return result
    }
}

fun main(args: Array<String>) {
    val solver = PathWithMinimumEffort()
    assertEquals(1, solver.minimumEffortPath(arrayOf(intArrayOf(1,2,3),intArrayOf(3,8,4),intArrayOf(5,3,5))))
    assertEquals(0, solver.minimumEffortPath(arrayOf(intArrayOf(1,2,1,1,1),intArrayOf(1,2,1,2,1),intArrayOf(1,2,1,2,1),intArrayOf(1,2,1,2,1),intArrayOf(1,1,1,2,1))))
}