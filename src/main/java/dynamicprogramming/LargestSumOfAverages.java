package dynamicprogramming;

/**
 * Medium
 * <p>
 * You are given an integer array nums and an integer k. You can partition the array into at most k non-empty adjacent subarrays. The score of a partition is the sum of the averages of each subarray.
 * <p>
 * Note that the partition must use every integer in nums, and that the score is not necessarily an integer.
 * <p>
 * Return the maximum score you can achieve of all the possible partitions. Answers within 10-6 of the actual answer will be accepted.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [9,1,2,3,9], k = 3
 * <p>
 * Output: 20.00000
 * <p>
 * Explanation:
 * <p>
 * The best choice is to partition nums into [9], [1, 2, 3], [9]. The answer is 9 + (1 + 2 + 3) / 3 + 9 = 20.
 * <p>
 * We could have also partitioned nums into [9, 1], [2], [3, 9], for example.
 * <p>
 * That partition would lead to a score of 5 + 2 + 6 = 13, which is worse.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4,5,6,7], k = 4
 * <p>
 * Output: 20.50000
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 104
 * 1 <= k <= nums.length
 */
public class LargestSumOfAverages {

    public double largestSumOfAverages(int[] nums, int k) {
        return helper(nums, k, 0, new Double[k + 1][nums.length]);
    }

    private double helper(int[] nums, int k, int idx, Double[][] memo) {
        if (memo[k][idx] != null) {
            return memo[k][idx];
        }
        double maxAvg = 0;
        double sum = 0;
        for (int i = idx; i <= nums.length - k; i++) {
            sum += nums[i];
            if (k - 1 > 0) {
                maxAvg = Math.max(maxAvg, (sum / (i - idx + 1)) + helper(nums, k - 1, i + 1, memo));
            } else if (i == nums.length - 1) {
                maxAvg = Math.max(maxAvg, sum / (i - idx + 1));
            }
        }
        memo[k][idx] = maxAvg;
        return maxAvg;
    }
}
