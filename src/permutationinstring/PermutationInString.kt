package permutationinstring

//567. Permutation in String
fun main(args: Array<String>) {
    println(checkInclusion("ab", "eidbaooo"))
    println(checkInclusion("ab", "eidboaoo"))
}

// Maybe just slightly faster since does not create substring
fun checkInclusion(s1: String, s2: String): Boolean {
    val s1FreqMap = s1.groupingBy { it }.eachCount()

    for (i in 0 .. s2.length - s1.length) {
        val freqMap = mutableMapOf<Char, Int>()
        for (j in s1.indices) {
            val c = s2[i+j]
            freqMap[c] = freqMap.getOrDefault(c, 0) + 1
        }
        if (s1FreqMap == freqMap) {
            return true
        }
    }

    return false
}

fun checkInclusion2(s1: String, s2: String): Boolean {
    val s1FreqMap = s1.groupingBy { it }.eachCount()

    for (i in 0 .. s2.length - s1.length) {
        val freqMap = s2.substring(i, i + s1.length).groupingBy { it }.eachCount()
        if (s1FreqMap == freqMap) {
            return true
        }
    }

    return false
}