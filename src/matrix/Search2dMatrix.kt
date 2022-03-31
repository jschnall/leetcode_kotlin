package matrix

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    val result = matrix.asList().binarySearchBy(target) { it[0] }
    if (result == -1) {
        return false
    }
    if (result < 0) {
        return (matrix[-result - 2]).binarySearch(target) > 0
    }
    return true
}

// O(n log n)
fun searchMatrix2(matrix: Array<IntArray>, target: Int): Boolean {
    matrix.forEach { row ->
        if (row.binarySearch(target) >= 0) {
            return true
        }
    }

    return false
}

fun main(args: Array<String>) {
    var index = 1
    val a = Array<IntArray>(5) { IntArray(5) {index++ } }
    a.forEach { println(it.contentToString()) }

    println(searchMatrix(a, 0))
    println(searchMatrix(a, 16))
    println(searchMatrix(a, 15))
    println(searchMatrix(a, 26))
}