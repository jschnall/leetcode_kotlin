package string

import java.util.*
import kotlin.test.assertEquals

//1202. Smallest String With Swaps
fun smallestStringWithSwaps(s: String, pairs: List<List<Int>>): String {
    val connectedGroups = buildConnectedGroups(pairs)

    val result = s.toCharArray()
    connectedGroups.forEach { set ->
        val minHeap = PriorityQueue<Char>()
        set.forEach { index ->
            minHeap.add(s[index])
        }
        set.sorted().forEach { index ->
            result[index] = minHeap.remove()
        }
    }
    //println(sets)

    return String(result)
}

fun buildConnectedGroups(pairs: List<List<Int>>): Set<Set<Int>> {
    val connectedGroups = mutableSetOf<Set<Int>>()
    val map = mutableMapOf<Int, Node>()

    pairs.forEach { pair ->
        var node = map.getOrDefault(pair[0], Node(pair[0]))
        node.neighbors.add(pair[1])
        map[pair[0]] = node

        node = map.getOrDefault(pair[1], Node(pair[1]))
        node.neighbors.add(pair[0])
        map[pair[1]] = node
    }

    // BFS
    val allVisited = mutableSetOf<Int>()
    map.values.forEach { node ->
        if (!allVisited.contains(node.data)) {
            val group = mutableSetOf<Int>()
            val queue: Queue<Node> = LinkedList()

            queue.add(node)
            allVisited.add(node.data)

            while (queue.isNotEmpty()) {
                val current = queue.remove()
                group.add(current.data)
                current.neighbors.forEach { neighbor ->
                    if (!allVisited.contains(neighbor)) {
                        queue.add(map[neighbor])
                        allVisited.add(neighbor)
                    }
                }
            }
            connectedGroups.add(group)
        }
    }

    return connectedGroups
}

class Node(var data: Int, val neighbors: MutableList<Int> = mutableListOf())

fun main(args: Array<String>) {
}