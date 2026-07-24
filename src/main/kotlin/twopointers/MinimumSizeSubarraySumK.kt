package twopointers

/**
 * Medium
 *
 * Return the minimal length of a contiguous subarray of which the sum is greater than or equal
 * to target. If there is no such subarray, return 0 instead.
 */
class MinimumSizeSubarraySumK {

    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var sum = 0
        var min = Int.MAX_VALUE
        var left = 0
        for (right in nums.indices) {
            sum += nums[right]
            while (sum >= target) {
                min = minOf(min, right - left + 1)
                sum -= nums[left++]
            }
        }
        return if (min == Int.MAX_VALUE) 0 else min
    }
}

