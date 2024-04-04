package blackjack

import java.util.*

// Deck of 52 cards 4 suits, 13 ranks

class Card(val suit: Int, val rank: Int) {
    override fun toString(): String {
        return "${rankToStr()}${suitToChar()}"
    }

    private fun rankToStr(): String {
        return when(rank) {
            1 -> "A"
            11 -> "J"
            12 -> "Q"
            13 -> "K"
            else -> rank.toString()
        }
    }

    private fun suitToChar(): Char {
       return when(suit) {
           SPADES -> '♤'
           CLUBS -> '♧'
           DIAMONDS -> '♢'
           HEARTS -> '♡'
           else -> throw Exception("Invalid value for suit.")
        }
    }

    companion object {
        // Suit
        const val SPADES = 0
        const val CLUBS = 1
        const val DIAMONDS = 2
        const val HEARTS = 3
    }
}

class Deck {
    private val cards: MutableList<Card>

    init {
        val c = mutableListOf<Card>()

        for (j in 0 until 4) {
            for (i in 1 .. 13) {
                c.add(Card(j, i))
            }
        }

        cards = c
    }

    fun shuffle() {
        cards.shuffle()
    }

    fun nextCard(): Card {
        val card = cards.first()
        cards.removeAt(0)

        return card
    }
}

class Game {
    private val deck = Deck()
    private val playerHand = mutableListOf<Card>()
    private val dealerHand = mutableListOf<Card>()

    fun play() {
        newRound()
        printHands()
        printWinner()
    }

    private fun newRound() {
        playerHand.clear()
        dealerHand.clear()
        deck.shuffle()
        playerHand.add(deck.nextCard())
        dealerHand.add(deck.nextCard())
        playerHand.add(deck.nextCard())
        dealerHand.add(deck.nextCard())
    }

    // -1: dealer won
    //  0: draw
    //  1: player won
    private fun getWinner(): Int  {
        val dealerScore = getScore(dealerHand)
        val playerScore = getScore(playerHand)

        if (playerScore > dealerScore) {
            return 1
        }
        if (playerScore < dealerScore) {
            return -1
        }

        return 0
    }

    // If score <= 21, return score, else -1
    private fun getScore(hand: List<Card>): Int {
        var scores = mutableSetOf<Int>()

        if (hand[0].rank == 1) {
            scores.add(1)
            scores.add(11)
        } else if (hand[0].rank >= 10) {
            scores.add(10)
        } else {
            scores.add(hand[0].rank)
        }

        for (i in 1 until hand.size) {
            val newScores = mutableSetOf<Int>()

            val card = hand[i]
            if (card.rank == 1) {
                scores.forEach { score ->
                    newScores.add(score + 1)
                    newScores.add(score + 11)
                }
            } else if (card.rank >= 10) {
                scores.forEach { score ->
                    newScores.add(score + 10)
                }
            } else {
                scores.forEach { score ->
                    newScores.add(score + card.rank)
                }
            }

            scores = newScores
        }

        val maxHeap = PriorityQueue<Int>(compareByDescending { it })
        maxHeap.addAll(scores)

        while (maxHeap.isNotEmpty() && maxHeap.peek() > 21) {
            maxHeap.remove()
        }

        if (maxHeap.isEmpty()) {
            return -1
        }

        return maxHeap.remove()
    }

    private fun printHands() {
        print("Player: ${playerHand.first()}")
        for (i in 1 until playerHand.size) {
            print(", ${playerHand[i]}")
        }
        println("")

        print("Dealer: ${dealerHand.first()}")
        for (i in 1 until dealerHand.size) {
            print(", ${dealerHand[i]}")
        }
        println("")
    }

    private fun printWinner() {
        when (getWinner()) {
            -1 -> println("Dealer Won")
            0 -> println("Tie")
            1 -> println("Player Won")
        }
    }
}

fun main(args: Array<String>) {
    val game = Game()
    (1 .. 10).forEach { _ ->
        game.play()
        println("")
    }
}




