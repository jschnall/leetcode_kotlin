// 1275. Find Winner on a Tic Tac Toe Game
fun tictactoe(moves: Array<IntArray>): String {
    val board = Array<CharArray>(3) { CharArray(3) {' '} }
    var isO = false

    moves.forEach { move ->
        board[move[0]][move[1]] = if (isO) 'O' else 'X'
        isO = !isO
    }

    // rows
    for (i in board.indices) {
        var xCount = 0
        var oCount = 0
        for (j in board[0].indices) {
            if (board[i][j] == 'X') {
                xCount++
            } else if (board[i][j] == 'O') {
                oCount++
            }
        }
        if (xCount == 3) {
            return "A"
        }
        if (oCount == 3) {
            return "B"
        }
    }

    // columns
    for (j in board[0].indices) {
        var xCount = 0
        var oCount = 0
        for (i in board.indices) {
            if (board[i][j] == 'X') {
                xCount++
            } else if (board[i][j] == 'O') {
                oCount++
            }
        }
        if (xCount == 3) {
            return "A"
        }
        if (oCount == 3) {
            return "B"
        }
    }

    // diagonals
    for (i in board.indices) {
        var xCount = 0
        var oCount = 0
        for (i in board.indices) {
            if (board[i][i] == 'X') {
                xCount++
            } else if (board[i][i] == 'O') {
                oCount++
            }
        }
        if (xCount == 3) {
            return "A"
        }
        if (oCount == 3) {
            return "B"
        }
    }

    for (i in board.indices) {
        var xCount = 0
        var oCount = 0
        for (i in board.indices) {
            if (board[i][board.size - 1 - i] == 'X') {
                xCount++
            } else if (board[i][board.size - 1 - i] == 'O') {
                oCount++
            }
        }
        if (xCount == 3) {
            return "A"
        }
        if (oCount == 3) {
            return "B"
        }
    }

    if (moves.size == 9) {
        return "Draw"
    }
    return "Pending"
}