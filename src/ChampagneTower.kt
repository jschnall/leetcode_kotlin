import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertTrue

fun main(args: Array<String>) {
    println(champagneTower(1,1,1))
    println(champagneTower(2,1,1))
    println(champagneTower(100000009,33,17))
}

class CTNode(var content: Double = 0.0, val capacity: Double = 1.0) {
    var left: CTNode? = null
    var right: CTNode? = null
}

//799. Champagne Tower
fun champagneTower(poured: Int, queryRow: Int, queryGlass: Int): Double {
    val head = CTNode()
    val target = buildGraph(queryRow, queryGlass, head)

    pour(poured.toDouble(), head)

    return target.content
}

fun buildGraph(rowCount: Int, targetColumn: Int, head: CTNode): CTNode {
    var row = mutableListOf(head)

    for (i in 1 .. rowCount) {
        val newRow = mutableListOf<CTNode>()

        for (j in 0 .. i) {
            newRow.add(CTNode())
        }

        row.forEachIndexed { index, node ->
            node.left = newRow[index]
            node.right = newRow[index + 1]
        }
        row = newRow
    }

    return row[targetColumn]
}

fun pour(amount: Double, node: CTNode) {
    val remainingCapacity = node.capacity - node.content

    if (amount <= remainingCapacity) {
        node.content += amount
    } else {
        node.content = 1.0
        val newAmount = (amount - remainingCapacity) / 2.0
        node.left?.let {
            pour(newAmount, it)
        }
        node.right?.let {
            pour(newAmount, it)
        }
    }
}