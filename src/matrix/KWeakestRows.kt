package matrix

import java.util.*

//1337. The K Weakest Rows in a Matrix
fun kWeakestRows2(mat: Array<IntArray>, k: Int): IntArray {
    val heap = PriorityQueue<Pair<Int, Int>>(compareBy<Pair<Int, Int>> { it.second }.thenBy { it.first })

    mat.forEachIndexed { index, row ->
        heap.add(Pair(index, row.count { it == 1 }))
    }

    return IntArray(k) { heap.remove().first }
}

fun kWeakestRows3(mat: Array<IntArray>, k: Int): IntArray {
    val list = mutableListOf<Int>()
    val used = mutableSetOf<Int>()

    for (j in mat[0].size - 1 downTo 0) {
        for (i in mat.size - 1 downTo 0) {
            if (mat[i][j] == 1 && !used.contains(i)) {
                list.add(0, i)
                used.add(i)
            }
        }
    }
    for (i in mat.size - 1 downTo 0) {
        if (mat[i][0] == 0) {
            list.add(0, i)
        }
    }

    return IntArray(k) { i -> list[i] }
}

fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
    val circularQueue = IntArray(k)
    var start = k
    val used = mutableSetOf<Int>()

    for (j in mat[0].size - 1 downTo 0) {
        for (i in mat.size - 1 downTo 0) {
            if (mat[i][j] == 1 && !used.contains(i)) {
                if (start == 0) start = k - 1 else start--
                circularQueue[start] = i
                used.add(i)
            }
        }
    }
    for (i in mat.size - 1 downTo 0) {
        if (mat[i][0] == 0) {
            if (start == 0) start = k - 1 else start--
            circularQueue[start] = i
        }
    }

    return IntArray(k) { i -> circularQueue[(start + i) % k] }
}