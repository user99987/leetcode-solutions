package dynamicprogramming

/**
 * Medium
 *
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 *
 * A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
 *
 * Example 1:
 *
 * Input: nums = [10,9,2,5,3,7,101,18]
 *
 * Output: 4
 *
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 *
 * Example 2:
 *
 * Input: nums = [0,1,0,3,2,3]
 *
 * Output: 4
 *
 * Example 3:
 *
 * Input: nums = [7,7,7,7,7,7,7]
 *
 * Output: 1
 *
 * Constraints:
 *
 * 1 <= nums.length <= 2500
 * -10^4 <= nums[i] <= 10^4
 */
class LongestIncreasingSubsequenceK {

    fun lengthOfLIS(nums: IntArray?): Int {
        if (nums == null || nums.isEmpty()) {
            return 0
        }
        val dp = IntArray(nums.size + 1)
        for (i in 1 until dp.size) {
            dp[i] = Int.MAX_VALUE
        }
        var left = 1
        var right = 1
        for (curr in nums) {
            var start = left
            var end = right
            while (start + 1 < end) {
                val mid = start + (end - start) / 2
                if (dp[mid] > curr) {
                    end = mid
                } else {
                    start = mid
                }
            }
            if (dp[start] > curr) {
                dp[start] = curr
            } else if (curr > dp[start] && curr < dp[end]) {
                dp[end] = curr
            } else if (curr > dp[end]) {
                end++
                dp[end] = curr
                right++
            }
        }
        return right
    }
}

