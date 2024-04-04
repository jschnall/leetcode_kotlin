import kotlin.math.abs
import kotlin.test.assertEquals

//50. Pow(x, n)
fun main() {
    // assertEquals(1024.0, myPow(2.0, 10))
    // assertEquals(9.261, myPow(2.1, 3))
    // assertEquals(0.25, myPow(2.0, -2))
    // println(myPow(0.00001, 2147483647))
    println(myPow(2.0, -2147483648))
    println(myPow(-1.0, -2147483648))
}

fun myPow(x: Double, n: Int): Double {
    if (n == 0 || x == 1.0) return 1.0

    var target = abs(n.toLong())
    var result = x
    var exp = 1L

    val dpValue = mutableListOf(result)
    val dpExp = mutableListOf(1L)

    while (exp <= target / 2) {
        result *= result
        exp += exp
        dpExp.add(exp)
        dpValue.add(result)
    }

    for (i in dpExp.size - 1 downTo 0) {
        while (target - exp >= dpExp[i]) {
            result *= dpValue[i]
            exp += dpExp[i]
        }
    }

    return if (n < 0) 1.0 / result else result
}
