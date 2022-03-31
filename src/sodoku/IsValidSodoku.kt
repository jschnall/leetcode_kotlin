package sodoku

fun isValidSudoku(board: Array<CharArray>): Boolean {
    var set = mutableSetOf<Char>()

    // validate rows
    board.forEach { row ->
        set.clear()
        row.forEach { digit ->
            if (set.contains(digit)) {
                return false
            }
            if (digit != '.') {
                set.add(digit)
            }
        }
    }

    // validate columns
    for (col in 0 until board[0].size) {
        set.clear()
        for (row in 0 until board.size) {
            val digit = board[row][col]

            if (set.contains(digit)) {
                return false
            }
            if (digit != '.') {
                set.add(digit)
            }
        }
    }

    // validate squares
    set.clear()
    for (row in 0 until 3) {
        for (col in 0 until 3) {
            val digit = board[row][col]

            if (set.contains(digit)) {
                return false
            }
            if (digit != '.') {
                set.add(digit)
            }
        }
    }

    set.clear()
    for (row in 0 until 3) {
        for (col in 3 until 6) {
            val digit = board[row][col]
            if (set.contains(digit)) {
                return false
            }
            if (digit != '.') {
                set.add(digit)
            }
        }
    }

    set.clear()
    for (row in 0 until 3) {
        for (col in 6 until 9) {
            val digit = board[row][col]

            if (set.contains(digit)) {
                return false
            }
            if (digit != '.') {
                set.add(digit)
            }
        }
    }

    set.clear()
    for (row in 3 until 6) {
        for (col in 0 until 3) {
            val digit = board[row][col]

            if (set.contains(digit)) {
                return false
            }
            if (digit != '.') {
                set.add(digit)
            }
        }
    }

    set.clear()
    for (row in 3 until 6) {
        for (col in 3 until 6) {
            val digit = board[row][col]

            if (set.contains(digit)) {
                return false
            }
            if (digit != '.') {
                set.add(digit)
            }
        }
    }

    set.clear()
    for (row in 3 until 6) {
        for (col in 6 until 9) {
            val digit = board[row][col]

            if (set.contains(digit)) {
                return false
            }
            if (digit != '.') {
                set.add(digit)
            }
        }
    }

    set.clear()
    for (row in 6 until 9) {
        for (col in 0 until 3) {
            val digit = board[row][col]

            if (set.contains(digit)) {
                return false
            }
            if (digit != '.') {
                set.add(digit)
            }
        }
    }

    set.clear()
    for (row in 6 until 9) {
        for (col in 3 until 6) {
            val digit = board[row][col]

            if (set.contains(digit)) {
                return false
            }
            if (digit != '.') {
                set.add(digit)
            }
        }
    }

    set.clear()
    for (row in 6 until 9) {
        for (col in 6 until 9) {
            val digit = board[row][col]

            if (set.contains(digit)) {
                return false
            }
            if (digit != '.') {
                set.add(digit)
            }
        }
    }

    return true
}

