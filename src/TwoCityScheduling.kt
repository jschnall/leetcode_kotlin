fun twoCitySchedCost(costs: Array<IntArray>): Int {
    var tot = 0

    costs.sortBy { it[0] - it[1] }
    for (i in 0 until costs.size / 2) {
        tot += costs[i][0]
    }
    for (j in costs.size / 2 until costs.size) {
        tot += costs[j][1]
    }

    return tot
}