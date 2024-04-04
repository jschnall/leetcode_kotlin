import java.lang.Exception
import java.lang.Math.*
import java.math.BigInteger
import java.util.*
import kotlin.math.ceil
import kotlin.math.max
import kotlin.math.roundToInt
import kotlin.test.assertEquals

fun main(args: Array<String>) {
//    println(KotlinVersion.CURRENT)

//    println(twoSum(nums = intArrayOf(2, 7, 11, 15), target = 9).contentToString())
//    println(twoSum(nums = intArrayOf(3, 2, 4), target = 6).contentToString())
//    println(twoSum(nums = intArrayOf(3, 3), target = 6).contentToString())

//    println(isPalindrome(121))
//    println(isPalindrome(-121))
//    println(isPalindrome(10))
//    println(isPalindrome(-101))

//    val matrix = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
//    val matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
//    val matrix = arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12), intArrayOf(13, 14, 15, 16))
//    val matrix = arrayOf(intArrayOf(1, 2, 3, 4, 5), intArrayOf(6, 7, 8, 9, 10), intArrayOf(11, 12, 13, 14, 15), intArrayOf(16, 17, 18, 19, 20), intArrayOf(21, 22, 23, 24, 25))
//    printMatrix(matrix)
//    rotate(matrix)
//    printMatrix(matrix)

//    println(binSearch(intArrayOf(0, 1, 2, 3), 2))
//    println(binSearch(intArrayOf(0, 1, 2, 3), 5))

//    println(searchRotated(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0))
//    println(searchRotated(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3))
//    println(searchRotated(intArrayOf(1), 0))
//    println(searchRotated(intArrayOf(1), 1))
//    println(searchRotated(intArrayOf(3, 1), 3))
//    println(searchRotated(intArrayOf(5, 1, 3), 5))

//    println(threeSum(intArrayOf(-1,0,1,2,-1,-4)))
//    println(threeSum(intArrayOf()))
//    println(threeSum(intArrayOf(0)))
//    println(threeSum(intArrayOf(0,0,0)))
//    println(threeSum(intArrayOf(0,0,0,0)))

//    println(threeSumClosest(intArrayOf(-1,2,1,-4), 1))
//    println(threeSumClosest(intArrayOf(0,0,0), 1))

//    println(intToRoman(3))
//    println(intToRoman(4))
//    println(intToRoman(9))
//    println(intToRoman(58))
//    println(intToRoman(1994))

//    println(zigZag("PAYPALISHIRING", 3))
//    println(zigZag("PAYPALISHIRING", 4))
//    println(zigZag("A", 1))
//    println(zigZag("A", 2))
//    println(zigZag("ABC", 2))

//    println(nextCountAndSay("3322251"))
//    println(countAndSay(4))

//    println(addBinary("11", "1"))
//    println(addBinary("1010","1011"))
//    println(addBinary("100","110010"))

//    println(maxProfit(intArrayOf(7,1,5,3,6,4)))
//    println(maxProfit(intArrayOf(7,6,4,3,1)))
//    println(maxProfit2(intArrayOf(7,1,5,3,6,4)))
//    println(maxProfit2(intArrayOf(1,2,3,4,5)))
//    println(maxProfit2(intArrayOf(7,6,4,3,1)))

//    println(minDepth(TreeNode(25)))
//    println(minDepth(null))

//    printMatrix(insert(arrayOf(intArrayOf(0, 3)), intArrayOf(1, 5)))
//    printMatrix(insert(arrayOf(intArrayOf(1, 5)), intArrayOf(0, 3)))
//    println(insert(arrayOf(intArrayOf(1, 5)), intArrayOf(2, 3)).contentDeepToString())
//    println(insert(arrayOf(intArrayOf(1, 3), intArrayOf(6, 9)), intArrayOf(2, 5)).contentDeepToString())
//    printMatrix(insert(arrayOf(intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(6, 7), intArrayOf(8, 10), intArrayOf(12, 16)), intArrayOf(4, 8)))
//    printMatrix(insert(arrayOf(), intArrayOf(5, 7)))
//    printMatrix(insert(arrayOf(intArrayOf(1, 5)), intArrayOf(1, 7)))
//    printMatrix(insert(arrayOf(intArrayOf(2, 5)), intArrayOf(1, 7)))
//    printMatrix(insert(arrayOf(intArrayOf(1, 5), intArrayOf(6, 8)), intArrayOf(5, 6)))

//    println(findOrder(4, arrayOf(intArrayOf(1, 0), intArrayOf(2, 0), intArrayOf(3, 1), intArrayOf(3, 2))).contentToString())
//    println(findOrder(4, arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))).contentToString())

//    println(fourSum(intArrayOf(1,0,-1,0,-2,2), 0))

//    println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
//    println(longestCommonPrefix(arrayOf("dog", "racecar", "car")))
//    println(longestCommonPrefix(arrayOf("cir", "car")))

//    println(bitwiseComplement(10))

//    println(isPalindrome("aab", 1, 3))
//    println(isPalindrome("a", 0, 1))
//    println(isPalindrome("aaaaaaaaaa", 0, 10))

//    println(partition("aab"))
//    println(partition("a"))
//    println(partition("aba"))

    //println(minCut("aab"))
    //println(minCut("a"))
    //println(minCut("aba"))
    // TODO println(minCut("ababababababababababababcbabababababababababababa"))

//    println(CarPool().carPooling(arrayOf(intArrayOf(2, 1, 5), intArrayOf(3, 3, 7)), 4))
//    println(CarPool().carPooling(arrayOf(intArrayOf(2, 1, 5), intArrayOf(3, 3, 7)), 5))

//    println(wordBreak("leetcode", listOf("leet", "code")))

//    println(subsetsWithDup(intArrayOf(1, 2, 2)))
//    println(subsetsWithDup(intArrayOf(1, 2, 3)))
//    println(subsetsWithDup(intArrayOf(4, 4, 4, 4, 1)))
//    println(subsetsWithDup(intArrayOf(0)))

//    println(spiralOrder(arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9))))
//    println(spiralOrder(arrayOf(intArrayOf(1,2,3,4), intArrayOf(5,6,7,8), intArrayOf(9,10,11,12))))

//    val root = TreeNode(1)
//    root.left = null
//    root.right = TreeNode(2)
//    root.right?.left = TreeNode(3)
//    printPreOrder(root)
//    println("")
//    printPreOrder(treeToComplete(root))
    
//    println(wordSearch(arrayOf(charArrayOf('A','B','C','E'),charArrayOf('S','F','C','S'),charArrayOf('A','D','E','E')), "SEE"))
//    println(numDecodings("12"))
//    println(numDecodings("226"))
//    println(numDecodings("06"))

//    println(compareVersion("1.01", "1.001"))
//    println(compareVersion("1.0", "1.0.0"))
//    println(compareVersion("0.1", "1.1"))

    assertEquals(emptyList(), summaryRanges(intArrayOf()))
    assertEquals(listOf("0->2", "4->5", "7"), summaryRanges(intArrayOf(0,1,2,4,5,7)))
    assertEquals(listOf("0", "2->4", "6", "8->9"), summaryRanges(intArrayOf(0,2,3,4,6,8, 9)))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val numToIndices = mutableMapOf<Int, MutableList<Int>>()

    nums.forEachIndexed { index, num ->
        numToIndices[num]?.let {
            it.add(index)
        } ?: run {
            numToIndices[num] = mutableListOf(index)
        }
    }
    nums.forEachIndexed { index, num ->
        val diff = target - num
        numToIndices[diff]?.let { indices ->
            indices.firstOrNull { it != index }?.let { secondIndex ->
                return intArrayOf(index, secondIndex)
            }
        }
    }
    return intArrayOf()
}

// 6. ZigZag Conversion
fun zigZag(s: String, numRows: Int): String {
    if (numRows == 1) {
        return s
    }
    val numCols = max(1, ceil(s.length / (2 * (numRows - 1.0)) * (numRows - 1)).toInt())
    val matrix = mutableListOf<MutableList<Char>>()

    // init matrix
    for (j in 0 until numRows) {
        val row = mutableListOf<Char>()
        for (i in 0 until numCols) {
            row.add(' ')
        }
        matrix.add(row)
    }

//    matrix.forEach {
//        println(it)
//    }

    val iter = s.iterator()
    var i = 0
    while (iter.hasNext()) {
        for (j in 0 until numRows - 1) {
            if (!iter.hasNext()) {
                break
            }
            matrix[j][i] = iter.next()
        }
        for (j in numRows - 1 downTo 1) {
            if (!iter.hasNext()) {
                break
            }
            matrix[j][i] = iter.next()
            i++
        }
    }
    val builder = StringBuilder()
    matrix.forEach { row ->
        row.forEach {
            if (it != ' ') {
                builder.append(it)
            }
        }
    }
//    matrix.forEach {
//        println(it)
//    }

    return builder.toString()
}

