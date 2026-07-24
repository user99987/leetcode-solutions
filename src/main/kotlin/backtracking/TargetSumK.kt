package backtracking

import kotlin.math.abs

/**
 * Medium
 *
 * Return the number of different expressions, built by adding '+' or '-' before each integer in
 * nums, that evaluate to target.
 */
class TargetSumK {

    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        var sum = 0
        for (num in nums) {
            sum += num
        }
        if (abs(target) > sum || ((sum + target) and 1) == 1) {
            return 0
        }

        val subsetSum = (sum + target) / 2
        val ways = IntArray(subsetSum + 1)
        ways[0] = 1

        for (num in nums) {
            for (current in subsetSum downTo num) {
                ways[current] += ways[current - num]
            }
        }
        return ways[subsetSum]
    }
}

