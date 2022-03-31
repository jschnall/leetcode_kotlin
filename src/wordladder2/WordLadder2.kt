package wordladder2

import java.util.LinkedList
import java.util.Queue
import kotlin.test.assertEquals

// 127. Word Ladder

data class WLNode(
    val value: String,
    var path: List<String>)

fun main(args: Array<String>) {
    assertEquals(
        listOf(
            listOf("hit", "hot", "dot", "dog", "cog"),
            listOf("hit", "hot", "lot", "log", "cog")
        ),
        findLadders("hit", "cog", listOf("hot", "dot", "dog", "lot", "log", "cog", "bad", "boy"))
    )
    assertEquals(listOf(), findLadders("hit", "cog", listOf("hot", "dot", "dog", "lot", "log")))
}

fun findLadders(beginWord: String, endWord: String, wordList: List<String>): List<List<String>> {
    val result = mutableListOf<List<String>>()
    val map = buildMap(beginWord, wordList)
    val visited = mutableSetOf<String>()
    val queue: Queue<WLNode> = LinkedList()
    var depth = -1 // When first path found, set this to the length of that path

    // BFS
    queue.add(WLNode(beginWord, listOf(beginWord)))
    while (queue.isNotEmpty()) {
        val node = queue.remove()
        visited.add(node.value)
//        println(node)
        if (depth > 0 && node.path.size > depth) {
            break
        }
        if (node.value == endWord) {
            result.add(node.path)
            depth = node.path.size
        } else if (depth < 0 || node.path.size < depth) {
            findNeighbors(map, node.value).forEach { word ->
                if (!visited.contains(word)) {
                    queue.add(WLNode(word, node.path.plus(word)))
                }
            }
        }
    }

    return result
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