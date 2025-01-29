package dynamicprogramming;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Hard
 * <p>
 * Given an integer array nums and an integer k, return the maximum sum of a non-empty subsequence of that array such that for every two consecutive integers in the subsequence, nums[i] and nums[j], where i < j, the condition j - i <= k is satisfied.
 * <p>
 * A subsequence of an array is obtained by deleting some number of elements (can be zero) from the array, leaving the remaining elements in their original order.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [10,2,-10,5,20], k = 2
 * <p>
 * Output: 37
 * <p>
 * Explanation: The subsequence is [10, 2, 5, 20].
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [-1,-2,-3], k = 1
 * <p>
 * Output: -1
 * <p>
 * Explanation: The subsequence must be non-empty, so we choose the largest number.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [10,-2,-10,-5,20], k = 2
 * <p>
 * Output: 23
 * <p>
 * Explanation: The subsequence is [10, -2, -5, 20].
 * <p>
 * Constraints:
 * <p>
 * 1 <= k <= nums.length <= 10^5
 * -10^4 <= nums[i] <= 10^4
 */
public class ConstrainedSubsequenceSum {


    public int constrainedSubsetSum(int[] nums, int k) {
        int n = nums.length, maxSum = Integer.MIN_VALUE;
        Deque<int[]> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (!deque.isEmpty() && i - deque.peekFirst()[0] > k) {
                deque.pollFirst();
            }
            int current = nums[i] + (deque.isEmpty() ? 0 : Math.max(0, deque.peekFirst()[1]));
            maxSum = Math.max(maxSum, current);

            while (!deque.isEmpty() && deque.peekLast()[1] <= current) {
                deque.pollLast();
            }
            deque.offerLast(new int[]{i, current});
        }
        return maxSum;
    }
}
