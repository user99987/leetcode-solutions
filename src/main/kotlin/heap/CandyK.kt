package heap

import kotlin.math.max

/**
 * Hard
 *
 * Return the minimum number of candies you need to have to distribute the candies to the
 * children, subject to the higher-rating-gets-more-candy rule.
 */
class CandyK {

    fun candy(ratings: IntArray): Int {
        val n = ratings.size
        val candies = IntArray(n) { 1 }

        for (i in 1 until n) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1
            }
        }

        var totalCandies = candies[n - 1]
        for (i in n - 2 downTo 0) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = max(candies[i], candies[i + 1] + 1)
            }
            totalCandies += candies[i]
        }

        return totalCandies
    }
}

