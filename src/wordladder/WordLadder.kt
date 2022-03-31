package wordladder

import java.util.LinkedList
import java.util.Queue
import kotlin.test.assertEquals

// 127. Word Ladder

data class WLNode(
    val value: String,
    var depth: Int = 0)

fun main(args: Array<String>) {
    assertEquals(5, ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log", "cog")))
    assertEquals(0, ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log")))
}

fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
    val map = buildMap(beginWord, wordList)
    val visited = mutableSetOf<String>()
    val queue: Queue<WLNode> = LinkedList()

    // BFS
    queue.add(WLNode(beginWord, 1))
    visited.add(beginWord)
    while (queue.isNotEmpty()) {
        val node = queue.remove()
        if (node.value == endWord) {
            return node.depth
        }
        findNeighbors(map, node.value).forEach { word ->
            if (!visited.contains(word)) {
                queue.add(WLNode(word, node.depth + 1))
            }
            visited.add(word)
        }
    }

    return 0
}

fun buildMap(beginWord: String, wordList: List<String>): Map<String, Set<String>> {
    val wordMap = mutableMapOf<String, MutableSet<String>>()

    addWord(wordMap, beginWord)
    for (word in wordList) {
        addWord(wordMap, word)
    }

    return wordMap
}

fun addWord(wordMap: MutableMap<String, MutableSet<String>>, word: String) {
    for (i in word.indices) {
        val key = StringBuilder(word).also { it.setCharAt(i, '_')}.toString()
        val value = wordMap.getOrDefault(key, mutableSetOf())
        value.add(word)
        wordMap[key] = value
    }
}

fun findNeighbors(wordMap: Map<String, Set<String>>, word: String): Set<String> {
    val neighbors = mutableSetOf<String>()

    for (i in word.indices) {
        val key = StringBuilder(word).also { it.setCharAt(i, '_')}.toString()
        wordMap[key]?.let { words ->
            neighbors.addAll(words)
        }
    }

    return neighbors
}