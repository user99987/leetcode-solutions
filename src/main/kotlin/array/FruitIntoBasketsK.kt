package array

import kotlin.math.max

/**
 * Medium
 *
 * Given an integer array fruits, return the maximum number of fruits you can pick using two
 * baskets, each holding only one type of fruit (sliding window with at most 2 distinct values).
 */
class FruitIntoBasketsK {

    fun totalFruit(fruits: IntArray): Int {
        var lastFruit = -1
        var secondLastFruit = -1
        var lastFruitCount = 0
        var currentMax = 0
        var maxTotal = 0

        for (fruit in fruits) {
            currentMax = if (fruit == lastFruit || fruit == secondLastFruit) {
                currentMax + 1
            } else {
                lastFruitCount + 1
            }

            if (fruit == lastFruit) {
                lastFruitCount++
            } else {
                secondLastFruit = lastFruit
                lastFruit = fruit
                lastFruitCount = 1
            }

            maxTotal = max(maxTotal, currentMax)
        }

        return maxTotal
    }
}