fun isPalindrome(x: Int): Boolean {
    val str = x.toString()
    for (i in 0 .. str.length / 2) {
        if (str[i] != str[str.length - 1 - i]) {
            return false
        }
    }
    return true
}

// 48. Rotate Image
fun rotate(matrix: Array<IntArray>): Unit {
    var start = 0
    var end = matrix.size - 1

    while (start < end) {
        for (i in start until end) {
            val tmp = matrix[start][i]
            matrix[start][i] = matrix[end + start - i][start]
            matrix[end + start - i][start] = matrix[end][end + start - i]
            matrix[end][end + start - i] = matrix[i][end]
            matrix[i][end] = tmp
        }
        start++
        end--
    }
}

fun printMatrix(matrix: Array<IntArray>) {
    for (row in matrix) {
        println(row.contentToString())
    }
    println()
}

// 33. Search in Rotated Sorted Array
fun searchRotated(nums: IntArray, target: Int): Int {
    // First bin search to find pivot point, then bin search either sorted section for the target
    // Runtime will be better than 3 * log(n) = O(log(n))
    val pivotIndex = findPivot(nums)
    val result = binSearch(nums, target,0, pivotIndex)
    if (result >= 0) {
        return result
    }
    return binSearch(nums, target, pivotIndex, nums.size)
}

fun searchRotated2(nums: IntArray, target: Int): Int {
    // First bin search to find pivot point, then bin search either sorted section for the target
    // Runtime will be better than 3 * log(n) = O(log(n))
    val pivotIndex = findPivot(nums)
    var result = nums.binarySearch(target,0, pivotIndex)
    if (result >= 0) {
        return result
    }
    result = nums.binarySearch(target, pivotIndex, nums.size)
    return if (result >= 0) result else -1
}

fun findPivot(array: IntArray): Int {
    var start = 1
    var end = array.size
    while (start < end) {
        val pivot = start + (end - start) / 2
        if (array[pivot] < array[pivot - 1]) {
            return pivot
        } else if (array[pivot] > array[0]) {
            start = pivot + 1
        } else {
            end = pivot
        }
    }
    // Otherwise array is not rotated
    return 0
}

fun binSearch(array: IntArray, target: Int, fromIndex: Int = 0, toIndex: Int = array.size): Int {
    var start = fromIndex
    var end = toIndex

    while (start < end) {
        val pivot = start + (end - start) / 2
        if (array[pivot] > target ) {
            end = pivot
        } else if (array[pivot] < target) {
            start = pivot + 1
        } else {
            return pivot
        }
    }
    return -1
}

// 20. Valid Parentheses
fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    s.forEach {
        if (it == '(' || it == '{' || it == '[') {
            stack.push(it)
        } else if (stack.isEmpty()) {
            return false
        } else {
            when (it) {
                ')' -> if (stack.pop() != '(') return false
                '}' -> if (stack.pop() != '{') return false
                ']' -> if (stack.pop() != '[') return false
            }
        }
    }
    if (stack.isEmpty()) {
        return true
    }
    return false
}

// 12. Integer to Roman
fun intToRoman(num: Int): String {
    var n = num
    val builder = StringBuilder()
    while (n > 0) {
        if (n >= 1000) {
            builder.append('M')
            n -= 1000
        } else if (n >= 900) {
            builder.append("CM")
            n -= 900
        } else if (n >= 500) {
            builder.append('D')
            n -= 500
        } else if (n >= 400) {
            builder.append("CD")
            n -= 400
        } else if (n >= 100) {
            builder.append('C')
            n -= 100
        } else if (n >= 90) {
            builder.append("XC")
            n -= 90
        } else if (n >= 50) {
            builder.append('L')
            n -= 50
        } else if (n >= 40) {
            builder.append("XL")
            n -= 40
        } else if (n >= 10) {
            builder.append('X')
            n -= 10
        } else if (n >= 9) {
            builder.append("IX")
            n -= 9
        } else if (n >= 5) {
            builder.append('V')
            n -= 5
        } else if (n >= 4) {
            builder.append("IV")
            n -= 4
        } else {
            builder.append('I')
            n -= 1
        }
    }
    return builder.toString()
}

// 13. Roman to Integer
fun romanToInt(s: String): Int {
    var tot = 0
    var prev: Char = s[0]
    for (c in s.subSequence(1, s.length)) {
        when (prev) {
            'I' -> if (c == 'V' || c == 'X') tot -= 1 else tot += 1
            'X' -> if (c == 'L' || c == 'C') tot -= 10 else tot += 10
            'C' -> if (c == 'D' || c == 'M') tot -= 100 else tot += 100
            else -> tot += symbolToInt(prev)
        }
        prev = c
    }
    tot += symbolToInt(prev)
    return tot
}

fun symbolToInt(digit: Char): Int {
    return when (digit) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> throw Exception("Invalid symbol")
    }
}

// 15. 3Sum (hashtable)
fun threeSumHash(nums: IntArray): List<List<Int>> {
    val result = mutableSetOf<List<Int>>()
    val map = nums.withIndex().groupBy({ it.value }, { it.index })

    //println(map)
    for (i in 1 until nums.size) {
        for (j in 0 until i) {
            val key = -nums[i]-nums[j]
            val value = map[key]
            if (value != null && ((!value.contains(i) && !value.contains(j)) || value.size > 2)) {
                result.add(listOf(nums[i], nums[j], key).sorted())
            }
        }
    }
    return result.toList()
}

// 15a. 3Sum (bin comparison)
fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableSetOf<List<Int>>()
    var a: Int
    var b: Int
    var c: Int
    nums.sort()
    for (i in 0 until nums.size - 2) {
        a = nums[i]
        var start = i + 1
        var end = nums.size - 1
        while (start < end) {
            b = nums[start]
            c = nums[end]
            if (a + b + c == 0) {
                result.add(listOf(a, b, c))
                // Continue search for all triplet combinations summing to zero.
                // We need to update both end and start together since the array values are distinct.
                start++
                end--
            } else if (a + b + c > 0) {
                end--
            } else {
                start++
            }
        }
    }
    return result.toList()
}

// 16. 3Sum Closest
fun threeSumClosest(nums: IntArray, target: Int): Int {
    var closest = nums[0] + nums[1] + nums[nums.size - 1]
    nums.sort()
    for (i in 0 until nums.size - 2) {
        var start = i + 1
        var end = nums.size - 1
        while (start < end) {
            val sum = nums[i] + nums[start] + nums[end]
            if (sum < target) {
                start++
            } else if (sum > target) {
                end--
            } else {
                return sum
            }
            if (Math.abs(target - sum) < Math.abs(target - closest)) {
                closest = sum
            }
        }
    }
    return closest
}

// 18. 4Sum
fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    nums.sort()
    return kSum(nums, target, 0, 4)
}

fun kSum(nums: IntArray, target: Int, start: Int, k: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    if (start == nums.size) {
        return result
    }
    val avg = target / k
    if (nums[start] > avg || avg > nums.last()) {
        return result
    }
    if (k == 2) {
        return twoSum(nums, target, start)
    }

    for (i in start until nums.size) {
        if (i == start || nums[i - 1] != nums[i]) {
            kSum(nums, target - nums[i], i + 1, k - 1).forEach {
                result.add(it.plus(nums[i]))
            }
        }
    }

    return result
}

fun twoSum(nums: IntArray, target: Int, start: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    var lo = start
    var hi = nums.size - 1

    while (lo < hi) {
        val a = nums[lo]
        val b = nums[hi]
        val sum = a + b
        if (sum < target || lo > start && a == nums[lo - 1]) {
            lo++
        } else if (sum > target || hi < nums.lastIndex && b == nums.last()) {
            hi--
        } else {
            result.add(listOf(a, b))
            lo++
            hi--
        }
    }

    return result
}

