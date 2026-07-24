package twopointers

import kotlin.math.max

/**
 * Easy
 *
 * Return the minimum score of nums after applying the change-by-at-most-k operation at most
 * once for each index in it.
 */
class SmallestRangeK {

    fun smallestRange(nums: IntArray, k: Int): Int {
        val min = nums.minOrNull() ?: 0
        val max = nums.maxOrNull() ?: 0
        return max(0, (max - k) - (min + k))
    }
}

