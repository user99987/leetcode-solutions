package dynamicprogramming

/**
 * Hard
 *
 * Given an array nums which consists of non-negative integers and an integer m, you can split the array into m non-empty continuous subarrays.
 *
 * Write an algorithm to minimize the largest sum among these m subarrays.
 *
 * Example 1:
 *
 * Input: nums = [7,2,5,10,8], m = 2
 *
 * Output: 18
 *
 * Explanation:
 *
 * There are four ways to split nums into two subarrays.
 * The best way is to split it into [7,2,5] and [10,8],
 * where the largest sum among the two subarrays is only 18.
 * Example 2:
 *
 * Input: nums = [1,2,3,4,5], m = 2
 *
 * Output: 9
 *
 * Example 3:
 *
 * Input: nums = [1,4,4], m = 3
 *
 * Output: 4
 *
 * Constraints:
 *
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] <= 10^6
 * 1 <= m <= min(50, nums.length)
 */
class SplitArrayLargestSumK {

    fun splitArray(nums: IntArray, m: Int): Int {
        var left = 0
        var right = 0
        for (num in nums) {
            left = maxOf(left, num)
            right += num
        }

        while (left < right) {
            val mid = left + (right - left) / 2
            if (canSplit(nums, m, mid)) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return left
    }

    private fun canSplit(nums: IntArray, m: Int, maxSum: Int): Boolean {
        var count = 1
        var sum = 0
        for (num in nums) {
            if (sum + num > maxSum) {
                count++
                sum = num
                if (count > m) {
                    return false
                }
            } else {
                sum += num
            }
        }
        return true
    }
}

