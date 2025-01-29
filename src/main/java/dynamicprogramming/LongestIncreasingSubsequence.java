package dynamicprogramming;

/**
 * Medium
 * <p>
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 * <p>
 * A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [10,9,2,5,3,7,101,18]
 * <p>
 * Output: 4
 * <p>
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [0,1,0,3,2,3]
 * <p>
 * Output: 4
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [7,7,7,7,7,7,7]
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 2500
 * -10^4 <= nums[i] <= 10^4
 */
public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        int left = 1, right = 1;
        for (int curr : nums) {
            int start = left, end = right;
            while (start + 1 < end) {
                int mid = start + (end - start) / 2;
                if (dp[mid] > curr) {
                    end = mid;
                } else {
                    start = mid;
                }
            }
            if (dp[start] > curr) {
                dp[start] = curr;
            } else if (curr > dp[start] && curr < dp[end]) {
                dp[end] = curr;
            } else if (curr > dp[end]) {
                dp[++end] = curr;
                right++;
            }
        }
        return right;
    }
}
