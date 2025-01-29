package array;

/**
 * Medium
 * <p>
 * Given an integer array nums and two integers firstLen and secondLen, return the maximum sum of elements in two non-overlapping subarrays with lengths firstLen and secondLen.
 * <p>
 * The array with length firstLen could occur before or after the array with length secondLen, but they have to be non-overlapping.
 * <p>
 * A subarray is a contiguous part of an array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [0,6,5,2,2,5,1,9,4], firstLen = 1, secondLen = 2
 * <p>
 * Output: 20
 * <p>
 * Explanation: One choice of subarrays is [9] with length 1, and [6,5] with length 2.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,8,1,3,2,1,8,9,0], firstLen = 3, secondLen = 2
 * <p>
 * Output: 29
 * <p>
 * Explanation: One choice of subarrays is [3,8,1] with length 3, and [8,9] with length 2.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [2,1,5,6,0,9,5,0,3,8], firstLen = 4, secondLen = 3
 * <p>
 * Output: 31
 * <p>
 * Explanation: One choice of subarrays is [5,6,0,9] with length 4, and [3,8] with length 3.
 * <p>
 * Constraints:
 * <p>
 * 1 <= firstLen, secondLen <= 1000
 * 2 <= firstLen + secondLen <= 1000
 * firstLen + secondLen <= nums.length <= 1000
 * 0 <= nums[i] <= 1000
 */
public class MaximumSumOfTwoNonOverlappingSubArrays {

    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int[] prefixMax = new int[nums.length];
        int[] suffixMax = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i >= firstLen) sum -= nums[i - firstLen];
            if (i >= firstLen - 1) prefixMax[i] = Math.max(prefixMax[Math.max(i - 1, 0)], sum);
        }

        sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            if (i <= nums.length - firstLen - 1) sum -= nums[i + firstLen];
            if (i <= nums.length - firstLen) suffixMax[i] = Math.max(suffixMax[Math.min(i + 1, nums.length - 1)], sum);
        }

        int maxSum = 0;
        sum = 0;
        for (int i = 0; i < secondLen - 1; i++) sum += nums[i];

        for (int i = secondLen - 1; i < nums.length; i++) {
            sum += nums[i];
            if (i >= secondLen) maxSum = Math.max(maxSum, prefixMax[i - secondLen] + sum);
            if (i < nums.length - 1) maxSum = Math.max(maxSum, suffixMax[i + 1] + sum);
            sum -= nums[i - secondLen + 1];
        }

        return maxSum;
    }
}
