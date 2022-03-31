fun main(args: Array<String>) {
    println(findPairs(intArrayOf(3,1,4,1,5), 2))
    println(findPairs(intArrayOf(1,2,3,4,5), 1))
    println(findPairs(intArrayOf(1,3,1,5,4), 0))
}

fun findPairs(nums: IntArray, k: Int): Int {
    val pairs = mutableSetOf<Set<Int>>()
    val map = nums.asList().groupingBy { it }.eachCount()
    map.keys.forEach { it ->
        val key1 = it - k
        map[key1]?.let { count ->
            if (it != key1 || count > 1) {
                pairs.add(setOf(it, key1))
            }
        }

        val key2 = it + k
        map[key2]?.let { count ->
            if (it != key2 || count > 1) {
                pairs.add(setOf(it, key2))
            }
        }
    }

    //println(pairs)
    return pairs.size
}
