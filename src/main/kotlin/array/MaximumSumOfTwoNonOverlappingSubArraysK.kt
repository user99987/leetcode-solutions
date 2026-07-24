package array

import kotlin.math.max
import kotlin.math.min

/**
 * Medium
 *
 * Return the maximum sum of elements in two non-overlapping subarrays with lengths firstLen and
 * secondLen.
 */
class MaximumSumOfTwoNonOverlappingSubArraysK {

    fun maxSumTwoNoOverlap(nums: IntArray, firstLen: Int, secondLen: Int): Int {
        val prefixMax = IntArray(nums.size)
        val suffixMax = IntArray(nums.size)
        var sum = 0

        for (i in nums.indices) {
            sum += nums[i]
            if (i >= firstLen) sum -= nums[i - firstLen]
            if (i >= firstLen - 1) prefixMax[i] = max(prefixMax[max(i - 1, 0)], sum)
        }

        sum = 0
        for (i in nums.size - 1 downTo 0) {
            sum += nums[i]
            if (i <= nums.size - firstLen - 1) sum -= nums[i + firstLen]
            if (i <= nums.size - firstLen) {
                suffixMax[i] = max(suffixMax[min(i + 1, nums.size - 1)], sum)
            }
        }

        var maxSum = 0
        sum = 0
        for (i in 0 until secondLen - 1) sum += nums[i]

        for (i in secondLen - 1 until nums.size) {
            sum += nums[i]
            if (i >= secondLen) maxSum = max(maxSum, prefixMax[i - secondLen] + sum)
            if (i < nums.size - 1) maxSum = max(maxSum, suffixMax[i + 1] + sum)
            sum -= nums[i - secondLen + 1]
        }

        return maxSum
    }
}

