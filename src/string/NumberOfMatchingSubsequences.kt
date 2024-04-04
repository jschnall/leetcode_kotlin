package string

import java.util.*

fun numMatchingSubseq(s: String, words: Array<String>): Int {
    val charToIndexMap = mutableMapOf<Char, Queue<Int>>()
    val wordsToCountMap = words.groupingBy { it }.eachCount()

    // Init map
    s.forEachIndexed { i, c ->
        val queue = charToIndexMap.getOrDefault(c, PriorityQueue<Int>())
        queue.add(i)
        charToIndexMap[c] = queue
    }

    var result = 0

    wordsToCountMap.forEach { entry ->
        val word = entry.key

        if (isSubseq(charToIndexMap.map { it.key to PriorityQueue(it.value) }.toMap(), word)) {
            result += entry.value
        }
    }

    return result
}

fun isSubseq(map: Map<Char, Queue<Int>>, word: String): Boolean {
    var currentIndex = -1
    for (c in word) {
        map[c]?.let { queue ->
            var found = false
            while (queue.isNotEmpty()) {
                val index = queue.remove()
                if (index > currentIndex) {
                    found = true
                    currentIndex = index
                    break
                }
            }
            if (!found) {
                return false
            }
        } ?: run {
            return false
        }
    }
    return true
}