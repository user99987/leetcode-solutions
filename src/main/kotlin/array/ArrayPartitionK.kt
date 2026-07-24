package array

/**
 * Easy
 *
 * Group 2n integers into n pairs such that the sum of min(ai, bi) for all i is maximized. Return
 * the maximized sum.
 */
class ArrayPartitionK {

    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()
        var maxSum = 0

        var i = 0
        while (i < nums.size) {
            maxSum += nums[i]
            i += 2
        }

        return maxSum
    }
}

