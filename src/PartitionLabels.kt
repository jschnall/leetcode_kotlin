// 763. Partition Labels
fun partitionLabels(s: String): List<Int> {
    val map = mutableMapOf<Char, Pair<Int, Int>>()
    s.forEachIndexed { index, c ->
        map[c]?.let {
            map[c] = it.copy(second = index)
        } ?: run {
            map[c] = Pair(index, index)
        }
    }

    val segments = joinSegments(map.values.sortedBy { it.first })

    return segments.map { it.second - it.first + 1 }
}

// Takes a sorted list of segments and joins any overlapping ones
fun joinSegments(segments: List<Pair<Int, Int>>): List<Pair<Int, Int>> {
    val result = mutableListOf<Pair<Int, Int>>()
    var start = segments[0].first
    var end = segments[0].second
    for (i in 1 until segments.size) {
        if (segments[i].first <= end) {
            end = maxOf(end, segments[i].second)
        } else {
            result.add(Pair(start, end))
            start = segments[i].first
            end = segments[i].second
        }
    }
    result.add(Pair(start, end))

    return result
}

fun main(args: Array<String>) {
    println(partitionLabels("ababcbacadefegdehijhklij"))
    println(partitionLabels("eccbbbbdec"))
}