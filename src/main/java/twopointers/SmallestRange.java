package twopointers;

import java.util.Arrays;

/**
 * Easy
 * <p>
 * You are given an integer array nums and an integer k.
 * <p>
 * In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.
 * <p>
 * The score of nums is the difference between the maximum and minimum elements in nums.
 * <p>
 * Return the minimum score of nums after applying the mentioned operation at most once for each index in it.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1], k = 0
 * <p>
 * Output: 0
 * <p>
 * Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [0,10], k = 2
 * <p>
 * Output: 6
 * <p>
 * Explanation: Change nums to be [2, 8]. The score is max(nums) - min(nums) = 8 - 2 = 6.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1,3,6], k = 3
 * <p>
 * Output: 0
 * <p>
 * Explanation: Change nums to be [4, 4, 4]. The score is max(nums) - min(nums) = 4 - 4 = 0.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^4
 * 0 <= nums[i] <= 10^4
 * 0 <= k <= 10^4
 */
public class SmallestRange {

    public int smallestRange(int[] nums, int k) {
        int min = Arrays.stream(nums).min().orElse(0);
        int max = Arrays.stream(nums).max().orElse(0);
        return Math.max(0, (max - k) - (min + k));
    }
}
