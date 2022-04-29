package graph

import java.util.*
import kotlin.test.assertEquals

fun isBipartite(graph: Array<IntArray>): Boolean {
    val visited = mutableSetOf<Int>()
    for (i in graph.indices) {
        if (!visited.contains(i) && !canColor(graph, i, visited)) {
            return false
        }
    }
    return true
}

private fun canColor(graph: Array<IntArray>, index: Int, visited: MutableSet<Int>): Boolean {
    val map = mutableMapOf<Int, Boolean>()
    val queue: Queue<Int> = LinkedList()

    queue.add(index)
    visited.add(index)
    map[index] = false

    while (queue.isNotEmpty()) {
        val vertex = queue.remove()
        val neighbors = graph[vertex]

        neighbors.forEach { neighbor ->
            if (map[neighbor] == map[vertex]) {
                return false
            }
            if (!visited.contains(neighbor)) {
                visited.add(neighbor)
                map[neighbor] = !map[vertex]!!
                queue.add(neighbor)
            }
        }
    }

    return true
}

fun main(args: Array<String>) {
    assertEquals(false, isBipartite(arrayOf(intArrayOf(1,2,3),intArrayOf(0,2),intArrayOf(0,1,3),intArrayOf(0,2))))
    assertEquals(true, isBipartite(arrayOf(intArrayOf(1,3),intArrayOf(0,2),intArrayOf(1,3),intArrayOf(0,2))))
}