// 38. Count and Say
fun countAndSay(n: Int): String {
    var result = "1"

    for (i in 1 until n) {
        result = nextCountAndSay(result)
    }
    return result
}

fun nextCountAndSay(s: String): String {
    val builder = StringBuilder()
    var count = 1
    var prev = s[0]
    var index = 1
    while (index < s.length) {
        val digit = s[index]
        if (digit == prev) {
            count++
        } else {
            builder.append(count).append(prev)
            count = 1
            prev = digit
        }
        index++
    }
    builder.append(count).append(prev)

    return builder.toString()
}

// 67. Add Binary
fun addBinary(a: String, b: String): String {
    var carry = false
    val builder = StringBuilder()

    val len = a.length.coerceAtMost(b.length)
    for (i in 0 until len) {
        if (a[a.length-1-i] == b[b.length-1-i]) {
            if (carry) {
                builder.insert(0, '1')
            } else {
                builder.insert(0, '0')
            }
            carry = a[a.length-1-i] == '1' && b[b.length-1-i] == '1'
        } else {
            if (carry) {
                builder.insert(0, '0')
                carry = true
            } else {
                builder.insert(0, '1')
                carry = false
            }
        }
    }

    for (i in len until a.length) {
        if (a[a.length-1-i] == '0') {
            if (carry) {
                builder.insert(0, '1')
            } else {
                builder.insert(0, '0')
            }
            carry = false
        } else {
            if (carry) {
                builder.insert(0, '0')
                carry = true
            } else {
                builder.insert(0, '1')
            }
        }
    }
    for (i in len until b.length) {
        if (b[b.length-1-i] == '0') {
            if (carry) {
                builder.insert(0, '1')
            } else {
                builder.insert(0, '0')
            }
            carry = false
        } else {
            if (carry) {
                builder.insert(0, '0')
                carry = true
            } else {
                builder.insert(0, '1')
            }
        }
    }
    if (carry) {
        builder.insert(0, '1')
    }
    return builder.toString()
}

// 111. Minimum Depth of Binary Tree
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun minDepth(root: TreeNode?): Int {
    if (root == null) {
        return 0
    }

    val queue: Queue<TreeNode> = LinkedList<TreeNode>()
    root.`val` = 1
    queue.add(root)
    while (queue.isNotEmpty()) {
        val node = queue.remove()
        if (node.left == null && node.right == null) {
            // Leaf node found
            return node.`val`
        }
        node.left?.let {
            it.`val` = node.`val` + 1
            queue.add(it)
        }
        node.right?.let {
            it.`val` = node.`val` + 1
            queue.add(it)
        }
    }
    return 0
}

// 112. Path Sum
fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    if (root == null) {
        return false
    }
    return hasPathSum(root, targetSum, 0)
}

fun hasPathSum(root: TreeNode, targetSum: Int, sum: Int): Boolean {
    if (root.left == null && root.right == null) {
        // leaf node
        return sum + root.`val` == targetSum
    }
    if (root.left == null) {
        return hasPathSum(root.right!!, targetSum, sum + root.`val`)
    }
    if (root.right == null) {
        return hasPathSum(root.left!!, targetSum, sum + root.`val`)
    }
    return hasPathSum(root.left!!, targetSum, sum + root.`val`) ||
            hasPathSum(root.right!!, targetSum, sum + root.`val`)
}

// 113. Path Sum II
fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    if (root == null) {
        return result
    }
    pathSum(root, targetSum, 0, listOf<Int>(), result)
    return result
}

fun pathSum(node: TreeNode, targetSum: Int, sum: Int, path: List<Int>, result: MutableList<List<Int>>) {
    val newPath = path.toMutableList().apply { add(node.`val`) }

    if (node.left == null && node.right == null) {
        // leaf node
        if (sum + node.`val` == targetSum) {
            result.add(newPath)
        }
    } else {
        if (node.left != null) {
            pathSum(node.left!!, targetSum, sum + node.`val`, newPath, result)
        }
        if (node.right != null) {
            pathSum(node.right!!, targetSum, sum + node.`val`, newPath, result)
        }
    }
}

// 129. Sum Root to Leaf Numbers
fun sumNumbers(root: TreeNode?): Int {
    if (root == null) {
        return 0
    }
    return sumNumbers(root, 0)
}

fun sumNumbers(node: TreeNode, sum: Int): Int {
    if (node.left == null && node.right == null) {
        // leaf node
        return sum * 10 + node.`val`
    }
    if (node.right == null) {
        return sumNumbers(node.left!!, sum * 10 + node.`val`)
    }
    if (node.left == null) {
        return sumNumbers(node.right!!, sum * 10 + node.`val`)
    }
    return sumNumbers(node.left!!, sum * 10 + node.`val`) +
            sumNumbers(node.right!!, sum * 10 + node.`val`)
}

fun isValidBST(root: TreeNode?): Boolean {
    if (root == null) {
        return false
    }
    return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE)
}

fun isValidBST(node: TreeNode, min: Long, max: Long): Boolean {
    if (node.`val` < min || node.`val` > max) {
        return false
    }
    if (node.left == null && node.right == null) {
        return true
    }
    if (node.right == null) {
        return isValidBST(node.left!!, min, max.coerceAtMost(node.`val` - 1L))
    }
    if (node.left == null) {
        return isValidBST(node.right!!, min.coerceAtLeast(node.`val` + 1L), max)
    }
    return isValidBST(node.left!!, min, max.coerceAtMost(node.`val` - 1L)) &&
            isValidBST(node.right!!, min.coerceAtLeast(node.`val` + 1L), max)
}

// 199. Binary Tree Right Side View
fun rightSideView(root: TreeNode?): List<Int> {
    if (root === null) {
        return listOf<Int>()
    }
    val result = mutableListOf<Int>()
    traverseRight(root, result, 0)
    return result
}

fun traverseRight(node: TreeNode, path: MutableList<Int>, depth: Int) {
    if (path.size <= depth) {
        path.add(node.`val`)
    }
    node.right?.let {
        traverseRight(it, path, depth + 1)
    }
    node.left?.let {
        traverseRight(it, path, depth + 1)
    }
}

// 200. Number of Islands
data class Point(val x: Int, val y: Int)

fun numIslands(grid: Array<CharArray>): Int {
    var islandCount = 0

    grid.forEachIndexed { i, row ->
        row.forEachIndexed { j, cell ->
            if (cell == '1') {
                val island = bfs(grid, Point(i, j))
                if (!island.isNullOrEmpty()) {
                    islandCount++
                }
            }
        }
    }
    return islandCount
}

fun bfs(grid: Array<CharArray>, point: Point): List<Point> {
    val result = mutableListOf<Point>()

    val queue = LinkedList<Point>()
    queue.push(point)
    grid[point.x][point.y] = '0'
    while (queue.isNotEmpty()) {
        val point = queue.pop()
        result.add(point)
        queue.addAll(neighbors(grid, point))
    }
    return result
}

fun neighbors(grid: Array<CharArray>, point: Point): List<Point> {
    val result = mutableListOf<Point>()

    if (point.x > 0 && grid[point.x - 1][point.y] == '1') {
        result.add(Point(point.x - 1, point.y))
        grid[point.x - 1][point.y] = '0'
    }
    if (point.x < (grid.size - 1) && grid[point.x + 1][point.y] == '1') {
        result.add(Point(point.x + 1, point.y))
        grid[point.x + 1][point.y] = '0'
    }
    if (point.y > 0 && grid[point.x][point.y - 1] == '1') {
        result.add(Point(point.x, point.y - 1))
        grid[point.x][point.y - 1] = '0'
    }
    if (point.y < (grid[0].size - 1) && grid[point.x][point.y + 1] == '1') {
        result.add(Point(point.x, point.y + 1))
        grid[point.x][point.y + 1] = '0'
    }
    return result
}

// 121. Best time to Buy and Sell Stock
fun maxProfit(prices: IntArray): Int {
    var minPrice = prices[0]
    var profit = 0
    for (i in 1 until prices.size) {
        minPrice = minPrice.coerceAtMost(prices[i])
        profit = profit.coerceAtLeast(prices[i] - minPrice)
    }
    return profit
}

