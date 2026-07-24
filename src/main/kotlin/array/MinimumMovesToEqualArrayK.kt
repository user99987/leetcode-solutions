package array

import kotlin.math.min

/**
 * Medium
 *
 * Return the minimum number of moves required to make all array elements equal, where one move
 * increments n - 1 elements by 1.
 */
class MinimumMovesToEqualArrayK {

    fun minMoves(nums: IntArray): Int {
        var min = nums[0]
        var sum = 0

        for (num in nums) {
            min = min(min, num)
            sum += num
        }

        return sum - min * nums.size
    }
}

