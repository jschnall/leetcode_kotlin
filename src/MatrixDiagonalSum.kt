// 1572. Matrix Diagonal Sum
fun diagonalSum(mat: Array<IntArray>): Int {
    if (mat.size == 1) {
        return mat[0][0]
    }

    var result = 0

    for (i in 0 until mat.size) {
        result += mat[i][i]
        result += mat[mat.size - 1 - i][i]
    }

    if (mat.size % 2 != 0) {
        val mid = mat.size/2
        result -= mat[mid][mid]
    }

    return result
}