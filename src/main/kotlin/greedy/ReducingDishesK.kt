package greedy

/**
 * Hard
 *
 * Return the maximum sum of like-time coefficient that the chef can obtain after dishes
 * preparation.
 */
class ReducingDishesK {

    fun maxSatisfaction(satisfaction: IntArray): Int {
        satisfaction.sort()
        var totalSatisfaction = 0
        var cumulativeSum = 0

        for (i in satisfaction.size - 1 downTo 0) {
            cumulativeSum += satisfaction[i]
            if (cumulativeSum <= 0) {
                break
            }
            totalSatisfaction += cumulativeSum
        }
        return totalSatisfaction
    }
}

