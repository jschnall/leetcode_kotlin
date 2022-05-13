import java.math.BigInteger

// 1641. Count Sorted Vowel Strings
class CountSortedVowelStrings {
    fun countVowelStrings(k: Int): Int {
        val n = 5 + k - 1

        return (factorial(n) / (factorial(k) * factorial(n - k))).toInt()
    }

    private fun factorial(n: Int): BigInteger {
        var result = 1.toBigInteger()

        for (i in 2 .. n) {
            result *= i.toBigInteger()
        }

        return result
    }
}