package matrix

// 64. Minimum Path Sum
fun minPathSum(grid: Array<IntArray>): Int {
    grid.forEachIndexed { i, row ->
        row.forEachIndexed { j, _ ->
            if (i - 1 >= 0 && j - 1 >= 0) {
                grid[i][j] += minOf(grid[i - 1][j], grid[i][j - 1])
            } else if (i - 1 >= 0) {
                grid[i][j] += grid[i - 1][j]
            } else if (j - 1 >= 0) {
                grid[i][j] += grid[i][j - 1]
            }
        }
    }
    return grid[grid.size - 1][grid[0].size - 1]
}

// 931. Minimum Falling Path Sum
fun minFallingPathSum(matrix: Array<IntArray>): Int {
    matrix.forEachIndexed { i, row ->
        row.forEachIndexed { j, _ ->
            if (i - 1 >= 0) {
                var pathSum = matrix[i - 1][j]

                if (j - 1 >= 0) {
                    pathSum = minOf(pathSum, matrix[i - 1][j - 1])
                }
                if (j + 1 < matrix[0].size) {
                    pathSum = minOf(pathSum, matrix[i - 1][j + 1])
                }
                matrix[i][j] += pathSum
            }
        }
    }

    return matrix[matrix.size - 1].minOrNull() ?: Int.MAX_VALUE
}

fun main(args: Array<String>) {
    println(minPathSum(arrayOf(intArrayOf(2,1,3), intArrayOf(6,5,4), intArrayOf(7,8,9))))
    println(minFallingPathSum(arrayOf(intArrayOf(2,1,3), intArrayOf(6,5,4), intArrayOf(7,8,9))))
}