// 122. Best time to Buy and Sell Stock II
fun maxProfit2(prices: IntArray): Int {
    var startPrice = prices[0]
    var profit = 0
    for (i in 1 until prices.size) {
        startPrice = startPrice.coerceAtMost(prices[i])
        if (prices[i] > startPrice) {
            profit += prices[i] - startPrice
            startPrice = prices[i]
        }
    }
    return profit
}

// 57. Insert Interval
class CompareStart {
    companion object : Comparator<IntArray> {
        override fun compare(i1: IntArray, i2: IntArray): Int = i1[0] - i2[0]
    }
}
class CompareEnd {
    companion object : Comparator<IntArray> {
        override fun compare(i1: IntArray, i2: IntArray): Int = i1[1] - i2[1]
    }
}

fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
    if (intervals.isEmpty()) {
        return arrayOf(newInterval)
    }

    val result = mutableListOf<IntArray>()

    var startIndex = intervals.binarySearch(element = newInterval, comparator = CompareStart)

    if (startIndex >= 0) {
        for (i in 0 until startIndex + 1) {
            result.add(intervals[i].clone())
        }
        result.last()[1] = result.last()[1].coerceAtLeast(newInterval[1])
    } else {
        startIndex = kotlin.math.abs(startIndex) - 1
        for (i in 0 until startIndex) {
            result.add(intervals[i].clone())
        }
        if (result.isNotEmpty() && newInterval[0] <= result.last()[1]) {
            result.last()[1] = result.last()[1].coerceAtLeast(newInterval[1])
        } else {
            result.add(newInterval)
        }
    }

    var endIndex = intervals.binarySearch(element = newInterval, comparator = CompareEnd)

    if (endIndex >= 0) {
        result.last()[1] = result.last()[1].coerceAtLeast(intervals[endIndex][1])
        for (i in endIndex + 1 until intervals.size) {
            result.add(intervals[i].clone())
        }
    } else {
        endIndex = kotlin.math.abs(endIndex) - 1
        if (endIndex < intervals.size && newInterval[1] >= intervals[endIndex][0]) {
            result.last()[1] = result.last()[1].coerceAtLeast(intervals[endIndex][1])
            for (i in endIndex + 1 until intervals.size) {
                result.add(intervals[i].clone())
            }
        } else {
            for (i in endIndex until intervals.size) {
                result.add(intervals[i].clone())
            }
        }
    }

    return result.toTypedArray()
}

// 210. Course Schedule II
fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray {
    val ordering = mutableListOf<Int>()
    val graph = prerequisites.groupBy({ it[1] }, { it[0] })
    val allVisited = mutableSetOf<Int>()
    val visited = mutableSetOf<Int>()

    for (course in 0 until numCourses) {
        if (course !in allVisited) {
            if (dfs(course, graph, ordering, visited)) {
                return intArrayOf()
            }
            allVisited.addAll(visited)
            visited.clear()
        }
    }

    return ordering.toIntArray()
}

fun dfs(course: Int, graph: Map<Int, List<Int>>, ordering: MutableList<Int>, visited: MutableSet<Int>): Boolean {
    visited.add(course)
    graph[course]?.forEach { child->
        if (child in visited) {
            // Cycle found, no valid ordering
            return true
        }
        if (dfs(child, graph, ordering, visited)) {
            return true
        }
    }
    if (course !in ordering) {
        ordering.add(0, course)
    }
    visited.remove(course)
    return false
}

// 28. Implement strStr()
fun strStr(haystack: String, needle: String): Int {
    // return haystack.indexOf(needle)
    if (needle == "") {
        return 0
    }

    (0 .. haystack.length - needle.length).forEach loop@ { start ->
        needle.forEachIndexed { i, c ->
            if (haystack[start + i] != c) {
                return@loop
            }
        }
        // Found it!
        return start
    }
    return -1
}

fun strStr2(haystack: String, needle: String): Int {
    // return haystack.indexOf(needle)
    if (needle == "") {
        return 0
    }

    loop@ for (start in 0 .. haystack.length - needle.length) {
        for (i in needle.indices) {
            if (haystack[start + i] != needle[i]) {
                continue@loop
            }
        }
        // Found it!
        return start
    }
    return -1
}


// 19. Remove Nth Node From End of List
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    head?.let {
        if (remove(it, n) == n) {
            return head.next
        }
    }
    return head
}

fun remove(node: ListNode, n: Int): Int {
    var count = 0
    if (node.next != null) {
        count = remove(node.next!!, n)
    }
    if (count == n) {
        node.next = node.next?.next
    }
    return count + 1
}

// 62. Unique Paths
fun uniquePaths(m: Int, n: Int): Int {
    return (factorial(m + n - 2) / (factorial(m-1) * factorial(n-1))).roundToInt()
}

fun factorial(n: Int) : Double {
    return (2 .. n).fold(1.0) { acc, i ->  acc * i}
}


fun uniquePathsDp(m: Int, n: Int): Int {
    val map = mutableMapOf<String, Int>()
    return recUniquePaths(m, n, map)
}

fun recUniquePaths(m: Int, n: Int, map: MutableMap<String, Int>): Int {
    if (m == 1 || n == 1) {
        return 1
    }
    map["$m,$n"]?.let {
        return it
    }
    map["$n,$m"]?.let {
        return it
    }

    val result = recUniquePaths(m, n - 1, map) + recUniquePaths(m - 1, n, map)
    map["$m,$n"] = result
    return result
}

// 14. Longest Common Prefix
fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.size == 1) {
        return strs.first()
    }

    val prefix = mutableListOf<Char>()

    strs.sortBy { it.length }
    strs.first().forEachIndexed { i, c ->
        (1 until strs.size).forEach { j ->
            if (strs[j][i] != c) {
                return String(prefix.toCharArray())
            }
        }
        prefix.add(c)
    }

    return String(prefix.toCharArray())
}

// 21. Merge Two Sorted Lists
fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var head: ListNode? = null
    var ptr1: ListNode? = list1
    var ptr2: ListNode? = list2

    if (ptr1 != null && ptr2 != null) {
        if (ptr1.`val` < ptr2.`val`) {
            head = ptr1
            ptr1 = ptr1.next
        } else {
            head = ptr2
            ptr2 = ptr2.next
        }
    } else if (ptr1 != null) {
        head = ptr1
        ptr1 = ptr1.next
    } else if (ptr2 != null) {
        head = ptr2
        ptr2 = ptr2.next
    }

    var node = head
    while (ptr1 != null && ptr2 != null) {
        if (ptr1.`val` < ptr2.`val`) {
            node?.next = ptr1
            ptr1 = ptr1.next
        } else {
            node?.next = ptr2
            ptr2 = ptr2.next
        }
        node = node?.next
    }
    if (ptr1 != null) {
        node?.next = ptr1
    } else if (ptr2 != null) {
        node?.next = ptr2
    }

    return head
}

// 39. Combination Sum
fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val combo = mutableListOf<Int>()

    findCombos(candidates.distinct().sorted(), target, result, combo, 0)

    return result
}

fun findCombos(candidates: List<Int>, target: Int, result: MutableList<List<Int>>, combo: MutableList<Int>, start: Int) {
    if (target == 0) {
        result.add(combo.toMutableList())
        return
    }

    for (i in start until candidates.size) {
        if (target - candidates[i] >= 0) {
            combo.add(candidates[i])
            findCombos(candidates, target - candidates[i], result, combo, i)
            combo.remove(candidates[i])
        }
    }
}

// 40. Combination Sum II
fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val combo = mutableListOf<Int>()

    val freqMap = candidates.asList().groupingBy { it }.eachCount()
    findCombos2(candidates.distinct().sorted(), target, result, combo, freqMap.toMutableMap(), 0)

    return result
}

fun findCombos2(candidates: List<Int>, target: Int, result: MutableList<List<Int>>, combo: MutableList<Int>, freqMap: MutableMap<Int, Int>, start: Int) {
    if (target == 0) {
        result.add(combo.toMutableList())
        return
    }

    for (i in start until candidates.size) {
        val frequency = freqMap.getOrDefault(candidates[i], 0)
        if (frequency > 0 && target - candidates[i] >= 0) {
            combo.add(candidates[i])
            freqMap[candidates[i]] = frequency - 1
            findCombos2(candidates, target - candidates[i], result, combo, freqMap, i)
            combo.remove(candidates[i])
            freqMap[candidates[i]] = frequency
        }
    }
}

