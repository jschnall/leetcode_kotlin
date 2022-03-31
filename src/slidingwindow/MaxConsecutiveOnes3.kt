package slidingwindow

// 1004. Max Consecutive Ones III
fun longestOnes(nums: IntArray, k: Int): Int {
    var current = 0
    var max = 0
    var flips = k

    var start = 0
    var end = 0

    while (end < nums.size) {
        if (nums[end] == 1) {
            current++
            end++
        } else if (flips > 0) {
            current++
            end++
            flips--
        } else if (nums[start] == 1) {
            current--
            start++
        } else {
            current--
            start++
            flips++
        }
        max = maxOf(max, current)
    }

    return max
}

fun main(args: Array<String>) {
    println(longestOnes(intArrayOf(1,1,1,0,0,0,1,1,1,1,0), 2))
    println(longestOnes(intArrayOf(0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1), 3))
    println(longestOnes(intArrayOf(0,0,1,1,1,0,0), 0))
}