package string

const val MAX_WORD_LENGTH = 16
const val MIN_WORD_LENGTH = 1

fun longestStrChain(words: Array<String>): Int {
    val lenToWords = words.groupBy { it.length }
    val chainLens = words.associateWith { 1 }.toMutableMap()
    //val chainLens = words.map { it to 1 }.toMap().toMutableMap()

    var longWords: List<String>? = null
    for (i in MAX_WORD_LENGTH downTo MIN_WORD_LENGTH) {
        val shortWords = lenToWords[i]
        if (shortWords != null && longWords != null) {
            shortWords.forEach { shortWord ->
                for(longWord in longWords!!) {
                    if (isPredecessor(shortWord, longWord)) {
                        chainLens[shortWord] = chainLens[shortWord]!! + chainLens[longWord]!!
                        break
                    }
                }
            }
        }
        longWords = shortWords
    }

    return chainLens.maxOf { it.value }
}

fun isPredecessor(shortWord: String, longWord: String): Boolean {
    val frequency = longWord.groupingBy { it }.eachCount()
    shortWord.forEach { c ->
        if (frequency.getOrDefault(c, 0) <= 0) {
            return false
        }
    }

    return true
}

class Solution {
    fun longestStrChain(words: Array<String>): Int {
        val lenToWords = words.groupBy { it.length }
        val chainLens = words.map { it to 1 }.toMap().toMutableMap()

        var longWords: List<String>? = null
        for (i in MAX_WORD_LENGTH downTo MIN_WORD_LENGTH) {
            val shortWords = lenToWords[i]
            if (shortWords != null && longWords != null) {
                shortWords.forEach { shortWord ->
                    for(longWord in longWords!!) {
                        if (isPredecessor(shortWord, longWord)) {
                            chainLens[shortWord] = chainLens[shortWord]!! + chainLens[longWord]!!
                            break
                        }
                    }
                }
            }
            longWords = shortWords
        }

        var max = 1
        chainLens.values.forEach {
            max = maxOf(max, it)
        }

        return max
    }

    fun isPredecessor(shortWord: String, longWord: String): Boolean {
        var skipped = false

        var shortIndex = 0
        var longIndex = 0

        while (shortIndex < shortWord.length) {
            if (shortWord[shortIndex] != longWord[longIndex]) {
                if (skipped) {
                    return false
                }
                skipped = true
                longIndex++
            } else {
                shortIndex++
                longIndex++
            }
        }

        return true
    }

    companion object {
        const val MAX_WORD_LENGTH = 16
        const val MIN_WORD_LENGTH = 1
    }
}

fun main(args: Array<String>) {
    println(longestStrChain(arrayOf("word")))
}