// 216. Combination Sum III
fun combinationSum3(k: Int, n: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val combo = mutableListOf<Int>()

    findCombos3((1 .. 9).toList(), n, k, result, combo, 0)

    return result
}

fun findCombos3(candidates: List<Int>, target: Int, targetSize: Int, result: MutableList<List<Int>>, combo: MutableList<Int>, start: Int) {
    if (target == 0 && targetSize == 0) {
        result.add(combo.toMutableList())
        return
    }
    if (target == 0 || targetSize == 0) {
        return
    }

    for (i in start until candidates.size) {
        if (target - candidates[i] >= 0) {
            combo.add(candidates[i])
            findCombos3(candidates, target - candidates[i], targetSize - 1, result, combo, i + 1)
            combo.remove(candidates[i])
        }
    }
}

// 23. Merge k Sorted Lists
fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    val comparator: Comparator<ListNode> = compareBy { it.`val`}
    val minHeap: Queue<ListNode> = PriorityQueue(comparator)
    lists.forEach { list ->
        list?.let {
            minHeap.add(it)
        }
    }

    val head = minHeap.poll()
    head?.next?.let {
        minHeap.add(it)
    }
    var currentNode = head

    while (minHeap.isNotEmpty()) {
        currentNode.next = minHeap.poll()
        currentNode = currentNode.next
        currentNode?.next?.let {
            minHeap.add(it)
        }
    }

    return head
}

// 55. Jump Game
fun canJump(nums: IntArray): Boolean {
    val visited = mutableSetOf<Int>()
    val comparator: Comparator<Int> = compareByDescending { it }
    val queue: Queue<Int> = PriorityQueue(comparator)

    queue.add(0)
    while (queue.isNotEmpty()) {
        val index = queue.poll()

        if (index == nums.size - 1) {
            return true
        }

        visited.add(index)
        for (i in 1 .. nums[index]) {
            val newIndex = index + i
            if (!visited.contains(newIndex) && newIndex < nums.size) {
                queue.add(newIndex)
            }
        }
    }
    return false
}

// 116. Populating Next Right Pointers in Each Node
class Node(var `val`: Int) {
    var left: Node? = null
    var right: Node? = null
    var next: Node? = null
}

fun connect(root: Node?): Node? {
    val stack = Stack<Node>()

    root?.let {
        traverse(it, stack)
    }

    return root
}

fun traverse(node: Node, stack: Stack<Node>) {
    node.left?.let {
        if (stack.isNotEmpty()) {
            stack.pop().next = it
        }
        traverse(it, stack)
        stack.push(it)
    }
    node.right?.let {
        stack.pop().next = it
        traverse(it, stack)
        stack.push(it)
    }
}

// 108. Convert Sorted Array to Binary Search Tree
fun sortedArrayToBST(nums: IntArray): TreeNode? {
    return recurseSortedArrayToBST(nums, 0, nums.size)
}

fun recurseSortedArrayToBST(nums: IntArray, start: Int, end: Int): TreeNode? {
    if (start >= end) {
        return null
    }
    val midPoint = start + (end - start) / 2
    var node = TreeNode(nums[midPoint])

    node.left = recurseSortedArrayToBST(nums, start, midPoint)
    node.right = recurseSortedArrayToBST(nums, midPoint + 1, end)

    return node
}

fun sortedListToBST(head: ListNode?): TreeNode? {
    return recurseSortedListToBST(head, null)
}

fun recurseSortedListToBST(start: ListNode?, end: ListNode?): TreeNode? {
    if (start == null || start == end) {
        return null
    }
    val midPoint = findListMidpoint(start, end)
    midPoint?.let {
        val node = TreeNode(midPoint.`val`)
        node.left = recurseSortedListToBST(start, midPoint)
        node.right = recurseSortedListToBST(midPoint.next, end)
        return node
    }
    return null
}

fun findListMidpoint(start: ListNode?, end: ListNode?): ListNode? {
    var ptr1 = start
    var ptr2 = start
    while (ptr1 != null && ptr1 != end) {
        ptr1 = ptr1?.next
        if (ptr1 != null && ptr1 != end) {
            ptr1 = ptr1?.next
            ptr2 = ptr2?.next
        }
    }
    return ptr2
}

// 45. Jump Game II
class JumpItem(val index: Int, val count: Int)

fun jump(nums: IntArray): Int {
    val visited = mutableMapOf<Int, Int>()
    val comparator: Comparator<JumpItem> = compareByDescending<JumpItem> { it.index }.thenBy { it.count }
    val queue: Queue<JumpItem> = PriorityQueue(comparator)

    queue.add(JumpItem(0, 0))
    while (queue.isNotEmpty()) {
        val jumpItem = queue.poll()

        visited[jumpItem.index] = minOf(visited.getOrDefault(jumpItem.index, Int.MAX_VALUE), jumpItem.count)

        for (i in 1 .. nums[jumpItem.index]) {
            val newItem = JumpItem(jumpItem.index + i, visited[jumpItem.index]!! + 1)
            if (visited.getOrDefault(newItem.index, Int.MAX_VALUE) > newItem.count && newItem.index < nums.size) {
                queue.add(newItem)
            }
        }
    }
    return visited.getOrDefault(nums.size - 1, Int.MAX_VALUE)
}

// 1009. Complement of Base 10 Integer
fun bitwiseComplement(n: Int): Int {
    if (n == 0) return 1

    var result = 0
    var i = n
    var mul = 1
    while (i > 0) {
        if (i % 2 == 0)
            result += mul
        mul *= 2
        i /= 2
    }

    return result
}

// 131. Palindrome Partitioning
fun partition(s: String): List<List<String>> {
    val result = mutableListOf<List<String>>()
    val palindromeMap = mutableMapOf<String, Boolean>()

    recPartition(s, 0, s.length, result, listOf(), palindromeMap)

    return result
}

fun recPartition(s: String, start: Int, end: Int, result: MutableList<List<String>>, currentList:List<String>, palindromeMap: MutableMap<String, Boolean>): List<List<String>> {
    for (i in start + 1 .. end) {
        if (isPalindrome(s.substring(start, i), palindromeMap)) {
            if (end - i > 0) {
                recPartition(s, i, end, result, currentList.plus(s.substring(start, i)), palindromeMap)
            }
        }
    }
    if (isPalindrome(s.substring(start, end), palindromeMap)) {
        result.add(currentList.plus(s.substring(start, end)))
    }
    return result
}

fun isPalindrome(str: String, map: MutableMap<String, Boolean>): Boolean {
    val v = map[str]

    v?.let {
        return it
    }

    for (i in 0 .. str.length / 2) {
        if (str[i] != str[str.length - 1 - i]) {
            map[str] = false
            return false
        }
    }
    map[str] = true
    return true
}

// 132. Palindrome Partitioning II
fun minCut(s: String): Int {
    val palindromeMap = mutableMapOf<String, Boolean>()
    val substringMap = mutableMapOf<String, Set<List<String>>>()

    val result = recPartition2(s, 0, s.length, listOf(), palindromeMap, substringMap).toList()
    println(result)
    println(substringMap)
    return result.minOf { it.size } - 1
    // return result.sortedBy { it.size }.first().size - 1
}

fun recPartition2(s: String, start: Int, end: Int, currentList:List<String>, palindromeMap: MutableMap<String, Boolean>, substringMap: MutableMap<String, Set<List<String>>>): Set<List<String>> {
    val result = mutableSetOf<List<String>>()
    for (i in start + 1 .. end) {
        val prefix = s.substring(start, i)
        if (isPalindrome(prefix, palindromeMap)) {
            if (end - i > 0) {
                val suffix = s.substring(i, end)
//                substringMap[suffix]?.let { set ->
//                    result.addAll(set)
//                } ?: run {
                    result.addAll(recPartition2(s, i, end, currentList.plus(prefix), palindromeMap, substringMap))
//                }
            }
        }
    }

    val str = s.substring(start, end)
    if (isPalindrome(str, palindromeMap)) {
        result.add(currentList.plus(str))
    }
    // TODO substringMap[str] =

    return result
}

// 1094. Car Pooling
class CarPool {
    fun carPooling(trips: Array<IntArray>, capacity: Int): Boolean {
        val map = sortedMapOf<Int, Int>()

        trips.forEach { trip ->
            map[trip[FROM]] = map.getOrDefault(trip[FROM], 0) + trip[NUM_PASSENGERS]
            map[trip[TO]] = map.getOrDefault(trip[TO], 0) - trip[NUM_PASSENGERS]
        }

        var passengerCount = 0
        map.values.forEach {
            passengerCount += it
            if (passengerCount > capacity)
                return false
        }

        return true
    }

