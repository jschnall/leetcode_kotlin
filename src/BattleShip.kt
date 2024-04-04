// Cruise Interview:
// TODO replace boards with map<Point, Ship>
// Ship(val type: ShipType, val remainingHitPoints: Int)
fun main() {
    val board1 = arrayOf(intArrayOf(0,0,1), intArrayOf(0,0,1), intArrayOf(1,0,0))
    val board2 = arrayOf(intArrayOf(0,1,1), intArrayOf(0,0,0), intArrayOf(0,1,0))
    val guesses1 = mutableSetOf<List<String>>()
    val guesses2 = mutableSetOf<List<String>>()

    var remaining1 = intArrayOf(3)
    var remaining2 = intArrayOf(3)

    var player1Turn = true
    while (true) {
        if (takeTurn(board2, guesses1, remaining1, 1)) return
        if (takeTurn(board1, guesses2, remaining2, 2)) return
    }
}

fun takeTurn(board: Array<IntArray>, guesses: MutableSet<List<String>>, remaining: IntArray, currentPlayer: Int): Boolean {
    println("Player $currentPlayer, it's your turn! Guess a position:")

    var input = readLine() // x y
    var point = input!!.split(' ')

    while (guesses.contains(point)) {
        println("You've already guessed that. Try again:")
        input = readLine()
        point = input!!.split(' ')
    }
    val x = point[0].toInt()
    val y = point[1].toInt()

    guesses.add(point)

    if (attack(board, x, y)) {
        println("Hit")
        board[y][x] = -1
        remaining[0]--
        if (remaining[0] == 0) {
            println("Player 1 Wins")
            return true
        }
    } else {
        println("Miss")
    }

    return false
}

fun attack(board: Array<IntArray>, x: Int, y: Int): Boolean {
    return board[y][x] > 0
}
