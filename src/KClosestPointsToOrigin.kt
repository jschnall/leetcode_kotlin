import java.util.*
import kotlin.math.sqrt

// 973. K Closest Points to Origin
fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
    val maxHeap: Queue<Pair<IntArray, Double>> = PriorityQueue(compareByDescending { it.second })

    points.forEach { point ->
        maxHeap.add(Pair(point, distance(point)))
        if (maxHeap.size > k) {
            maxHeap.remove()
        }
    }
    return maxHeap.map { it.first }.toTypedArray()
}

fun distance(point: IntArray): Double {
    return sqrt((point[0] * point[0]).toDouble() + (point[1] * point[1]).toDouble())
}