    companion object {
        val NUM_PASSENGERS = 0
        val FROM = 1
        val TO = 2
    }
}

class TrieNode(val `val`: String, val isTerminal: Boolean) {
    val children = mutableMapOf<Char, TrieNode>()
}

fun wordBreak(s: String, wordDict: List<String>): Boolean {
    val wordMap = wordDict.groupBy { it.length }
    val dpMap = mutableMapOf<Int, Boolean>()

    dpMap[0] = true
    for (i in 1 until s.length) {
        dpMap[i] = wordBreakRec(s.substring(s.length - i, s.length), wordMap, dpMap)
    }
    return wordBreakRec(s, wordMap, dpMap)
}

fun wordBreakRec(s: String, wordMap: Map<Int, List<String>>, dpMap: Map<Int, Boolean>): Boolean {
    dpMap[s.length]?.let {
        return it
    } ?: run {
        for (i in 1 .. s.length) {
            wordMap[i]?.let { wordList ->
                wordList.forEach { word ->
                    if (s.startsWith(word)) {
                        if (wordBreakRec(s.substring(word.length, s.length), wordMap, dpMap)) {
                            return true
                        }
                    }
                }
            }
        }
    }
    return false
}

fun wordBreakIter(s: String, wordDict: List<String>): Boolean {
    val wordMap = wordDict.groupBy { it.first() }
    var currentSet = mutableSetOf(s)

    while (currentSet.isNotEmpty()) {
        val set = mutableSetOf<String>()

        currentSet.forEach { remaining ->
            wordMap[remaining.first()]?.forEach { prefix ->
                if (remaining.startsWith(prefix)) {
                    val newRemaining = remaining.substringAfter(prefix)

                    if (newRemaining.isEmpty()) {
                        return true
                    }
                    if (newRemaining.length < remaining.length) {
                        set.add(newRemaining)
                    }
                }
            }
        }
        currentSet = set
    }

    return false
}

// 382. Linked List Random Node
class LinkedListRandNode(val head: ListNode?) {
    private val size = findSize()

    private fun findSize(): Int {
        var len =  0
        var node = head
        while (node != null) {
            len++
            node = node.next
        }
        return len
    }

    fun getRandom(): Int? {
        val index = (0 until size).random()
        var node = head
        (0 until index).forEach { _ ->
            node = node?.next
        }
        return node?.`val`
    }
}

//78. Subsets
fun subsets(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    result.add(listOf())

    for (num in nums) {
        result.addAll(result.map { it.plus(num) })
    }

    return result
}

// 90. Subsets II
fun subsetsWithDup(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    nums.sort()

    recSubsets(nums, 0, result, mutableListOf())

    return result
}

fun recSubsets(nums: IntArray, start: Int, result: MutableList<List<Int>>, currentList: MutableList<Int>) {
    result.add(currentList.toMutableList())

    for (i in start until nums.size) {
        if (i != start && nums[i] == nums[i - 1]) {
            continue
        }
        currentList.add(nums[i])
        recSubsets(nums, i + 1, result, currentList)
        currentList.removeLast()
    }
}

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val result = mutableListOf<Int>()

    var startY = 0
    var endY = matrix.size - 1
    var startX = 0
    var endX = matrix[0].size - 1

    var count = 0
    while (startX <= endX && startY <= endY) {
        when (count) {
            0 -> {
                for (i in startX .. endX) {
                    result.add(matrix[startY][i])
                }
                startY++
            }
            1 -> {
                for (j in startY .. endY) {
                    result.add(matrix[j][endX])
                }
                endX--
            }
            2 -> {
                for (i in endX downTo startX) {
                    result.add(matrix[endY][i])
                }
                endY--
            }
            3 -> {
                for (j in endY downTo startY) {
                    result.add(matrix[j][startX])
                }
                startX++
            }
        }
        count = (count + 1) % 4
    }

    return result
}

// Rotate Array
fun rotate(nums: IntArray, k: Int): Unit {
    if (nums.size == 1 || k == 0) {
        return
    }

    var startIndex = 0
    var currentIndex = k % nums.size
    var currentVal = nums[0]
    for (i in nums.indices) {
        if (currentIndex == startIndex) {
            nums[currentIndex] = currentVal
            startIndex = (currentIndex + 1) % nums.size
            currentVal = nums[startIndex]
            currentIndex = (startIndex + k) % nums.size
        } else {
            val temp = nums[currentIndex]
            nums[currentIndex] = currentVal
            currentVal = temp
            currentIndex = (currentIndex + k) % nums.size
        }
    }
}

// Verily Interview: Make a copy of the tree, filling in the nodes in any incomplete row with 0 values
//        1                            1
//   null    2          --->       0       2
//         3  null               0   0   3   0
//
// 2 pass recursive approach, first finding depth is easier, but can be done in a single pass, iteratively as below

class DepthNode (val node: TreeNode?, val depth: Int)

fun TreeNode?.asDepthNode(depth: Int): DepthNode {
    return DepthNode(this, depth)
}

fun treeToComplete(root: TreeNode?): TreeNode? {
    if (root == null) return null

    val result = TreeNode(root.`val`)
    val queue: Queue<DepthNode> = LinkedList()
    queue.add(root.left.asDepthNode(1))
    queue.add(root.right.asDepthNode(1))

    var currentDepth = 1
    var prevLevel = mutableListOf<TreeNode?>(result)
    val level = mutableListOf<TreeNode?>()
    var nonNullNode = root.left != null || root.right != null

    while (true) {
        if (queue.peek()?.depth == currentDepth) {
            queue.remove().node?.let {
                level.add(it)
                queue.add(it.left.asDepthNode(currentDepth + 1))
                queue.add(it.right.asDepthNode(currentDepth + 1))
                nonNullNode = it.left != null || it.right != null
            } ?: run {
                level.add(TreeNode(0))
                queue.add(null.asDepthNode(currentDepth + 1))
                queue.add(null.asDepthNode(currentDepth + 1))
            }
        } else {
            // end of level
            for (i in 0 until prevLevel.size) {
                prevLevel[i]?.left = level[2 * i]?.let { TreeNode(it.`val`) } ?: run { TreeNode(0) }
                prevLevel[i]?.right = level[2 * i + 1]?.let { TreeNode(it.`val`) } ?: run { TreeNode(0) }
            }

            val newPrevLevel = mutableListOf<TreeNode?>()
            prevLevel.forEach {
                newPrevLevel.add(it?.left)
                newPrevLevel.add(it?.right)
            }

            if (!nonNullNode) {
                break
            }
            prevLevel = newPrevLevel
            level.clear()
            currentDepth++
            nonNullNode = false
        }
    }
    return result
}

fun printPreOrder(root: TreeNode?) {
    root?.let {
        print(it.`val`)
        printPreOrder(root?.left)
        printPreOrder(root?.right)
    }
}

class PalindromeLinkedList {
    fun isPalindrome(head: ListNode?): Boolean {
        // Screwed up workaround for not being able to pass vars in function params anymore
        val ptr2 = mutableListOf<ListNode?>(head)
        return recIsPalindrome(head, ptr2)
    }

    fun recIsPalindrome(ptr1: ListNode?, ptr2: MutableList<ListNode?>): Boolean {
        ptr1?.let {
            val result = recIsPalindrome(it.next, ptr2) && (it.`val` == ptr2[0]?.`val`)
            ptr2[0] = ptr2[0]?.next
            return result
        } ?: run {
            return true
        }
    }
}

// 452. Minimum Number of Arrows to Burst Balloons
class MinArrows {
    fun findMinArrowShots(points: Array<IntArray>): Int {
        points.sortWith(compareBy<IntArray> { it[START] }.thenBy { it[END] })

        var arrows = 1
        val currentList = mutableListOf<IntArray>(points[0].copyOf())
        for (i in 1 until points.size) {
            var found = false
            for (list in currentList) {
                if ((points[i][START] >= list[START] && points[i][START] <= list[END]) ||
                    (points[i][END] >= list[START] && points[i][END] <= list[END]) ) {
                    found = true
                    list[START] = list[START].coerceAtLeast(points[i][START])
                    list[END] = list[END].coerceAtMost(points[i][END])
                    break
                }
            }
            if (!found) {
                arrows++
                currentList.add(points[i].copyOf())
            }
        }

        return arrows
    }

