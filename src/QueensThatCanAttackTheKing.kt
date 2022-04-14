import kotlin.test.assertEquals

// 1222. Queens That Can Attack the King
fun queensAttacktheKing(queens: Array<IntArray>, king: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val board = Array<CharArray>(8) { CharArray(8) {'.'} }

    // initBoard
    queens.forEach { queen ->
        board[queen[0]][queen[1]] = 'Q'
    }
    board.forEach {
        println(it)
    }

    // Search vertical
    for (i in king[0] - 1 downTo 0) {
        if (board[i][king[1]] == 'Q') {
            result.add(listOf(i, king[1]))
            break
        }
    }

    for (i in king[0] + 1 until 8) {
        if (board[i][king[1]] == 'Q') {
            result.add(listOf(i, king[1]))
            break
        }
    }

    // search horizontal
    for (j in king[1] - 1 downTo 0) {
        if (board[king[0]][j] == 'Q') {
            result.add(listOf(king[0], j))
            break
        }
    }

    for (j in king[1] + 1 until 8) {
        if (board[king[0]][j] == 'Q') {
            result.add(listOf(king[0], j))
            break
        }
    }

    // Diagonals
    var j = 1
    for (i in king[0] - 1 downTo 0) {
        if (king[1] - j < 0) break
        if (board[i][king[1] - j] == 'Q') {
            result.add(listOf(i, king[1] - j))
            break
        }
        j++
    }

    j = 1
    for (i in king[0] - 1 downTo 0) {
        if (king[1] + j > 7) break
        if (board[i][king[1] + j] == 'Q') {
            result.add(listOf(i, king[1] + j))
            break
        }
        j++
    }

    j = 1
    for (i in king[0] + 1 until 8) {
        if (king[1] - j < 0) break
        if (board[i][king[1] - j] == 'Q') {
            result.add(listOf(i, king[1] - j))
            break
        }
        j++
    }

    j = 1
    for (i in king[0] + 1 until 8) {
        if (king[1] + j > 7) break
        if (board[i][king[1] + j] == 'Q') {
            result.add(listOf(i, king[1] + j))
            break
        }
        j++
    }

    return result
}