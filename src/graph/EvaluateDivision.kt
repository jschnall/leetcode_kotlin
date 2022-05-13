package graph

import java.util.*

class Node(var data: String, val neighbors: MutableSet<Edge> = mutableSetOf())
class Edge(val start: Node, val end: Node, val cost: Double)

// 399. Evaluate Division
fun calcEquation(equations: List<List<String>>, values: DoubleArray, queries: List<List<String>>): DoubleArray {
    val graph = mutableMapOf<String, Node>()

    // Build graph
    for (i in equations.indices) {
        val a = graph.getOrDefault(equations[i][0], Node(equations[i][0]))
        val b = graph.getOrDefault(equations[i][1], Node(equations[i][1]))

        a.neighbors.add(Edge(a, b, values[i]))
        b.neighbors.add(Edge(b, a, 1.0 / values[i]))

        graph[equations[i][0]] = a
        graph[equations[i][1]] = b
    }

    val result = DoubleArray(queries.size) { -1.0 }

    for (j in queries.indices) {
        val query = queries[j]
        val c = graph[query[0]] ?: continue
        val d = graph[query[1]] ?: continue

        // DFS to find totalCost of path from c to d
        val stack = Stack<Node>()
        val visited = mutableSetOf<String>()
        val totalCosts = mutableMapOf<String, Double>()

        stack.push(c)
        visited.add(c.data)
        totalCosts[c.data] = 1.0

        while (stack.isNotEmpty()) {
            val node = stack.pop()

            if (node.data == d.data) {
                result[j] = totalCosts[node.data]!!
                break
            }
            node.neighbors.forEach { edge ->
                val neighbor = edge.end
                if (!visited.contains(neighbor.data)) {
                    stack.push(neighbor)
                    visited.add(neighbor.data)
                    totalCosts[neighbor.data] = totalCosts[node.data]!! * edge.cost
                }
            }
        }
    }

    return result
}