    companion object {
        const val START = 0
        const val END = 1
    }
}

// 79. Word Search
fun wordSearch(board: Array<CharArray>, word: String): Boolean {
    val first = word.first()
    board.forEachIndexed { yIndex, row ->
        row.forEachIndexed { xIndex, cell ->
            if (cell == first) {
                val start = Point(xIndex, yIndex)
                if (dfs(board, word.drop(1), Point(xIndex, yIndex), setOf(start))) {
                    return true
                }
            }
        }
    }
    return false
}

fun dfs(board: Array<CharArray>, word: String, start: Point, visited: Set<Point>): Boolean {
    if (word.isEmpty()) {
        return true
    }
    var result = false
    val neighbors = getNeighbors(start, board.size, board[0].size)
    neighbors.forEach {
        if (!visited.contains(it)) {
            if (board[it.y][it.x] == word.first()) {
                val newVisited = visited.toMutableSet()
                newVisited.add(it)
                result = result || dfs(board, word.drop(1), it, newVisited)
            }
        }
    }
    return result
}

fun getNeighbors(point: Point, height: Int, width: Int): List<Point> {
    val neighbors = mutableListOf<Point>()
    if (point.x > 0) {
        neighbors.add(Point(point.x - 1, point.y))
    }
    if (point.x < width - 1) {
        neighbors.add(Point(point.x + 1, point.y))
    }
    if (point.y > 0) {
        neighbors.add(Point(point.x, point.y - 1))
    }
    if (point.y < height - 1) {
        neighbors.add(Point(point.x, point.y + 1))
    }
    return neighbors
}

// 61. Rotate List
fun rotateRight(head: ListNode?, k: Int): ListNode? {
    if (k == 0 || head == null) {
        return head
    }
    // find the list size
    var size = 1
    var ptr = head
    while (ptr?.next != null) {
        size++
        ptr = ptr.next
    }
    ptr?.next = head

    // Move the to index before the new head
    val index = size - (k % size)
    ptr = head
    for (i in 1 until index) {
        ptr = ptr?.next
    }

    // Set the next ptr as the new head, and snip the link to it
    val newHead = ptr?.next
    ptr?.next = null

    return newHead
}

//530. Minimum Absolute Difference in BST
fun getMinimumDifference(root: TreeNode?): Int {
    root?.let {
        return recInOrder(root, arrayOf<TreeNode?>(null))
    }
    return Int.MAX_VALUE
}

fun recInOrder(node: TreeNode, prev: Array<TreeNode?>): Int {
    var minDiff = Int.MAX_VALUE

    node.left?.let { left ->
        minDiff = minDiff.coerceAtMost(recInOrder(left, prev))
    }

    prev[0]?.let {
        minDiff = minDiff.coerceAtMost(kotlin.math.abs(node.`val` - it.`val`))
    }
    prev[0] = node

    node.right?.let { right ->
        minDiff = minDiff.coerceAtMost(recInOrder(right, prev))
    }

    return minDiff
}

// 46. Permutations
fun permute(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    recPermute(nums.toSet(), mutableListOf<Int>(), result)

    return result
}

fun recPermute(nums: Set<Int>, currentList: List<Int>, result: MutableList<List<Int>>) {
    if (nums.isEmpty()) {
        result.add(currentList)
    } else {
        nums.forEach { num ->
            recPermute(nums.minus(num), currentList.plus(num), result)
        }
    }
}

// Construct Binary Tree from Preorder and Inorder Traversal
fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
    return recBuildTree(preorder.asList(), inorder.asList())
}

fun recBuildTree(preorder: List<Int>, inorder: List<Int>): TreeNode {
    val root = TreeNode(preorder[0])

    if (preorder.size == 1) {
        return root
    }

    val inorderLeft = inorder.takeWhile { it != preorder[0] }
    if (inorderLeft.isNotEmpty()) {
        root.left = recBuildTree(preorder.drop(1).take(inorderLeft.size), inorderLeft)
    }

    val inorderRight = inorder.takeLast((inorder.size - inorderLeft.size - 1).coerceAtLeast(0))
    if (inorderRight.isNotEmpty()) {
        root.right = recBuildTree(preorder.takeLast(inorderRight.size), inorderRight)
    }

    return root
}

fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    if (root == null) {
        return result
    }

    val levelList = mutableListOf<Int>()
    var reverse = false
    val levelQueue: Queue<TreeNode> = LinkedList()
    val queue: Queue<TreeNode> = LinkedList()
    queue.add(root)

    while (queue.isNotEmpty()) {
        val node = queue.remove()
        levelList.add(node.`val`)
        node.left?.let {
            levelQueue.add(it)
        }
        node.right?.let {
            levelQueue.add(it)
        }
        if (queue.isEmpty()) {
            // level finished
            if (reverse) {
                result.add(levelList.reversed())
            } else {
                result.add(levelList.toMutableList())
            }
            levelList.clear()

            queue.addAll(levelQueue)
            levelQueue.clear()

            reverse = !reverse
        }
    }

    return result
}

fun minimumSum(num: Int): Int {
    var new1 = StringBuilder()
    var new2 = StringBuilder()


    num.toString().toCharArray().sorted().forEachIndexed { index, c ->
        if (index % 2 == 0) {
            new1.append(c)
        } else {
            new2.append(c)
        }
    }

    return new1.toString().toInt() + new2.toString().toInt()
}

// 91. Decode Ways
// TODO
// Dynamic programming solution
//fun numDecodings(s: String): Int {
//    val map = ('A'..'Z').groupBy( { (it - 'A' + 1).toString() }, { it.toString() })
//        .mapValues { entry -> entry.value.map { it }.toMutableSet() }.toMutableMap()
//
//    map[s]?.let {
//        return it.size
//    }
//    val result = mutableSetOf<String>()
//    if (s.length > 1) {
//        result.add("${decode(s.substring(0, 2))}${decode(s.substring(2))}")
//    }
//    if (s.isNotEmpty()) {
//        result.add("${decode(s.substring(0, 1))}${decode(s.substring(1))}")
//    }
//    map[s] = result
//
//    return result
//}
//
//fun decode(map: MutableMap<String, MutableSet<String>>, s: String, result: MutableSet<String>): String {
//
//}


//fun numDecodings(s: String): Int {
//    val map = ('A'..'Z').associateBy { (it - 'A' + 1).toString() }
//    println(map)
//    val decodings = mutableListOf<List<Char>>()
//
//    recDecodings(map, s, 0, decodings, mutableListOf<Char>())
//
//    return decodings.size
//}
//
//fun recDecodings(map: Map<String, Char>, s: String, index: Int, decodings: MutableList<List<Char>>, current: List<Char>) {
//    if (index >= s.length) {
//        decodings.add(current)
//        return
//    }
//    if (index < s.length - 1) {
//        map[s.substring(index, index + 2)]?.let { c ->
//            recDecodings(map, s, index + 2, decodings, current.toMutableList().plus(c))
//        }
//    }
//    if (index < s.length) {
//        map[s.substring(index, index + 1)]?.let { c ->
//            recDecodings(map, s, index + 1, decodings, current.toMutableList().plus(c))
//        }
//    }
//}


fun sortList(head: ListNode?): ListNode? {
    if (head?.next == null) {
        return head
    }

    val midPoint = findMidPoint(head)
    val l2 = midPoint?.next
    midPoint?.next = null

    //println("${head?.`val`}, ${l2?.`val`}")

    val left = sortList(head)
    val right = sortList(l2)

    return sortedMerge(left, right)
}

// Returns the index of the midpoint to split the list on
fun findMidPoint(head: ListNode?): ListNode? {
    var ptr1 = head
    var ptr2 = head

    while (ptr1?.next?.next != null) {
        ptr1 = ptr1.next?.next
        ptr2 = ptr2?.next
    }

    //println("${ptr2?.`val`}, ${ptr1?.`val`}")
    return ptr2
}

