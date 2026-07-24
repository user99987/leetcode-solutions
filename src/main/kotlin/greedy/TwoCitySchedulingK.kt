package greedy

/**
 * Medium
 *
 * Return the minimum cost to fly every person to a city such that exactly n people arrive in
 * each city.
 */
class TwoCitySchedulingK {

    fun twoCitySchedCost(costs: Array<IntArray>): Int {
        val sorted = costs.sortedBy { it[0] - it[1] }
        var totalCost = 0
        val n = costs.size / 2

        for (i in 0 until n) {
            totalCost += sorted[i][0] + sorted[i + n][1]
        }
        return totalCost
    }
}

