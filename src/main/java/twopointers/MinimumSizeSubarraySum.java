package twopointers;

/**
 * Medium
 * <p>
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 * <p>
 * Example 1:
 * <p>
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * <p>
 * Output: 2
 * <p>
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 * <p>
 * Example 2:
 * <p>
 * Input: target = 4, nums = [1,4,4]
 * <p>
 * Output: 1
 * <p>
 * Example 3:
 * <p>
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * <p>
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * 1 <= target <= 109
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 105
 */
public class MinimumSizeSubarraySum {

    public static void main(String[] args) throws Exception {
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(new MinimumSizeSubarraySum().minSubArrayLen(7, nums));
    }

    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0, count = 0, min = Integer.MAX_VALUE;
        for (int i = 0, j = 0; j < nums.length; ) {
            if (nums[j] >= s) {
                return 1;
            } else {
                sum += nums[j];
                count++;
                if (sum >= s) {
                    min = Math.min(min, count);
                    while (j > i) {
                        sum -= nums[i];
                        count--;
                        i++;
                        if (sum < s) break;
                        min = Math.min(min, count);
                    }
                }
            }
            j++;
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
}
