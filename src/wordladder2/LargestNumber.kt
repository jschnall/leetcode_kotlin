package wordladder2

fun largestNumber(nums: IntArray): String {
    val comparator = object: Comparator<Int> {
        override fun compare(a: Int, b: Int): Int {
            val aStr = a.toString()
            val bStr = b.toString()

            var index = 0
            while (index < minOf(aStr.length, bStr.length)) {
                if (aStr[index] > bStr[index]) {
                    return -1
                } else if (aStr[index] < bStr[index]) {
                    return 1
                }
                index++
            }
            if (index < aStr.length) {
                if (aStr + bStr < bStr + aStr)
                    return 1
                return -1
            }
            if (index < bStr.length) {
                println("$aStr, $bStr")
                if (bStr + aStr < aStr + bStr)
                    return -1
                return 1
            }
            return 0
        }
    }

    val builder = StringBuilder()
    nums.sortedWith(comparator).forEach { num ->
        builder.append(num)
    }

    // handle leading 0's
    val trimmed = builder.toString().trimStart('0')
    if (trimmed.isEmpty()) {
        return "0"
    }
    return trimmed
}