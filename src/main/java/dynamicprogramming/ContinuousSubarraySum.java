package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

/**
 * Medium
 * <p>
 * Given an integer array nums and an integer k, return true if nums has a continuous subarray of size at least two whose elements sum up to a multiple of k, or false otherwise.
 * <p>
 * An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [23,2,4,6,7], k = 6
 * <p>
 * Output: true
 * <p>
 * Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [23,2,6,4,7], k = 6
 * <p>
 * Output: true
 * <p>
 * Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42. 42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [23,2,6,4,7], k = 13
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * 0 <= nums[i] <= 10^9
 * 0 <= sum(nums[i]) <= 2^31 - 1
 * 1 <= k <= 2^31 - 1
 */
public class ContinuousSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;
            if (remainder < 0) remainder += k; // Handle negative remainders

            if (remainderMap.containsKey(remainder)) {
                if (i - remainderMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                remainderMap.put(remainder, i);
            }
        }
        return false;
    }
}