// merges two sorted lists
fun sortedMerge(l1: ListNode?, l2: ListNode?): ListNode? {
    var result: ListNode? = null

    if (l1 == null) {
        return l2
    }
    if (l2 == null) {
        return l1
    }

    if (l1.`val` < l2.`val`) {
        result = l1
        result.next = sortedMerge(l1.next, l2)
    } else {
        result = l2
        result.next = sortedMerge (l1, l2.next)
    }

    return result
}

fun sortedMergeIter(l1: ListNode?, l2: ListNode?): ListNode {
    var head1 = l1
    var head2 = l2

    var result: ListNode? = null
    if (head1!!.`val` < head2!!.`val`) {
        result = head1
        head1 = head1.next
    } else {
        result = head2
        head2 = head2.next
    }
    var ptr = result

    while (head1 != null && head2 != null) {
        if (head1.`val` < head2.`val`) {
            ptr?.next = head1
            head1 = head1.next
        } else {
            ptr?.next = head2
            head2 = head2.next
        }
        ptr = ptr?.next
    }


    if (head1 != null) {
        ptr?.next = head1
    }
    if (head2 != null) {
        ptr?.next = head2
    }

    return result
}

// 165. Compare Version Numbers
fun compareVersion(version1: String, version2: String): Int {
    val v1Segments = version1.split(".")
    val v2Segments = version2.split(".")
    val size = maxOf(v1Segments.size, v2Segments.size)

    for (i in 0 until size) {
        var v1Segment = 0
        var v2Segment = 0

        if (i < v1Segments.size) {
            v1Segment = v1Segments[i].toInt()
        }
        if (i < v2Segments.size) {
            v2Segment = v2Segments[i].toInt()
        }

        if (v1Segment < v2Segment) {
            return -1
        }
        if (v1Segment > v2Segment) {
            return 1
        }
    }

    return 0
}

// 228. Summary Ranges
fun summaryRanges(nums: IntArray): List<String> {
    if (nums.isEmpty()) {
        return emptyList()
    }

    val result = mutableListOf<String>()
    var start = nums[0]
    var end = nums[0]

    for (i in 1 until nums.size) {
        val num = nums[i]
        if (num == end + 1) {
            end = num
        } else {
            addResult(start, end, result)
            start = num
            end = num
        }
    }
    addResult(start, end, result)

    return result
}

fun addResult(start: Int, end: Int, result: MutableList<String>) {
    if (start == end) {
        result.add("${start}")
    } else {
        result.add("${start}->${end}")
    }
}

// 338. Counting Bits
// With Kotlin 1.4+ there is the builtin Int.countOneBits()
fun countBits(n: Int): IntArray {
    println(KotlinVersion.CURRENT)
    val result = IntArray(n + 1)

    for (i in 0 .. n) {
        var count = 0
        var x = i

        while (x > 0) {
            if (x and 1 == 1) {
                count++
            }
            x = x shr 1
        }
        result[i] = count
    }

    return result
}

// 73. Set Matrix Zeroes
fun setZeroes(matrix: Array<IntArray>) {
    var leftZero = false
    var topZero = false

    // Determine whether the left most column will become 0's
    for (i in 0 until matrix.size) {
        if (matrix[i][0] == 0) {
            leftZero = true
            break
        }
    }


    // Determine whether the top most row will become 0's
    for (j in 0 until matrix[0].size) {
        if (matrix[0][j] == 0) {
            topZero = true
            break
        }
    }

    // loop through the rest of the matrix and mark zeros in first row and column
    for (i in 1 until matrix.size) {
        for (j in 1 until matrix[0].size) {
            if (matrix[i][j] == 0) {
                matrix[0][j] = 0
                matrix[i][0] = 0
            }
        }
    }

    // loop through first column and distribute 0's
    for (i in 1 until matrix.size) {
        if (matrix[i][0] == 0) {
            for (j in 1 until matrix[0].size) {
                matrix[i][j] = 0
            }
        }
    }

    // loop through first row and distribute 0's
    for (j in 1 until matrix[0].size) {
        if (matrix[0][j] == 0) {
            for (i in 1 until matrix.size) {
                matrix[i][j] = 0
            }
        }
    }

    if (leftZero) {
        for (i in 0 until matrix.size) {
            matrix[i][0] = 0
        }
    }

    if (topZero) {
        for (j in 0 until matrix[0].size) {
            matrix[0][j] = 0
        }
    }
}

// 2201. Count Artifacts That Can Be Extracted
fun digArtifacts(n: Int, artifacts: Array<IntArray>, dig: Array<IntArray>): Int {
    var result = 0
    val set = dig.toList().toSet()

    for (artifact in artifacts) {
        var missingCell = false

        for (cells in artifactToCells(artifact)) {
            if (!set.contains(cells)) {
                missingCell = true
                break
            }
        }
        if (!missingCell) {
            result++
        }
    }

    return result
}

fun artifactToCells(artifact: IntArray): List<IntArray> {
    val cells = mutableListOf<IntArray>()

    val startY = artifact[0]
    val startX = artifact[1]

    for (i in 0 .. artifact[2] - artifact[0]) {
        for (j in 0 .. artifact[3] - artifact[1]) {
            cells.add(intArrayOf(startY + i, startX + j))
        }
    }

    return cells
}

// 11. Container With Most Water
fun maxArea(height: IntArray): Int {
    var start = 0
    var end = height.size - 1
    var maxArea = (end - start) * Math.min(height[start], height[end])
    var area = 0

    while (start < end) {
        if (height[start] < height[end]) {
            start++
        } else {
            end--
        }
        area = (end - start) * Math.min(height[start], height[end])
        maxArea = Math.max(maxArea, area)
    }
    return maxArea
}

// 347. Top K Frequent Elements
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val map = nums.asList().groupingBy { it }.eachCount()
    val minHeap = PriorityQueue<Map.Entry<Int, Int>>(compareBy { it.value })

    map.forEach {
        minHeap.add(it)
    }

    while (minHeap.size > k) {
        minHeap.remove()
    }

    val result = IntArray(k)
    var i = 0
    while (minHeap.isNotEmpty()) {
        result[i] = minHeap.remove().key
        i++
    }

    return result
}

// 86. Partition List
fun partition(head: ListNode?, x: Int): ListNode? {
    var lHead: ListNode? = ListNode(0)
    var gHead: ListNode? = ListNode(0)

    var lPtr = lHead
    var gPtr = gHead
    var ptr = head

    while (ptr != null) {
        if (ptr.`val` < x) {
            lPtr?.next = ptr
            lPtr = lPtr?.next
        } else {
            gPtr?.next = ptr
            gPtr = gPtr?.next
        }
        ptr = ptr.next
    }
    lPtr?.next = gHead?.next
    gPtr?.next = null

    return lHead?.next
}

fun majorityElement(nums: IntArray): List<Int> {
    return nums.groupBy { it }.filter { it.value.size > nums.size / 3 }.keys.toList()
}

// 1129. ShortestPath
data class Vertex(val id: Int, val isRed: Boolean, val cost: Int)

fun shortestAlternatingPaths(n: Int, redEdges: Array<IntArray>, blueEdges: Array<IntArray>): IntArray {
    val redMap = redEdges.groupBy({ it[0] }, { it[1]})
    val blueMap = blueEdges.groupBy({ it[0] }, { it[1]})
    val redCosts = IntArray(n) { Integer.MAX_VALUE }
    val blueCosts = IntArray(n) { Integer.MAX_VALUE }
    val queue: Queue<Vertex> = LinkedList()

    redCosts[0] = 0
    blueCosts[0] = 0
    redMap[0]?.forEach { neighbor ->
        queue.add(Vertex(neighbor, true, 1))
        redCosts[neighbor] = 1
    }
    blueMap[0]?.forEach { neighbor ->
        queue.add(Vertex(neighbor, false, 1))
        blueCosts[neighbor] = 1
    }

    while (!queue.isEmpty()) {
        val v = queue.remove()
        val neighbors = if (v.isRed) blueMap[v.id] else redMap[v.id]
        val costs = if (v.isRed) blueCosts else redCosts

        neighbors?.forEach { neighbor ->
            val cost = v.cost + 1
            if (cost < costs[neighbor]) {
                costs[neighbor] = cost
                queue.add(Vertex(neighbor, !v.isRed, cost))
            }
        }
    }

    val result = redCosts.mapIndexed { i, cost -> minOf(cost, blueCosts[i])}
        .map { if (it == Integer.MAX_VALUE) -1 else it}.toIntArray()
    result[0] = 0
    return result
}