import kotlin.test.assertEquals

// 881. Boats to Save People
// O(n)
fun numRescueBoats(people: IntArray, limit: Int): Int {
    var boats = 0
    var start = 0
    var end = people.size - 1

    people.sort()

    while (start <= end) {
        if (people[start] + people[end] <= limit) {
            start++
            end--
        } else {
            end--
        }
        boats++
    }

    return boats
}

// O(n log n)
fun numRescueBoatsSlow(people: IntArray, limit: Int): Int {
    var boats = 0
    val list = people.toMutableList()

    list.sort()
    while (list.isNotEmpty()) {
        val person = list.last()

        if (person < limit) {
            val result = list.binarySearch(limit - person, 0, list.size - 1)
            if (result == - 1) {
                // No second passenger available that won't go over the weight limit
                boats++
                list.removeLast()
            } else if (result < 0) {
                // Add the heaviest person that won't go over the limit
                boats++
                list.removeLast()
                list.removeAt(-result - 2)
            } else {
                // exact match found
                boats++
                list.removeLast()
                list.removeAt(result)
            }
        } else {
            boats++
            list.removeLast()
            // Alternative for older kotlin: list.removeAt(list.size - 1)
        }
    }

    return boats
}

fun main(args: Array<String>) {
    assertEquals(1, numRescueBoats(intArrayOf(1,2), 4))
    assertEquals(3, numRescueBoats(intArrayOf(3,2,2,1), 3))
    assertEquals(4, numRescueBoats(intArrayOf(3,5,3,4), 5))
}