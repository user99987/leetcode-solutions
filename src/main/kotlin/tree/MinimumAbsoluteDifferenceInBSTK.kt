package tree

import java.util.TreeSet
import kotlin.math.abs
import kotlin.math.min

/**
 * Medium
 *
 * Find the minimum absolute difference between two elements in the array that are at least x
 * indices apart.
 */
class MinimumAbsoluteDifferenceInBSTK {

    fun minAbsoluteDifference(nums: List<Int>, x: Int): Int {
        val set = TreeSet<Int>()
        var minDiff = Int.MAX_VALUE

        for (i in x until nums.size) {
            set.add(nums[i - x])

            val current = nums[i]
            val lower = set.floor(current)
            val higher = set.ceiling(current)

            if (lower != null) minDiff = min(minDiff, abs(lower - current))
            if (higher != null) minDiff = min(minDiff, abs(higher - current))
        }

        return minDiff
    }
}

