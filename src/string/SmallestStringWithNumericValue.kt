package string

// 1663. Smallest String With A Given Numeric Value
fun getSmallestString(n: Int, k: Int): String {
    val array = CharArray(n) { 'a' }
    var index = array.size - 1
    var tot = k - n
    while (tot > 0) {
        if (tot >= 25) {
            array[index] = array[index] + 25
            tot -= 25
            index--
        } else {
            array[index] = array[index] + tot
            tot = 0
        }
    }

    return String(array)
}

fun main(args: Array<String>) {
    println(getSmallestString(3, 27))
    println(getSmallestString(5, 73))
    println(getSmallestString(2, 52))
}