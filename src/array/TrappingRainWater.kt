package array

import java.util.*
import kotlin.test.assertEquals

//42. Trapping Rain Water
fun trap(height: IntArray): Int {
    var result = 0
    val maxLeftOf = IntArray(height.size)
    val maxRightOf = IntArray(height.size)

    var maxLeft = 0
    var maxRight = 0
    for (i in height.indices) {
        maxLeftOf[i] = maxLeft
        maxLeft = maxOf(maxLeft, height[i])

        maxRightOf[height.size - 1 - i] = maxRight
        maxRight = maxOf(maxRight, height[height.size - 1 - i])
    }

    for (i in height.indices) {
        val height = minOf(maxLeftOf[i], maxRightOf[i]) - height[i]
        //println("$i: $height")
        if (height > 0) {
            result += height
        }
    }

    return result
}

//407. Trapping Rain Water II
fun trapRainWater(heightMap: Array<IntArray>): Int {
    var result = 0
    val used = mutableSetOf<Pair<Int, Int>>()
    val borderSet = mutableSetOf<Pair<Int, Int>>()
    val minHeap = PriorityQueue<Pair<Int, Int>>(compareBy { heightMap[it.first][it.second] })
    for (j in heightMap.indices) {
        for (i in heightMap[0].indices) {
            minHeap.add(Pair(j, i))
        }
    }

    while (minHeap.isNotEmpty()) {
        val pair = minHeap.remove()
        //println(heightMap[pair.first][pair.second])
        if (used.contains(pair)) {
            continue
        }
        val neighbors = findEqualOrLower(heightMap, pair, borderSet)
        if (neighbors.isNotEmpty()) {
            val height = heightMap[pair.first][pair.second]
            val minHigher = findMinHigher(heightMap, neighbors, height)
            //println("$height, $minHigher")
            neighbors.forEach { pair ->
                result += minHigher - height
                used.add(pair)
            }
        }
    }
    return result
}

fun findMinHigher(heightMap: Array<IntArray>, set: Set<Pair<Int, Int>>, height: Int): Int {
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.addAll(set)
    var min = Int.MAX_VALUE
    while (queue.isNotEmpty()) {
        val pair = queue.remove()

        if (heightMap[pair.first - 1][pair.second] > height) {
            min = minOf(min, heightMap[pair.first - 1][pair.second])
        }
        if (heightMap[pair.first][pair.second - 1] > height) {
            min = minOf(min, heightMap[pair.first][pair.second - 1])
        }
        if (heightMap[pair.first + 1][pair.second] > height) {
            min = minOf(min, heightMap[pair.first + 1][pair.second])
        }
        if (heightMap[pair.first][pair.second + 1] > height) {
            min = minOf(min, heightMap[pair.first][pair.second + 1])
        }
    }

    return min
}

fun findEqualOrLower(heightMap: Array<IntArray>, start: Pair<Int, Int>, borderSet: MutableSet<Pair<Int, Int>>): Set<Pair<Int, Int>> {
    val neighbors = mutableSetOf<Pair<Int, Int>>()
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.add(start)
    neighbors.add(start)
    while (queue.isNotEmpty()) {
        val pair = queue.remove()

        if (pair.first == 0 || pair.second == 0 || pair.first == heightMap.size - 1 || pair.second == heightMap[0].size - 1 || borderSet.contains(pair)) {
            borderSet.addAll(neighbors)
            return emptySet()
        }

        if (heightMap[pair.first - 1][pair.second] <= heightMap[start.first][start.second]) {
            val topNeighbor = Pair(pair.first - 1, pair.second)
            if (!neighbors.contains(topNeighbor)) {
                queue.add(topNeighbor)
                neighbors.add(topNeighbor)
            }
        }
        if (heightMap[pair.first][pair.second - 1] <= heightMap[start.first][start.second]) {
            val leftNeighbor = Pair(pair.first, pair.second - 1)
            if (!neighbors.contains(leftNeighbor)) {
                queue.add(leftNeighbor)
                neighbors.add(leftNeighbor)
            }
        }
        if (heightMap[pair.first + 1][pair.second] <= heightMap[start.first][start.second]) {
            val bottomNeighbor = Pair(pair.first + 1, pair.second)
            if (!neighbors.contains(bottomNeighbor)) {
                queue.add(bottomNeighbor)
                neighbors.add(bottomNeighbor)
            }
        }
        if (heightMap[pair.first][pair.second + 1] <= heightMap[start.first][start.second]) {
            val rightNeighbor = Pair(pair.first, pair.second + 1)
            if (!neighbors.contains(rightNeighbor)) {
                queue.add(rightNeighbor)
                neighbors.add(rightNeighbor)
            }
        }
    }

    return neighbors
}

fun main(args: Array<String>) {
    val startTime = System.currentTimeMillis()
    assertEquals(6, trap(intArrayOf(0,1,0,2,1,0,1,3,2,1,2,1)))
    assertEquals(4, trapRainWater(arrayOf(intArrayOf(1,4,3,1,3,2), intArrayOf(3,2,1,3,2,4), intArrayOf(2,3,3,2,3,1))))
    assertEquals(10, trapRainWater(arrayOf(intArrayOf(3,3,3,3,3), intArrayOf(3,2,2,2,3), intArrayOf(3,2,1,2,3), intArrayOf(3,2,2,2,3), intArrayOf(3,3,3,3,3))))
    assertEquals(14, trapRainWater(arrayOf(intArrayOf(12,13,1,12), intArrayOf(13,4,13,12), intArrayOf(13,8,10,12), intArrayOf(12,13,12,12), intArrayOf(13,13,13,13))))
    assertEquals(12, trapRainWater(arrayOf(intArrayOf(5,8,7,7), intArrayOf(5,2,1,5), intArrayOf(7,1,7,1), intArrayOf(8,9,6,9), intArrayOf(9,8,9,9))))
    assertEquals(44, trapRainWater(arrayOf(intArrayOf(78,16,94,36), intArrayOf(87,93,50,22), intArrayOf(63,28,91,60), intArrayOf(64,27,41,27), intArrayOf(73,37,12,69), intArrayOf(68,30,83,31), intArrayOf(63,24,68,36))))
    println("${System.currentTimeMillis() - startTime} ms")
}