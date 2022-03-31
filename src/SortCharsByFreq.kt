import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals("111eerT", frequencySort("Tree111"))
    assertEquals("111eerT", frequencySort2("Tree111"))
}

// 451. Sort Characters By Frequency
fun frequencySort(s: String): String {
    val buckets = Array<MutableList<Char>>(75) { mutableListOf() }
    s.forEach { c ->
        buckets[c - '0'].add(c)
    }
    buckets.sortByDescending { it.size }

    val builder = StringBuilder()
    buckets.forEach { list ->
        list.forEach { c ->
            builder.append(c)
        }
    }

    return builder.toString()
}

fun frequencySort2(s: String): String {
    return s.groupingBy { it }
        .fold("") { accumulator, element -> accumulator + element }
        .values.sortedByDescending { it.length }
        .fold("") { accumulator, element -> accumulator + element }
}