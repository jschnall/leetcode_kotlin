import java.util.*

class GraphNode(var `val`: Int) {
    var neighbors: ArrayList<GraphNode?> = ArrayList<GraphNode?>()
}

//133. Clone Graph
fun main(args: Array<String>) {

}

fun cloneGraphIter(node: GraphNode?): GraphNode? {
    if (node == null) {
        return null
    }

    val graph = mutableMapOf<GraphNode, GraphNode>() // map old GraphNodes to their new counterpart
    var oldQueue: Queue<GraphNode> = LinkedList()
    val newQueue: Queue<GraphNode> = LinkedList()

    val result = GraphNode(node.`val`)
    graph[node] = result
    newQueue.add(result)
    oldQueue.add(node)

    while (oldQueue.isNotEmpty()) {
        val oldNode = oldQueue.remove()
        val newNode = newQueue.remove()

        oldNode.neighbors.forEach {
            it?.let { neighbor ->
                graph[neighbor]?.let {
                    newNode.neighbors.add(neighbor)
                } ?: run {
                    val n = GraphNode(neighbor.`val`)
                    graph[neighbor] = n
                    newNode.neighbors.add(neighbor)
                    newQueue.add(n)
                    oldQueue.add(neighbor)
                }
            }
        }
    }

    return result
}

fun cloneGraph(node: GraphNode?): GraphNode? {
    if (node == null) {
        return null
    }
    val graph = mutableMapOf<GraphNode, GraphNode>() // map old GraphNodes to their new counterpart
    val result = GraphNode(node.`val`)
    graph[node] = result

    recCloneGraph(node, result, graph)

    return result
}

fun recCloneGraph(oldNode: GraphNode, newNode: GraphNode, graph: MutableMap<GraphNode, GraphNode>) {
    oldNode.neighbors.forEach {
        it?.let { neighbor ->
            graph[neighbor]?.let { value ->
                newNode.neighbors.add(value)
            } ?: run {
                val n = GraphNode(neighbor.`val`)
                graph[neighbor] = n
                newNode.neighbors.add(n)
                recCloneGraph(neighbor, n, graph)
            }
        }
    }
}
