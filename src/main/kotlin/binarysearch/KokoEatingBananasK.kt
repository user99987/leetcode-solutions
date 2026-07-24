package binarysearch

import kotlin.math.max

/**
 * Medium
 *
 * Koko loves to eat bananas. Return the minimum integer k such that she can eat all the bananas
 * within h hours.
 */
class KokoEatingBananasK {

    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var maxP = 0
        var sumP = 0L
        for (pile in piles) {
            maxP = max(maxP, pile)
            sumP += pile
        }

        var low = ((sumP - 1) / h + 1).toInt()
        var high = maxP
        while (low < high) {
            val mid = low + (high - low) / 2
            if (canFinish(piles, mid, h)) {
                high = mid
            } else {
                low = mid + 1
            }
        }
        return low
    }

    private fun canFinish(piles: IntArray, speed: Int, h: Int): Boolean {
        var totalHours = 0
        for (pile in piles) {
            totalHours += (pile + speed - 1) / speed
        }
        return totalHours <= h
    }
}

