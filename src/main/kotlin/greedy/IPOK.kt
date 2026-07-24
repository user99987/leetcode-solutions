package greedy

import java.util.PriorityQueue

/**
 * Hard
 *
 * Pick a list of at most k distinct projects from given projects to maximize your final capital,
 * and return the final maximized capital.
 */
class IPOK {

    fun findMaximizedCapital(k: Int, w: Int, profits: IntArray, capital: IntArray): Int {
        var capitalW = w
        val minCapital = PriorityQueue<IntArray>(compareBy { it[1] })
        val maxProfit = PriorityQueue<Int>(compareByDescending { it })

        for (i in profits.indices) {
            minCapital.offer(intArrayOf(profits[i], capital[i]))
        }

        for (i in 0 until k) {
            while (minCapital.isNotEmpty() && minCapital.peek()[1] <= capitalW) {
                maxProfit.offer(minCapital.poll()[0])
            }
            if (maxProfit.isEmpty()) {
                break
            }
            capitalW += maxProfit.poll()
        }

        return capitalW
    }
}

